package Session8.Classes;

import Session8.Classes.Shape3D;

public class Sphere extends Shape3D {
    private float radius;

    public Sphere(float radius) {
        this.radius = radius;
    }

    @Override
    public void calculateVolume() {
        System.out.println("volume: " + (4/3 * Math.PI * radius * radius * radius ));
    }

    @Override
    public void calculateSurfaceArea() {
        System.out.println("surface area: " + 4 * Math.PI * radius * radius);
    }
}
