package Session8.Classes;

import Session8.Classes.GeometricShape;

public class Triangle extends GeometricShape {
    private int side;
    private int height;

    public Triangle(int side, int height) {
        this.side = side;
        this.height = height;
    }


    @Override
    public void area() {
        System.out.println("area: " + (height * side)/2);
    }

    @Override
    public void perimeter() {
        System.out.println("perimeter: " + side*3);
    }
}
