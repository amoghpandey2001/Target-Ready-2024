package com.targetindia.day1.assign1;

public class Print {
    public static void print (int y,int dy,int mm){
        String[] day = { "SUN","MON","TUE","WED","THU","FRI","SAT" } ;
        String[] month = { "JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER" } ;
        int[] ar = { 31, 29, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31 };

        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            ar[1] = 29;
        }
        else {
            ar[1] = 28;
        }

        // Print the desired month of input year
        System.out.println("MONTH:" + month[mm - 1]);

        for (int k = 0; k < 7; k++) {
            System.out.print("   " + day[k]);
        }

        System.out.println();

        for (int j = 1; j <= (ar[mm - 1] + dy); j++) {
            if (j > 6) {
                dy = dy % 6;
            }
        }

        int spaces = dy;
        if (spaces < 0)
            spaces = 6;

        // Printing the calendar
        for (int i = 0; i < spaces; i++)
            System.out.print("      ");
        for (int i = 1; i <= ar[mm - 1]; i++) {
            System.out.printf(" %4d ", i);

            if (((i + spaces) % 7 == 0)
                    || (i == ar[mm - 1]))
                System.out.println();
        }
    }
}