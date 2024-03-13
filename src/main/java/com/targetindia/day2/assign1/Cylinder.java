package com.targetindia.day2.assign1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cylinder extends Circle {
     private double height ;
     Cylinder(){
         super();
         this.height=1.0;
     }
     Cylinder(double radius){
         super(radius);
         this.height = 1.0;
     }
    Cylinder(double radius,double height){
        super(radius);
        this.height=height;
    }
     Cylinder(double radius,double height,String color){
         super(radius, color);
         this.height=height;
     }
     @Override
     public double getVolume(){
         double radius=getRadius();
         return 3.14*radius*radius*height;
     }



}
