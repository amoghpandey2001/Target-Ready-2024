package com.targetindia.day1.assign3;

public class Shape {
    private String color;
    private  boolean filled;
    Shape(){
        this.color="red";
        this.filled=true;
    }
    Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    String getColor(){
        return this.color;
    }
    Boolean isFilled(){
        return this.filled;
    }
    void setColor(String color){
        this.color=color;
    }
    void setFilled(Boolean filled ){
        this.filled=filled;
    }
    public String toString() {
        String res = "A Shape with color of ";
        res += color;

        if(filled) {
            res += " and filled";
        }
        else {
            res += " and not filled";
        }

        return res;
    }
    public double getArea() {
        return 1.0;
    }

    public double getPerimeter() {
        return 1.0;
    }
}
