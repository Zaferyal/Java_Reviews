package bootcamp;

import week12_review.Circle;
import week12_review.Rectangle;
import week12_review.Shape;
import week12_review.Square;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Polymorphism {

    public static void main(String[] args) {

        Shape shape1 = new Circle(5);
        System.out.println( shape1.calc_area() );
        System.out.println( ((Circle) shape1).getRadius() );

        Shape shape2 = new Square(4);
        //System.out.println( ((Circle) shape2).getRadius() );

        Shape shape3 = new Rectangle(3, 4);


        Shape[] shapes = {shape1, shape2, shape3};

        System.out.println("------------------------------------");

        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        ((LinkedList<Integer>) list).pop();

        System.out.println(list);




    }

}
