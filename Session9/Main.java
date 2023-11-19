package Session9;

public class Main {
    public static void main(String[] args) {
        Monster dragon = new Dragon("Dragon", "somewhere far away :D");
        Monster frog = new Frogs();
        Monster[] monsters = new Monster[]{dragon,frog};
        for(Monster monster : monsters){
            if(monster instanceof Dragon){
                dragon.attack();
            }else if(monster instanceof Frogs){
                frog.attack();
            }
        }
        Circle circle = new Circle(3.0f, "blue", false);
        Rectangle rectangle = new Rectangle("red", true, 4.6f, 6.8f);
        System.out.println("Area of the circle: " + circle.getArea());
        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());

    }
}
