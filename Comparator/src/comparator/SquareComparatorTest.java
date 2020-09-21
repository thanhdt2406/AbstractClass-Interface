package comparator;

import java.util.Arrays;
import java.util.Comparator;

import com.codegym.shape.Square;


public class SquareComparatorTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(3.6);
        squares[1] = new Square();
        squares[2] = new Square(1.2, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Square square : squares) {
            System.out.println(square);
        }

        Comparator rectangleComparator = new SquareComparator();
        Arrays.sort(squares, rectangleComparator);

        System.out.println("After-sorted:");
        for (Square square : squares) {
            System.out.println(square);
        }
    }
}
