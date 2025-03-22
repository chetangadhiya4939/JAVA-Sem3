// Interface Shape
interface Shape {
    double getArea();
}

// Implementing Rectangle
class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement getArea() for Rectangle
    public double getArea() {
        return length * width;
    }
}

// Implementing Circle
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implement getArea() for Circle
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Implementing Triangle
class Triangle implements Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implement getArea() for Triangle
    public double getArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        Shape circle = new Circle(7);
        Shape triangle = new Triangle(10, 5);
        
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}

