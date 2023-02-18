/*
Task 1:
Create an Interface 'Shape' with undefined
methods as calculateArea and
calculatePerimeter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code.
 */

public class T01ShapeTester {
    public static void main(String[] args) {
        int count=0;
        T01Shape[] array= {new Circle(4), new Square(2.5)};
        for (T01Shape shapes: array) {
            shapes.calculateArea();
            shapes.calculatePerimeter();
        }
    }
}
