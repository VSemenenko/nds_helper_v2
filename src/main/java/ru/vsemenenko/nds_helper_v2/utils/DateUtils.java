package ru.vsemenenko.nds_helper_v2.utils;

import lombok.experimental.UtilityClass;

import java.time.LocalDate;

@UtilityClass
public class DateUtils {

    public LocalDate convertStringToDate(String date){
        String [] dateParts = date.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<dateParts.length ; i++){
            sb.append(dateParts[dateParts.length-(i+1)]);
            if(i<dateParts.length-1){
                sb.append("-");
            }
        }
        return LocalDate.parse(sb.toString());
    }
}
