package ru.vsemenenko.nds_helper_v2.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import ru.vsemenenko.nds_helper_v2.entity.CompanyInfo;
import ru.vsemenenko.nds_helper_v2.service.CompanyInfoService;
import ru.vsemenenko.nds_helper_v2.service.CsvParser;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
public class RestController {

    private CompanyInfoService companyInfoService;

    private CsvParser csvParser;

    @PostMapping(value = "/")
    public ResponseEntity<String> analyzeText(@RequestParam("ogrn") String ogrn) throws IOException, URISyntaxException {
        CompanyInfo companyInfo = companyInfoService.getCompanyInfoFromFNS(ogrn);
        return ResponseEntity.ok(companyInfo.getUlInfo().getInn());
    }

    @PostMapping(value = "/upload")
    public ResponseEntity<String> uploadCSV(@RequestParam("file") MultipartFile multipartFile) throws Exception {
        csvParser.parseCsvAsMultipartFile(multipartFile);
        return ResponseEntity.ok("файл обрабатывается");
    }

    @PostMapping(value = "/modeTwo")
    public ResponseEntity<String> modeTwo(@RequestParam("byerInn") String byerInn,
                                          @RequestParam("sum") Integer sum,
                                          @RequestParam("period") Integer period,
                                          @RequestParam("sellersInn") List<String> sellersInn){
        return ResponseEntity.ok("декларации формируются");
    }


}
