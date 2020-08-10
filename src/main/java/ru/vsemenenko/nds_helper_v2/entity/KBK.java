package ru.vsemenenko.nds_helper_v2.entity;

public enum KBK {

    NDS_SUM("18210301000011000110") ;

    private String value;

    KBK(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
