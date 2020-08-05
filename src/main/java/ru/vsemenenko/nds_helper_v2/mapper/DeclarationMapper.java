package ru.vsemenenko.nds_helper_v2.mapper;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import nds.schema.first_page.FIOTip;
import nds.schema.first_page.ObjectFactory;
import nds.schema.first_page.TitlePage;
import ru.vsemenenko.nds_helper_v2.entity.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;


public class DeclarationMapper {

    private final ObjectFactory titlePageObjectFactory = new ObjectFactory();
    private final TitlePage.VersForm versForm = TitlePage.VersForm.FIVE_DOT_ZERO_SIX;
    private final TitlePage.PriznNal812 priznNal812 = TitlePage.PriznNal812.ONE;
    private final TitlePage.PriznNal8 priznNal8 = TitlePage.PriznNal8.ONE;
    private final TitlePage.PriznNal9 priznNal9 = TitlePage.PriznNal9.ONE;
    private final TitlePage.PriznNal81 priznNal81 = TitlePage.PriznNal81.ZERO;
    private final TitlePage.PriznNal91 priznNal91 = TitlePage.PriznNal91.ZERO;
    private final TitlePage.PriznNal10 priznNal10 = TitlePage.PriznNal10.ZERO;
    private final TitlePage.PriznNal11 priznNal11 = TitlePage.PriznNal11.ZERO;
    private final TitlePage.PriznNal12 priznNal12 = TitlePage.PriznNal12.ZERO;
    private final TitlePage.TitlePageDocument.KND knd = TitlePage.TitlePageDocument.KND.ONE_ONE_FIVE_ONE_ZERO_ZERO_ONE;
    private final TitlePage.TitlePageDocument.PoMesty poMesty = TitlePage.TitlePageDocument.PoMesty.TWO_HUNDRED_FOURTEEN;


    public TitlePage mapTitlePageInfoToTitlePage(TitlePageInfo titlePageInfo){
        TitlePage titlePage = titlePageObjectFactory.createTitlePage();
        titlePage.setIdFajl(titlePageInfo.getFileName());
        titlePage.setVersProg("Налоговый помощник");
        titlePage.setVersForm(versForm);
        titlePage.setPriznNal812(priznNal812);
        titlePage.setPriznNal8(priznNal8);
        titlePage.setPriznNal9(priznNal9);
        titlePage.setPriznNal81(priznNal81);
        titlePage.setPriznNal91(priznNal91);
        titlePage.setPriznNal10(priznNal10);
        titlePage.setPriznNal11(priznNal11);
        titlePage.setPriznNal12(priznNal12);
        return titlePage;
    }

    private TitlePage.TitlePageDocument getTitlePageDocument(TitlePageInfo titlePageInfo){
        TitlePage.TitlePageDocument document = titlePageObjectFactory.createTitlePageTitlePageDocument();
        document.setKND(knd);
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        document.setDataDok(date);
        document.setPeriod(getPeriod(titlePageInfo.getPeriod()));
        document.setOtcetGod(getYear(titlePageInfo));
        document.setKodNO(getTaxDepartmentCode(titlePageInfo));
        document.setNomKorr(BigInteger.valueOf(titlePageInfo.getCorNumber()));
        document.setPoMesty(poMesty);
        document.setSvNP(getSvNP(titlePageInfo));
//        document.setPodpisant();
        document.setNDS(getNDS(titlePageInfo));
        return document;
    }

    private TitlePage.TitlePageDocument.Podpisant getPodpisant(TitlePageInfo titlePageInfo){
        TitlePage.TitlePageDocument.Podpisant podpisant = titlePageObjectFactory.createTitlePageTitlePageDocumentPodpisant();
        podpisant.setPrPodp("1");
        List<String> fioInfo = separateFIO(titlePageInfo.getCompanyInfo().getUlInfo().getManagerInfo().getFioFull());
        FIOTip fio = titlePageObjectFactory.createFIOTip();
        fio.setFamilia(fioInfo.get(0));
        fio.setIma(fioInfo.get(1));
        fio.setOtcestvo(fioInfo.get(2));
        podpisant.setFIO(fio);
        return podpisant;
    }

    private FIOTip getFio(TitlePageInfo titlePageInfo){
        FIOTip fio = titlePageObjectFactory.createFIOTip();
        ManagerInfo managerInfo = titlePageInfo.getCompanyInfo().getUlInfo().getManagerInfo();
//        fio.setFamilia(managerInfo.get);
        return fio;
    }


    private TitlePage.TitlePageDocument.NDS getNDS(TitlePageInfo titlePageInfo){
        TitlePage.TitlePageDocument.NDS nds = titlePageObjectFactory.createTitlePageTitlePageDocumentNDS();
        return nds;
    }

    private TitlePage.TitlePageDocument.SvNP getSvNP(TitlePageInfo titlePageInfo){
        TitlePage.TitlePageDocument.SvNP svNP = titlePageObjectFactory.createTitlePageTitlePageDocumentSvNP();
        svNP.setOKVED(titlePageInfo.getCompanyInfo().getUlInfo().getGeneralOkved().getCode());
        svNP.setNPUL(getNpUL(titlePageInfo));
        return svNP;
    }

    private TitlePage.TitlePageDocument.SvNP.NPUL getNpUL(TitlePageInfo titlePageInfo){
        TitlePage.TitlePageDocument.SvNP.NPUL npul = titlePageObjectFactory.createTitlePageTitlePageDocumentSvNPNPUL();
        ULInfo ulInfo = titlePageInfo.getCompanyInfo().getUlInfo();
        npul.setINNUL(ulInfo.getInn());
        npul.setKPP(ulInfo.getKpp());
        npul.setNaimOrg(ulInfo.getNaimPolnUL());
        return npul;
    }

    private TitlePage.TitlePageDocument.Period getPeriod(Period period){
        return TitlePage.TitlePageDocument.Period.fromValue(period.value());
    }

    private XMLGregorianCalendar getYear(TitlePageInfo titlePageInfo){
        XMLGregorianCalendar xmlGregorianCalendar = new XMLGregorianCalendarImpl();
        xmlGregorianCalendar.setYear(titlePageInfo.getYear());
        return xmlGregorianCalendar;
    }

    private String getTaxDepartmentCode(TitlePageInfo titlePageInfo){
        return titlePageInfo.getCompanyInfo().getUlInfo().getTaxDepartmentInfo().getUchet().substring(0, 4);
    }

    private List<String> separateFIO(String fio){
        return Arrays.asList(fio.split(" "));
    }
}
