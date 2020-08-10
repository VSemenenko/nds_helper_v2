package ru.vsemenenko.nds_helper_v2.entity.companyInfo;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FounderInfo {

    @JsonProperty("УчрЮЛ")
    private ULObjectInfo founderULInfo;

    @JsonProperty("УчрИН")
    private FounderForeignUL founderForeignUL;

    @JsonProperty("УчрФЛ")
    private FounderFL founderFL;

    @JsonProperty("УчрРФСубМО")
    private String ychrRFSybMO;

    @JsonProperty("СвОргОсущПр")
    private SvOrgOsyshPr svOrgOsyshPr;

    @JsonProperty("УчрПИФ")
    private ULObjectInfo founderPIFInfo;

    @JsonProperty("СуммаУК")
    private String sumUK;

    @JsonProperty("Процент")
    private String percent;

    @JsonProperty("ПризнНедДанУчр")
    private PriznNedDanYchrInfo priznNedDanYchrInfo;

    @JsonProperty("Дата")
    private String date;

    @JsonProperty("Залогодержатели")
    private List<PledgeHolder> pledgeHolders;
}
