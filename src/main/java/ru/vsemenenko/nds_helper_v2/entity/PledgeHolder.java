package ru.vsemenenko.nds_helper_v2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PledgeHolder {

    @JsonProperty("ОГРН")
    private String ogrn;

    @JsonProperty("ИНН")
    private String inn;

    @JsonProperty("НаимСокрЮЛ")
    private String nameShortUL;

    @JsonProperty("Статус")
    private String status;

    @JsonProperty("ФИОПолн")
    private String fioFull;

    @JsonProperty("ИННФЛ")
    private String innFL;

    @JsonProperty("НаимПолнЮЛ")
    private String nameFull;

    @JsonProperty("ОКСМ")
    private String oksm;

    @JsonProperty("РегНомер")
    private String regNumber;

    @JsonProperty("ДатаРег")
    private String dateReg;

    @JsonProperty("АдресПолн")
    private String addressFull;

    @JsonProperty("ВидОбременения")
    private String vidObremeneniya;

    @JsonProperty("СрокОбременения")
    private String srokObremeneniya;

    @JsonProperty("Дата")
    private String date;
}
