package ru.vsemenenko.nds_helper_v2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class PurchaseInvoiceInfo {

    @Id
    private Long id;

    private String number;

    private LocalDate date;

    private Double purchaseSum;

    private Double taxSum;
}
