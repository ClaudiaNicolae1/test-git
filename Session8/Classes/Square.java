package Session8.Classes;

import Session8.Classes.GeometricShape;

public class Square extends GeometricShape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println("area: " + side * side);
    }

    @Override
    public void perimeter() {
        System.out.println("perimeter: " + 4 * side);
    }
}
