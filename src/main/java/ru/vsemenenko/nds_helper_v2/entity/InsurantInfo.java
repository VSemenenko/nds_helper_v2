package ru.vsemenenko.nds_helper_v2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InsurantInfo {

    @JsonProperty("РегНомФСС")
    private String regNomFSS;

    @JsonProperty("ДатаРегФСС")
    private String dataRegFSS;

    @JsonProperty("КодФСС")
    private String kodFSS;
}
