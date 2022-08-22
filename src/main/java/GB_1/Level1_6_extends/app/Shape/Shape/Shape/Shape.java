package GB_1.Level1_6_extends.app.Shape.Shape.Shape;

public abstract class Shape {//фигура
    String color;

    public Shape(String color){
        this.color = color;
    }

    public abstract float area();//площадь
}
