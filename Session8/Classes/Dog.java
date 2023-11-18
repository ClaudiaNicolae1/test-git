package Session8.Classes;

import Session8.Interfaces.Mammal;

public class Dog implements Mammal {
    @Override
    public void speak() {
        System.out.println("The dog can speak");
    }

    @Override
    public void walk() {
        System.out.println("The dog can also walk");
    }
}
