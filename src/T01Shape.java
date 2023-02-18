/*
Task 1:
Create an Interface 'Shape' with undefined
methods as calculateArea and
calculatePerimeter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code.
 */
public interface T01Shape {
    void calculateArea();
    void calculatePerimeter();
}

class Circle implements T01Shape {
    public static final double pi= 3.14;
    public double radius;

    public Circle(double radius) {

        this.radius= radius;
    }
    @Override
    public void calculateArea() {
        double areaOfCircle= pi* radius*radius;
        System.out.println("Area of Circle: "+areaOfCircle);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter= 2* pi* radius;
        System.out.println("Perimeter of Circle: "+perimeter);
    }

    }

class Square implements T01Shape {
    double side;
    Square(double side){

        this.side= side;
    }

    @Override
    public void calculateArea() {
       double areaOfSquare= side* side;
        System.out.println("Area of Square: "+areaOfSquare);
    }

    @Override
    public void calculatePerimeter() {
        double perimeterOfSquare= 4 * side;
        System.out.println("Perimeter of Square: "+perimeterOfSquare);
    }
}