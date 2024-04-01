package com.target.india;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {
    public String[] readFile(String filename) throws IOException {
        String path="C:\\Users\\hp\\OneDrive\\Desktop\\TargetReady\\day3\\workspace\\assign2\\src\\main\\java\\com\\target\\india\\util\\";
        BufferedReader fileReader= new BufferedReader(new java.io.FileReader(path+filename+".txt"));
        String sentence;
        StringBuilder data= new StringBuilder();
        while((sentence=fileReader.readLine())!=null){
              data.append(sentence).append("\n");
        }
        fileReader.close();
        return data.toString().split("\n");
    }

}
