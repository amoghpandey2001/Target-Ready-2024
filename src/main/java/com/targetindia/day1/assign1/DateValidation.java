package com.targetindia.day1.assign1;

public class DateValidation {
    public static int space(int mm,int yy) {
        int d = 1;
        int m = 1;
        int y = 1;
        int dy = 1;

        // Storing data and months as input
        String[] day = { "SUN", "MON", "TUE", "WED",
                "THU", "FRI", "SAT" };
        String[] month = { "JANUARY", "FEBRUARY", "MARCH",
                "APRIL",   "MAY",      "JUNE",
                "JULY",    "AUGUST",   "SEPTEMBER",
                "OCTOBER", "NOVEMBER", "DECEMBER" };

        // Custom array as input
        int[] ar = { 31, 29, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31 };

        // Till condition holds true
        while (true) {

            if (d == 1 && m == mm && y == yy) {
                break;
            }

            if (y % 4 == 0 && y % 100 != 0 || y % 100 == 0) {
                ar[1] = 29;
            }

            else {
                ar[1] = 28;
            }
            dy++;
            d++;

            if (d > ar[m - 1]) {
                m++;
                d = 1;
            }

            if (m > 12) {
                m = 1;
                y++;
            }

            if (dy == 7) {
                dy = 0;
            }
        }

        int c = dy;

        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            ar[1] = 29;
        }
        else {
            ar[1] = 28;
        }
        return c;
    }

}
