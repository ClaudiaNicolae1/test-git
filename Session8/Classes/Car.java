package Session8.Classes;

import Session8.Interfaces.Drawable;
import Session8.Interfaces.Movable;

public class Car implements Movable, Drawable {
    @Override
    public void move() {
        System.out.println("the car can move");
    }

    @Override
    public void drawable() {
        System.out.println("the car can be drawn");
    }
}
