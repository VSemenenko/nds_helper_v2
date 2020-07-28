package ru.vsemenenko.nds_helper_v2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FounderForeignUL {

    @JsonProperty("НаимПолнЮЛ")
    private String nameFullUL;

    @JsonProperty("ОКСМ")
    private String oksm;

    @JsonProperty("РегНомер")
    private String regNumber;

    @JsonProperty("ДатаРег")
    private String dateReg;

    @JsonProperty("АдресПолн")
    private String addressFull;
}
