package ru.vsemenenko.nds_helper_v2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OkvedInfo {

    @JsonProperty("Код")
    private String code;

    @JsonProperty("Текст")
    private String text;
}
