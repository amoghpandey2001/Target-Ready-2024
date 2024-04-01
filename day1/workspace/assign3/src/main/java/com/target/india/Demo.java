package com.target.india;

public class Demo {


    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = new Circle(7.6, "Blue", true);
        shapes[1] = new Rectangle(12, 16, "Red", true);
        shapes[2] = new Square(8, "Purple", false);
        shapes[3] = new Circle(4.8, "Green", true);
        shapes[4] = new Rectangle(5, 9, "Yellow", true);
        shapes[5] = new Square(5.5, "Indigo", false);
        shapes[6] = new Circle(2.7, "Magenta", false);
        shapes[7] = new Rectangle(4.6, 6.9, "Black", true);
        shapes[8] = new Square(1.2, "Grey", false);
        shapes[9] = new Circle(8.8, "Pink", false);

        for(int i=0; i<10; i++) {

            System.out.println(shapes[i].toString()+",area of "+shapes[i].getArea()+"and perimeter of "+shapes[i].getPerimeter());
        }
    }
}
