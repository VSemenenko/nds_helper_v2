package ru.vsemenenko.nds_helper_v2.entity;

public enum KND {
    STANDART_CODE("1151001");

    String title;

    KND(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
