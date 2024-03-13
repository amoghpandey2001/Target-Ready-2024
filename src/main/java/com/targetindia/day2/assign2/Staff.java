package com.targetindia.day2.assign2;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter


public class Staff extends Person{
    private String school;
    private double pay;
    Staff(String name , String address, String School ,double pay){
     super(name, address);
     this.school=school;
     this.pay=pay;
    }
    @Override
    public String toString(){
        return "staff = "+ super.getName()+" address = "+super.getAddress()+" school = "+getSchool()+
                " pay = "+getPay();
    }

}
