package Session7.Classes;

public class Truck extends Vehicle1{
    public String make;
    public String model;
    public int year;
    public String fuelType;
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

    public Truck(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
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
        System.out.println("maximum speed: ");
        return 20 * Math.cbrt(horsepower);
    }
}
