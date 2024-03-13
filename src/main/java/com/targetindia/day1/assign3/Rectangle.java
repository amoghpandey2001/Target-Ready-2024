package com.targetindia.day1.assign3;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(){
        super();
        this.length=1.0;
        this.width=1.0;
    }
    public Rectangle(double width, double length){
        super();
        this.length=length;
        this.width=width;
    }
    Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.length=length;
        this.width=width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public String toString() {
        String sup = super.toString();
        String curr = "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of ";
        return curr + sup;
    }



}
