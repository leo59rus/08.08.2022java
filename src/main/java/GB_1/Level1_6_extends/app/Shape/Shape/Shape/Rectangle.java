package GB_1.Level1_6_extends.app.Shape.Shape.Shape;

public class Rectangle extends Shape {//прямоугольник
    float width;//шир
    float height;//h

    public Rectangle(String color, float width, float height) {
        super(color); //this.color = color; тк есть в предке в
        // конструкторе
        this.width = width;
        this.height = height;
    }

    @Override
    public float area() {//площадь

        return width * height;
    }
}
