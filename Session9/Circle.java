package Session9;

public class Circle extends Shape{
    protected float radius;
    public Circle(float radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public void setRadius(float radius){
        this.radius = radius;
    }

    @Override
    public float getArea() {
        //formula: (pi*r)^2
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public float getPerimeter() {
        //formula: 2*pi*r
        return (float) (2 * radius * Math.PI);
    }
}
