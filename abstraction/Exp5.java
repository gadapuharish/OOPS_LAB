abstract class Shape {
    abstract void area();
}
class Triangle extends Shape {
    double b = 4, h = 5;
    void area() {
        double area = 0.5 * b * h;
        System.out.println("Triangle Area: " + area);
    }
}
class Square extends Shape {
    double s = 4;
    void area() {
        double area = s * s;
        System.out.println("Square Area: " + area);
    }
}
public class Exp5 {
    public static void main(String[] args) {
        Shape s;
        s = new Triangle();
        s.area();
        s = new Square();
        s.area();
    }
}
