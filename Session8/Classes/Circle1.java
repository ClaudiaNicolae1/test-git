package Session8.Classes;

import Session8.Interfaces.Resizable1;
import Session8.Interfaces.Shape1;

public class Circle1 implements Resizable1, Shape1 {
    private double radius;
    private double factor;

    public Circle1(double radius,double factor) {
        this.radius = radius;
        this.factor = factor;
    }

    @Override
    public void resize(double factor) {
        System.out.println("resize by: " + factor);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
