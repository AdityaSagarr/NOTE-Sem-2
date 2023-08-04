Here is a simple Java program that demonstrates the implementation of multiple inheritance using interfaces to calculate the area of a rectangle and triangle:

```java
interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        
        Triangle triangle = new Triangle(4, 6);
        System.out.println("Area of triangle: " + triangle.calculateArea());
    }
}
```

In this program, we define an interface called `Shape` with a method `calculateArea()` that calculates the area of a shape. The `Rectangle` and `Triangle` classes implement the `Shape` interface and provide their own implementations for the `calculateArea()` method.

In the `main()` method, we create objects of `Rectangle` and `Triangle` classes and call their respective `calculateArea()` methods to calculate and display the areas of a rectangle and triangle.

Daily quota: 8/10
ENG | ES | عربي | 中文 | فارسی
