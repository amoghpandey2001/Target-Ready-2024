package com.targetindia.day1.assign3;

public class Circle extends Shape{
    private double radius;


    Circle(){
        super();
        this.radius=1.0;
    }
    Circle(double radius){
        super();
        this.radius=radius;
    }
    Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public String toString() {
        String sup = super.toString();
        String curr = "A Circle with radius = " + radius + ", which is a subclass of ";
        String res = curr + sup;
        return res;
    }

}
