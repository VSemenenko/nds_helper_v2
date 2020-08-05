package ru.vsemenenko.nds_helper_v2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class PurchaseBookInfo {

    @Id
    private Long id;

    private String fileName;

}
