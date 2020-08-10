package ru.vsemenenko.nds_helper_v2.entity.companyInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangeAddressDecisionInfo {

    @JsonProperty("НовыйАдрес")
    private String newAddress;

    @JsonProperty("ДатаРеш")
    private String decisionDate;
}
