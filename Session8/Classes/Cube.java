package Session8.Classes;

public class Cube extends Shape3D {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public void calculateVolume() {
        System.out.println("volume: " + Math.pow(edge, 3));
    }

    @Override
    public void calculateSurfaceArea() {
        System.out.println("surfaceArea: " + 6*Math.pow(edge,2));
    }
}
