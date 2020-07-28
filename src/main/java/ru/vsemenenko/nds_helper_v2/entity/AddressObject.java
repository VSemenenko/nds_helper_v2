package ru.vsemenenko.nds_helper_v2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressObject {
    @JsonProperty("Тип")
    private String type;

    @JsonProperty("Наим")
    private String name;
}
