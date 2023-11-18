package Session8.Classes;

import Session8.Interfaces.Resizable;

public class Rectangle implements Resizable {
    private int width;
    private int height;
    @Override
    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("resized width: " + width);
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("resized height: " + height);
    }
}
