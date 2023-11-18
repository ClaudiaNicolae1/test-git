package Session8;

import Session8.Classes.*;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(900);
        CurrentAccount currentAccount = new CurrentAccount(100);
        currentAccount.withdraw(200);
        savingAccount.deposit(200);

        System.out.println();
        Cube cube = new Cube(10);
        Sphere sphere = new Sphere(21.f);
        cube.calculateVolume();
        cube.calculateSurfaceArea();
        System.out.println();
        sphere.calculateSurfaceArea();
        sphere.calculateVolume();
        System.out.println();

        Triangle triangle = new Triangle(12,11);
        Square square = new Square(19);
        triangle.area();
        triangle.perimeter();
        square.area();
        square.perimeter();

        // am exercitiul facut cu Shape la session 9
        Rectangle rectangle = new Rectangle();
        rectangle.resizeWidth(10);
        rectangle.resizeHeight(12);
        System.out.println();

        Car car = new Car();
        car.drawable();
        car.move();

        System.out.println();
        Circle1 circle = new Circle1(12,2);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        circle.resize(12);

        System.out.println();
        Dog dog = new Dog();
        dog.speak();
        dog.walk();

    }
}
