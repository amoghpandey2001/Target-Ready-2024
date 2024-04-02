package com.target.india.model;

import com.target.india.utils.KeyboardUtil;

import java.io.*;
import java.io.FileReader;

import static java.nio.file.Files.write;

public class CrudOperator {
    static  String filePath="C:\\Users\\hp\\OneDrive\\Desktop\\TargetReady\\day3\\workspace\\assign_miniProject\\Customers.csv";
    public  static void  write(String line){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.write(line);
            writer.newLine();
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
    public  static void processAddData() {
        Integer id = Customer.readId("Enter customer Id: ");
        String name = Customer.readName("Enter customer name: ");
        String city = Customer.readCity("Enter customer city: ");
        String email = Customer.readEmail("Enter customer email: ");
        String number = Customer.readNumber("Enter customer number: ");
        write(Integer.toString(id)+","+name+","+city + "," +
                email + "," +
                number);

    }

    public static void printData() throws Exception {
//        FileReader fr=new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\TargetReady\\day3\\workspace\\assign_miniProject\\Customers.csv");
        BufferedReader fr =new BufferedReader(new FileReader(filePath));
        String  line;
        while((line=fr.readLine())!=null)
            System.out.println(line);
        fr.close();
    }

    public static void processSearchData() {
        String city = Customer.readCity("Enter customer city: ");
        searchData(city);
    }

    private static void searchData(String city) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));) {
            String line;
            System.out.println();
            while((line = reader.readLine()) != null) {
                String[] cells = line.split(",");
                if(cells[2].equals(city)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void processDeleteData() {
        int id = Customer.readId("Enter customer Id: ");
        deleteData(id);
    }

    private static void deleteData(int id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));) {
            String line;
            System.out.println();
            while((line = reader.readLine()) != null) {
                String[] cells = line.split(",");
                if(cells[2].equals(Integer.toString(id){
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void processUpdateData() {
    }
}
