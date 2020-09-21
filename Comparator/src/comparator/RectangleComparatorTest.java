package comparator;

import java.util.Arrays;
import java.util.Comparator;
import com.codegym.shape.Rectangle;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(3.6,6.5);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(3.5,1.2, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        Comparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles, rectangleComparator);

        System.out.println("After-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
