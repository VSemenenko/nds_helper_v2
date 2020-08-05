package ru.vsemenenko.nds_helper_v2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
public class CompanyInfo {
    @JsonProperty("ЮЛ")
    private ULInfo ulInfo;
    
    @JsonProperty("ИП")
    private IPInfo ipInfo;

    private String okato;

    private String oktmo;
}
