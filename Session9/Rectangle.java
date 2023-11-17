package Session9;


public class Rectangle extends Shape{
    protected float width;
    protected float height;
    public Rectangle(String color, boolean filled, float width, float height) {
        super(color, filled);
        this.width = width;
        this.height = height;

    }
    public void setHeight(float height){
        this.height = height;
    }
    public float getHeight(){
        return height;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public float getWidth(){
        return width;
    }

    @Override
    public float getArea() {
        return width*height;
    }

    @Override
    public float getPerimeter() {
        return 2*(width + height);
    }
}
