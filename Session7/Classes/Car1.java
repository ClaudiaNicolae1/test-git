package Session7.Classes;

public class Car1 extends Truck{
    public Car1(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    public double horsepower;
    public double distance;
    public double fuel;

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setHorsepower(double horsepower) {
        this.horsepower = horsepower;
    }
    @Override
    public double fuelEfficiency() {
        System.out.print("fuel efficiency: ");
        return distance / fuel;
    }

    @Override
    public void distanceTraveled() {
        System.out.println("distance traveled: " + distance);
    }

    @Override
    public double maximumSpeed() {
        System.out.print("maximum speed: ");
        return 20 * Math.cbrt(horsepower);
    }
}
