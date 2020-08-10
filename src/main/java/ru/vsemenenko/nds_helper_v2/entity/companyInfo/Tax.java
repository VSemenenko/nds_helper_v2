package ru.vsemenenko.nds_helper_v2.entity.companyInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tax {

    @JsonProperty("НаимНалог")
    private String taxName;

    @JsonProperty("СумУплНал")
    private String taxSum;

    @JsonProperty("СумНедНалог")
    private String missingTaxSum;

    @JsonProperty("СумПени")
    private String penaltiesSum;

    @JsonProperty("СумШтраф")
    private String fineSum;

    @JsonProperty("ОбщСумНедоим")
    private String commonMissingSum;
}
