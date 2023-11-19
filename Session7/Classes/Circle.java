package Session7.Classes;

public class Circle {
    private float radius;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }
    public float calculateArea(){
        return (float) (2 * Math.PI * radius);
    }
    public float calculatePerimeter(){
        return (float) (2 * Math.PI * radius);
    }
}
