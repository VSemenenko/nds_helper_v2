package ru.vsemenenko.nds_helper_v2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDetailsInfo {

    @JsonProperty("Регион")
    private AddressObject region;

    @JsonProperty("Город")
    private AddressObject city;

    @JsonProperty("Район")
    private AddressObject district;

    @JsonProperty("НаселПункт")
    private AddressObject naselPunct;

    @JsonProperty("Улица")
    private AddressObject street;

    @JsonProperty("Дом")
    private String house;

    @JsonProperty("Корпус")
    private String korpus;

    @JsonProperty("Кварт")
    private String flat;
}
