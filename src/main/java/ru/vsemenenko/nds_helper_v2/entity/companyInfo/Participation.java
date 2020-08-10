package ru.vsemenenko.nds_helper_v2.entity.companyInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Participation {
    @JsonProperty("ОГРН")
    private String ogrn;

    @JsonProperty("ИНН")
    private String inn;

    @JsonProperty("НаимСокрЮЛ")
    private String nameShortUL;

    @JsonProperty("Статус")
    private String status;

    @JsonProperty("Процент")
    private String percent;

    @JsonProperty("СуммаУК")
    private String sumUK;
}
