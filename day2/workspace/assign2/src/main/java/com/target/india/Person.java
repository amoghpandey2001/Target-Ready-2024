package com.target.india;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Person {
    private String name;
    private String address;
    Person(String name, String address){
        this.name=name;
        this.address=address;
    }

    public String toString(){
        return "person name "+ name+" and address is "+address;
    }

}
