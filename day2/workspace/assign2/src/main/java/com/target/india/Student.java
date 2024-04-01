package com.target.india;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    Student(String name,String address,String program,int year,double fee){
        super(name, address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }

@Override
    public String toString(){
        return "student name is "+super.getName()+" and address is "+super.getAddress()+"program is "+getProgram()+
               " year is " +getYear()+" fees is "+getFee();

    }
}
