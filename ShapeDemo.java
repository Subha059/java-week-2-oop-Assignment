interface Shape {
    double area();
    double perimeter();
}

class Rectangle implements Shape {
    double length = 5;
    double width = 3;

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}