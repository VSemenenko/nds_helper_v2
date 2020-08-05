package ru.vsemenenko.nds_helper_v2.entity;

import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.Setter;
import com.opencsv.bean.CsvToBean;
import org.apache.logging.log4j.util.Strings;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

@Setter
@Getter
public class DealInfo {

    @CsvBindByName(column = "покупатель")
    private String byerName;

    @CsvBindByName(column = "инн_покупателя")
    private String byerInn;

    @CsvBindByName(column = "дата_сделки")
    private String dateString;

    @CsvBindByName(column = "назначение_сделки")
    private String dealAim;

    @CsvBindByName(column = "ед.изм")
    private String unit;

    @CsvBindByName(column = "кол-во")
    private String quantity;

    @CsvBindByName(column = "цена_за_шт")
    private String pricePerUnit;

    @CsvBindByName(column = "сумма_с_ндс")
    private String sumWithNDS;

    @CsvBindByName(column = "НДС_10%")
    private String nds10;

    @CsvBindByName(column = "НДС_18%")
    private String nds18;

    @CsvBindByName(column = "НДС_20%")
    private String nds20;

    @CsvBindByName(column = "счет_фактура")
    private String invoiceNumber;

    @CsvBindByName(column = "продавец")
    private String sellerName;

    @CsvBindByName(column = "инн_продавеца")
    private String sellerInn;
}
