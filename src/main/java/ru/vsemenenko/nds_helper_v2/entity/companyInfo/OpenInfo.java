package ru.vsemenenko.nds_helper_v2.entity.companyInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OpenInfo {

    @JsonProperty("КолРаб")
    private String employNumber;

    @JsonProperty("СведСНР")
    private String svedSNR;

    @JsonProperty("ПризнУчКГН")
    private String priznYchKGN;

    @JsonProperty("Налоги")
    private List<Tax> taxes;

    @JsonProperty("СумДоход")
    private String incomeSum;

    @JsonProperty("СумРасход")
    private String costSum;

    @JsonProperty("ОтраслевыеПок")
    private IndustryIndicator industryIndicator;

    @JsonProperty("Дата")
    private String date;
}
