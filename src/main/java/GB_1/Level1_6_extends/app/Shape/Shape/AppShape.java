package GB_1.Level1_6_extends.app.Shape.Shape;

import GB_1.Level1_6_extends.app.Shape.Shape.Shape.Circle;
import GB_1.Level1_6_extends.app.Shape.Shape.Shape.Rectangle;

public class AppShape {
    public static void main(String[] args) {


        Circle circle = new Circle("black", 5);
        Rectangle rec = new Rectangle("black", 15, 20);

        System.out.println(circle.area());
    }
}
