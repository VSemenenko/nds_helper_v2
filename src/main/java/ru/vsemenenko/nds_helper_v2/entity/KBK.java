package ru.vsemenenko.nds_helper_v2.entity;

public enum KBK {

    NDS_SUM("18210301000011000110") ;

    private String title;

    KBK(String title) {
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
