package ru.vsemenenko.nds_helper_v2.entity.companyInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

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
