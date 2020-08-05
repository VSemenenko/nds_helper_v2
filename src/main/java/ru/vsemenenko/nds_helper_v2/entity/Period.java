package ru.vsemenenko.nds_helper_v2.entity;

public enum Period {
    JANUARY("01"),
    FEBRUARY("02"),
    MARCH("03"),
    APRIL("04"),
    MAY("05"),
    JUNE("06"),
    JULY("07"),
    AUGUST("08"),
    SEPTEMBER("09"),
    OCTOBER("10"),
    NOVEMBER("11"),
    DECEMBER("12"),
    FIRST_QUARTER("21"),
    SECOND_QUARTER("22"),
    THIRD_QUARTER("23"),
    FOURTH_QUARTER("24");

    private final String value;

    private Period(String v) {
        this.value = v;
    }

    public String value() {
        return this.value;
    }

    public static Period fromValue(String v) {
        Period[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Period c = var1[var3];
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}