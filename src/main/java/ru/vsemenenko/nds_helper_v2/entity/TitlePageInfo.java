package ru.vsemenenko.nds_helper_v2.entity;

import lombok.Getter;
import lombok.Setter;
import ru.vsemenenko.nds_helper_v2.entity.companyInfo.CompanyInfo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Getter
@Setter
@Entity
public class TitlePageInfo{

    @Id
    private Long id;

    private String fileName;

    @OneToOne
    private CompanyInfo companyInfo;

    private Period period;

    private Integer year;

    @OneToOne
    private PurchaseBookInfo purchaseBookFileName;

    @OneToOne
    private SaleBookInfo salesBookFileName;

    private Integer corNumber;
}
