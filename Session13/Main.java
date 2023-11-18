package Session13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.setBox("New box");
        System.out.println(box);
        Integer[] array = {1, 2, 3, 4};
        Integer[] array1 = {2, 3, 5, 6};
        System.out.println("Compare two arrays: " + compare(array, array1));
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(7);
        calculate(list);

        List<String> stringList = new ArrayList<>();
        stringList.add("Ana");
        stringList.add("Claudia");
        stringList.add("Cristina");
        stringList.add("Sabina");
        stringList(stringList);
        System.out.println();
        printItems(stringList);
        System.out.println();
        displayFirstTwo(stringList);
        String day = "monday";
        System.out.println(Weekday.isWeekDay(day));

        System.out.println();
        Bird bird = new Penguin();
        System.out.println(bird);
        System.out.println();
        Worker1 worker = new Worker1();
        worker.work();
        worker.eats();
    }

    static class Box<T> {
        private T box;

        public void setBox(T box) {
            this.box = box;
        }

        public T getBox() {
            return box;
        }

        @Override
        public String toString() {
            return "box = " + box;
        }
    }

    public static <T> boolean compare(T[] array, T[] array1) {
        if (array.length != array1.length) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(array1[i])) {
                return false;
            }
        }
        return true;

    }

    @Override
    public String toString() {
        return "Main{}";
    }


    public static <T extends Number> void calculate(List<T> numbers){
        double sumEven = 0;
        double sumOdd = 0;
        for (T number : numbers) {
            if(number.doubleValue() % 2 == 0){
                sumEven += number.doubleValue();
            }else{
                sumOdd += number.doubleValue();
            }
        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

    }
    public static <T> void stringList(List<T> stringList){
        Collections.sort(stringList, Collections.reverseOrder());
        List<T> list = new ArrayList<>(stringList);
        System.out.println("Reversed list: " + list);
    }

    public static void printItems(List<? extends CharSequence>list){
        for (CharSequence t : list) {
            System.out.println(t);
        }
    }

    public static void displayFirstTwo(List<?> items){
        System.out.println(items.get(0));
        System.out.println(items.get(1));
    }
    static class Bird { }

    static class NonFlyableBird extends Bird {
        void fly(){
            System.out.println("can't fly");
        }
    }

    static class FlyableBird extends Bird {
        void fly() {
            System.out.println("can fly");
        }
    }
    static class Penguin extends NonFlyableBird{ }




}