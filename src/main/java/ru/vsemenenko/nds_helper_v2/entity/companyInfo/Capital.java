package ru.vsemenenko.nds_helper_v2.entity.companyInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Capital {

    @JsonProperty("ВидКап")
    private String vidKap;

    @JsonProperty("СумКап")
    private String sumKap;

    @JsonProperty("Дата")
    private String data ;
}
