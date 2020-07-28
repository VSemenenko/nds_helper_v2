package ru.vsemenenko.nds_helper_v2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ULObjectInfo {
    @JsonProperty("ОГРН")
    private String ogrn;

    @JsonProperty("ИНН")
    private String inn;

    @JsonProperty("НаимСокрЮЛ")
    private String nameShortUL;

    @JsonProperty("Статус")
    private String status;
}
