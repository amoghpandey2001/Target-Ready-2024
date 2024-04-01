package com.target.india;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = {
                new Cylinder(12.34),
                new Cylinder(12.34, 10.0),
                new Cylinder(12.34, 10.0, "blue")
        };
        for(Circle circle:circles){
            System.out.println("area is "+ circle.getArea()+" volume is "+circle.getVolume());
        }
    }
}
