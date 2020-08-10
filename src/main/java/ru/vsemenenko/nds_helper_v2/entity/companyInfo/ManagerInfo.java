package ru.vsemenenko.nds_helper_v2.entity.companyInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ManagerInfo {

    @JsonProperty("ВидДолжн")
    private String vidDolzh;

    @JsonProperty("Должн")
    private String dolzh;

    @JsonProperty("ФИОПолн")
    private String fioFull;

    @JsonProperty("ИННФЛ")
    private String innFL;

    @JsonProperty("ОГРНИП")
    private String ogrnIP;

    @JsonProperty("ПризнНедДанДолжнФЛ")
    private PriznNedDanDolzhnFLInfo priznNedDanDolzhnFLInfo;

    @JsonProperty("ДатаНачДискв")
    private String dataNachDiskv;

    @JsonProperty("ДатаОкончДискв")
    private String dataOkonchDiskv;

    @JsonProperty("Дата")
    private String date;


}
