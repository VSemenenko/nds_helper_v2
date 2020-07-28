package ru.vsemenenko.nds_helper_v2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LicenseInfo {

    @JsonProperty("НомерЛиц")
    private String licenseNumber;

    @JsonProperty("ВидДеятельности")
    private String businessType;

    @JsonProperty("ДатаНачала")
    private String startDate;

    @JsonProperty("ДатаОконч")
    private String endDate;

    @JsonProperty("МестоДейств")
    private String place;
}
