package com.codegym.shape_test;

import com.codegym.colorable.Colorable;
import com.codegym.shape.Circle;
import com.codegym.shape.Rectangle;
import com.codegym.shape.Shape;
import com.codegym.shape.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1.3);
        shapes[1] = new Rectangle(3.2,5.7);
        shapes[2] = new Square(4.5);

        for(Shape shape :shapes){
            System.out.println(shape);
            if(shape instanceof Colorable){
                ((Square) shape).howToColor();
            }
        }
    }
}
