package com.targetindia.day2.assign1;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Circle {
    private double  radius;
    private String color;
    Circle(){
        this.radius=1.0;
        this.color="red";
    }
  Circle(double radius){
      this.radius=radius;
  }
  public double getArea(){
      return 3.14*radius*radius;
  }


    public double getVolume() {
        return 0;
    }
}
