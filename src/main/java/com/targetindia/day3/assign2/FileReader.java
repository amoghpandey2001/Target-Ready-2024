package com.targetindia.day3.assign2;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {
    public String[] readFile(String filename) throws IOException {
        BufferedReader fileReader= new BufferedReader(new java.io.FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\TargetReady\\src\\main\\java\\com\\targetindia\\util\\"+filename+".txt"));
        String sentence;
        StringBuilder data= new StringBuilder();
        while((sentence=fileReader.readLine())!=null){
              data.append(sentence).append("\n");
        }
        fileReader.close();
        return data.toString().split("\n");
    }

}
