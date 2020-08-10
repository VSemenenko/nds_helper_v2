package ru.vsemenenko.nds_helper_v2.entity.companyInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import ru.vsemenenko.nds_helper_v2.entity.companyInfo.CompanyInfo;

import java.util.List;

@Getter
@Setter
public class CompanyInfoResponse {
    @JsonProperty("items")
    List<CompanyInfo> companyInfos;
}
