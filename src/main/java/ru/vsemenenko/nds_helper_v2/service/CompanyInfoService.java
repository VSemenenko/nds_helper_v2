package ru.vsemenenko.nds_helper_v2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import ru.vsemenenko.nds_helper_v2.config.CompanyInfoConfig;
import ru.vsemenenko.nds_helper_v2.entity.companyInfo.CompanyInfo;
import ru.vsemenenko.nds_helper_v2.entity.companyInfo.CompanyInfoResponse;

import java.net.URISyntaxException;

@Service
@AllArgsConstructor
public class CompanyInfoService {

    private final CompanyInfoConfig companyInfoConfig;

    private final RestTemplate restTemplate;

    public CompanyInfo getCompanyInfoFromFNS(String ogrn) throws URISyntaxException {
        CompanyInfoResponse companyInfoResponse = restTemplate.getForObject(getRequestUrlToFns(ogrn), CompanyInfoResponse.class);
        setOkatoAndOktmo(companyInfoResponse.getCompanyInfos().get(0));
        return companyInfoResponse.getCompanyInfos().get(0);
    }

    private String getRequestUrlToFns(String ogrn) throws URISyntaxException {
        UriComponentsBuilder builder = UriComponentsBuilder.newInstance();
      builder.scheme("https")
                .host(companyInfoConfig.getIfnsURL())
                .path(companyInfoConfig.getIfnsUrlPath())
                .queryParam("req", ogrn)
                .queryParam("key", companyInfoConfig.getIfnsAPIkey())
                .build();
        return builder.toUriString();
    }

    private void setOkatoAndOktmo(CompanyInfo companyInfo) throws URISyntaxException {
        String fiasResponse = restTemplate.getForObject(getRequestUrlToFias(companyInfo.getUlInfo().getAddressInfo().getIndex()), String.class);
        int indexOfOkato = fiasResponse.indexOf("okato");
        int indexOfOktmo = fiasResponse.indexOf("oktmo");
        String okato = fiasResponse.substring( indexOfOkato+8, indexOfOkato+19);
        String oktmo = fiasResponse.substring(indexOfOktmo+8, indexOfOktmo+16);
        companyInfo.setOkato(okato);
        companyInfo.setOktmo(oktmo);
    }

    private String getRequestUrlToFias(String index) throws URISyntaxException {
        UriComponentsBuilder builder = UriComponentsBuilder.newInstance();
        builder.scheme("https")
                .host(companyInfoConfig.getFiasUrl())
                .path(companyInfoConfig.getFiasURLPath())
                .queryParam("contentType", companyInfoConfig.getFiasContentType())
                .queryParam("limit", companyInfoConfig.getFiasLimit())
                .queryParam("withParent", companyInfoConfig.getFiasWithParent())
                .queryParam("zip", index)
                .build();
        return builder.toUriString();
    }
}
