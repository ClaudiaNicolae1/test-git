package Session10;

import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //ArrayList
        System.out.println("First exercise: ");
        List<String>colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        System.out.println(colors);

        System.out.println();
        System.out.println("Second exercise: ");
        List<Integer>numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(0,10);
        System.out.println(numbers);

        System.out.println();
        System.out.println("Third exercise: ");
        List<Integer>items = new ArrayList<>();
        System.out.print("Enter an index number(0-2): ");
        int index = input.nextInt();
        items.add(2);
        items.add(10);
        items.add(5);
        int i = items.get(index);
        System.out.println("Element at " + index + " index is: " + i);

        System.out.println();
        System.out.println("Fourth exercise: ");
        List<Integer>arrayList = new ArrayList<>();
        System.out.print("Enter an index number(0-5): ");
        index = input.nextInt();
        arrayList.add(2);
        arrayList.add(10);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(11);
        arrayList.add(13);
        System.out.println(arrayList);
        System.out.print("Update with what element? ");
        int element = input.nextInt();
        arrayList.add(index,element);
        System.out.println(arrayList);

        System.out.println();
        System.out.println("Fifth exercise: ");
        List<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(10);
        list.add(6);
        list.add(7);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        System.out.println();
        System.out.println("Sixth exercise: ");
        List<Integer>exercise = new ArrayList<>();
        exercise.add(2);
        exercise.add(10);
        exercise.add(6);
        exercise.add(7);
        System.out.print("Enter an element: ");
        element = input.nextInt();
        if(exercise.contains(element)){
            System.out.println("The list contains " + element);
        }else{
            System.out.println("The list doesn't contain " + element);
        }

        //LinkedList
        System.out.println();
        System.out.println("Seventh exercise: ");
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.print("Write an element: ");
        element = input.nextInt();
        linkedList.addFirst(element);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        System.out.println(linkedList);

        System.out.println();
        System.out.println("Eighth exercise: ");
        LinkedList<Integer> mylinkedList = new LinkedList<>();
        System.out.print("Write an element: ");
        element = input.nextInt();
        mylinkedList.addLast(element);
        mylinkedList.add(7);
        mylinkedList.add(8);
        mylinkedList.add(9);
        mylinkedList.add(1);
        mylinkedList.add(2);
        mylinkedList.add(1);
        System.out.println(mylinkedList);

        System.out.println();
        System.out.println("Ninth exercise: ");
        System.out.println("I'm using the same list " + mylinkedList);
        System.out.println("Choose an element: ");
        element = input.nextInt();
        int firstOccurrence = 0;
        int lastOccurrence = 0;
        for(i = 0; i < linkedList.size(); i++){
            if(linkedList.get(i).equals(element)){
                if(firstOccurrence == 0){
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }
        // ^ this part doesn't work idk I tried different things..
        System.out.println("First occurrence: " + firstOccurrence + " last occurrence: " + lastOccurrence);

        //HashSet
        System.out.println();
        System.out.println("Tenth exercise: ");
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println(hashSet);
        System.out.print("Write an element(different than the ones in the set>:( ) : ");
        element = input.nextInt();
        hashSet.add(element);
        System.out.println(hashSet);

        System.out.println();
        System.out.println("Eleventh exercise: ");
        HashSet<Integer> name = new HashSet<>();
        System.out.print("How many elements? ");
        int choice = input.nextInt();
        System.out.println("Write some elements: ");
        for(i = 0; i < choice; i++){
            element = input.nextInt();
            name.add(element);
        }
        System.out.println("Size : " + name.size());

        System.out.println();
        System.out.println("Twelve exercise: ");
        name.clear();
        System.out.println("The previous hashset is now empty");

        System.out.println();
        System.out.println("Thirteenth exercise: ");
        ArrayList<Integer> idk = new ArrayList<>(hashSet);
        System.out.println("Converting " + hashSet + " to an arrayList: " + idk);

        System.out.println();
        System.out.println("Fourteenth exercise: ");
        HashSet<Integer> clonedHashSet = new HashSet<>(hashSet);
        System.out.println("Cloned " + hashSet + " to a new hashset: " + clonedHashSet);
    }
}