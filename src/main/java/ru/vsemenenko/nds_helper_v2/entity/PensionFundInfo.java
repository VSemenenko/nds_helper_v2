package ru.vsemenenko.nds_helper_v2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PensionFundInfo {

    @JsonProperty("РегНомПФ")
    private String regNomPF;

    @JsonProperty("ДатаРегПФ")
    private String dataRegPF;

    @JsonProperty("КодПФ")
    private String kodPF;
}
