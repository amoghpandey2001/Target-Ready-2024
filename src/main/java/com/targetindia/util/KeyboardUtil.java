package com.targetindia.util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KeyboardUtil {
    public static int getInt(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static double getDouble(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    public static String getString(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static long getLong(String message) {
        System.out.print(message);
        Scanner sc= new Scanner(System.in);
        return sc.nextLong();
    }
}
