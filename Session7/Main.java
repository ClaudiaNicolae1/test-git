package Session7;

import Session7.Classes.*;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(12);
        rectangle.setLength(11);
        Circle circle = new Circle();
        circle.setRadius(12);
        System.out.println("area circle: " + circle.calculateArea());
        System.out.println("perimeter circle: " + circle.calculatePerimeter());

        System.out.println();
        Dog dog = new Dog();
        Animal animal= new Animal();
        animal.makeSound();
        dog.makeSound();

        System.out.println();
        Car car = new Car();
        car.drive();

        System.out.println();
        SavingAccount savingAccount = new SavingAccount(200, 400);
        System.out.println(savingAccount.withdraw());
        savingAccount.deposit();

        System.out.println();
        Truck truck = new Truck("make?", "Ford F-150 Raptor" , 2021, "diesel");
        truck.setDistance(100);
        truck.setFuel(1000);
        truck.setHorsepower(450);
        truck.distanceTraveled();
        System.out.println(truck.fuelEfficiency());
        System.out.println(truck.maximumSpeed());

        Car1 car1 = new Car1("make2", "Bugatti Alloy", 2000, "petrol");
        car1.setDistance(200);
        car1.setFuel(200);
        car1.setHorsepower(1479);
        car1.distanceTraveled();
        System.out.println(car1.fuelEfficiency());
        System.out.println(car1.maximumSpeed());

        Motorcycle motorcycle = new Motorcycle("make", "model", 2020, "gasoline");
        motorcycle.setDistance(120);
        motorcycle.setFuel(1000);
        motorcycle.setHorsepower(500);
        motorcycle.distanceTraveled();
        System.out.println(motorcycle.fuelEfficiency());
        System.out.println(motorcycle.maximumSpeed());
    }
}
