package ru.vsemenenko.nds_helper_v2.entity.companyInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaxDepartmentInfo {

    @JsonProperty("Рег")
    private String reg;

    @JsonProperty("РегДата")
    private String regData;

    @JsonProperty("Учет")
    private String uchet;

    @JsonProperty("УчетДата")
    private String uchetData;
}
