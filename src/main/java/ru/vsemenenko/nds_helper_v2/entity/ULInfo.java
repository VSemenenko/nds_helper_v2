package ru.vsemenenko.nds_helper_v2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Getter
@Setter
public class ULInfo {

    @Id
    private Long id;

    @JsonProperty("ИНН")
    private String inn;

    @JsonProperty("КПП")
    private String kpp;

    @JsonProperty("ОГРН")
    private String ogrn;

    @JsonProperty("НаимСокрЮЛ")
    private String naimSokrUL;

    @JsonProperty("НаимПолнЮЛ")
    private String naimPolnUL;

    @JsonProperty("ДатаРег")
    private String dataReg;

    @JsonProperty("ОКОПФ")
    private String okpf;

    @JsonProperty("Статус")
    private String status;

    @JsonProperty("СтатусДата")
    private String statusData;

    @JsonProperty("СпОбрЮЛ")
    private String spObrUL;

    @JsonProperty("ДатаПрекр")
    private String dataPrekr;

    @JsonProperty("НО")
    private TaxDepartmentInfo taxDepartmentInfo;

    @JsonProperty("ПФ")
    private PensionFundInfo pensionFundInfo;

    @JsonProperty("ФСС")
    private InsurantInfo insurantInfo;

    @JsonProperty("Капитал")
    private Capital capital;

    @JsonProperty("Адрес")
    private AddressInfo addressInfo;

    @JsonProperty("Руководитель")
    private ManagerInfo managerInfo;

    @JsonProperty("Учредители")
    private List<FounderInfo> founders;

    @JsonProperty("Предшественники")
    private List<ULObjectInfo> predshestvenniki;

    @JsonProperty("Преемники")
    private List<ULObjectInfo> preemniki;

    @JsonProperty("УправлОрг")
    private List<ULObjectInfo> ypravlOrg;

    @JsonProperty("ДержРеестрАО")
    private List<ULObjectInfo> derzhReestrAO;

    @JsonProperty("Участники в реорганизации") //todo переименовать в имя поля
    private List<ULObjectInfo> ychastnikiVReorganizacii;

    @JsonProperty("НомТел")
    private String nomTel;

    @JsonProperty("E-mail")
    private String email;

    @JsonProperty("ОснВидДеят")
    private OkvedInfo generalOkved;

    @JsonProperty("ДопВидДеят")
    private List<OkvedInfo> additionalOkveds;

    @JsonProperty("СПВЗ")
    private List<Spvz> spvz;

    @JsonProperty("Филиалы")
    private List<BranchOfficeInfo> branchOfficeInfos;

    @JsonProperty("ОткрСведения")
    private OpenInfo openInfo;

    @JsonProperty("Лицензии")
    private List<LicenseInfo> licenses;

    @JsonProperty("Участия")
    private List<Participation> participations;
}
