package com.codegym.shape_test;

import com.codegym.shape.Circle;
import com.codegym.shape.Rectangle;
import com.codegym.shape.Shape;
import com.codegym.shape.Square;

public class CircleResizeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1.3);
        shapes[1] = new Rectangle(3.2,5.7);
        shapes[2] = new Square(4.5);

        System.out.println("Pre-resize:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        for(Shape i: shapes){
            if(i instanceof Circle){
                ((Circle) i).resize(Math.ceil(Math.random()*100));
            } else if(i instanceof Rectangle) {
                ((Rectangle) i).resize(Math.ceil(Math.random()*100));
            } else if(i instanceof Square){
                ((Square) i).resize(Math.ceil(Math.random()*100));
            }
        }

        System.out.println("After-resize:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
