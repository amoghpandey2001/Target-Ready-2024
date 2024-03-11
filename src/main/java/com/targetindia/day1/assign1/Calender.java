package com.targetindia.day1.assign1;

import com.targetindia.util.KeyboardUtil;

public class Calender {
    public static void main(String[] args) {
        int month= KeyboardUtil.getInt("enter month");
        int year=KeyboardUtil.getInt("enter Year");
        int sp= DateValidation.space( month, year);
        Print.print(year,sp,month);
        return ;
    }

}
