package ru.vsemenenko.nds_helper_v2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndustryIndicator {

    @JsonProperty("НалогНагрузка")
    private String taxLoad;

    @JsonProperty("Рентабельность")
    private String profitability;
}
