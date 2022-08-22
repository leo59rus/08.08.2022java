package GB_1.Level1_6_extends.app.Shape.Shape.Shape;

public class Circle extends Shape {
    float radius;

    public Circle(String color, float radius) {
        super(color); //this.color = color; тк есть в конструторе
        // предка
        this.radius = radius;
    }

    @Override
    public float area() {
       System.out.print("area circle radius(" + radius + ") = ");
        return (float)(2.0f * Math.PI * radius * radius);

    }
}
