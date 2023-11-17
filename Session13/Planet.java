package Session13;

public enum Planet {

    MERCURY(1.9876, 2.437),
    VENUS(42.678, 6.059),
    EARTH(21.532, 7.098),
    MARS(7.8765, 4.678),
    JUPITER(1.897, 5.7543),
    SATURN(5.7433, 5.246),
    URANUS(9.7543, 9.537),
    NEPTUNE(8975.64, 532.1);
    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}
