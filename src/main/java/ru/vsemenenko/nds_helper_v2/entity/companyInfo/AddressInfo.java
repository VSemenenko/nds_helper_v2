package ru.vsemenenko.nds_helper_v2.entity.companyInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressInfo {
    @JsonProperty("КодРегион")
    private String kodRegion;

    @JsonProperty("Индекс")
    private String index;

    @JsonProperty("АдресПолн")
    private String addressPoln;

    @JsonProperty("Дата")
    private String data;

    @JsonProperty("АдресДетали")
    private AddressDetailsInfo addressDetailsInfo;

    @JsonProperty("ПризнНедАдресЮЛ")
    private InvalidAddressInfo invalidAddressInfo;

    @JsonProperty("РешИзмАдрес")
    private ChangeAddressDecisionInfo changeAddressDecisionInfo;
}
