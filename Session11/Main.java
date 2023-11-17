package Session11;

import java.util.*;
import java.util.Scanner;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("----------------------------");
        // 2
        arrayList.add(0, 1);

        // 3
        Collections.sort(arrayList);

        // 4
        List<Integer> copiedArrayList = new ArrayList<>(arrayList);
        System.out.println(copiedArrayList);

        // 5
        Collections.swap(arrayList, 3, 4);

        // 6
        arrayList.trimToSize();

        // 7
        copiedArrayList.clear();

        // 8
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Mihai");
        linkedList.add("Gabriel");
        linkedList.add("Ion");
        linkedList.add("Sara");
        System.out.println("----------------------------");
        for (int i = 2; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        // 9
        System.out.println("----------------------------");
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.println(linkedList.get(i));
        }

        // 10
        System.out.println("----------------------------");
        linkedList.add(0, "Mihai1");
        linkedList.add(1, "Gabi");
        System.out.println(linkedList);

        // 11
        System.out.println("----------------------------");
        List<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(1);
        myLinkedList.add(3);
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(7);
        myLinkedList.add(7);
        System.out.println(myLinkedList);
        System.out.print("Write an element to look for it: ");
        int choice = input.nextInt();
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        for (int i = 0; i < myLinkedList.size(); i++) {
            if (Objects.equals(myLinkedList.get(i), choice)) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }
        System.out.println("First occurrence: " + firstOccurrence);
        System.out.println("Last occurrence: " + lastOccurrence);

        // 12
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.add(5);
        linkedList1.add(6);
        linkedList1.add(7);
        linkedList1.add(8);
        linkedList1.addAll(myLinkedList);

        // 13
        List<String> clonedLinkedList = new LinkedList<>(linkedList);

        // 14
        linkedList1.pollFirst();

        // 15
        linkedList1.peekFirst();

        // 16
        System.out.println("----------------------------");
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(0);
        hashSet.add(2);
        for (Integer number : hashSet) {
            System.out.println(number);
        }

        // 17
        System.out.println("----------------------------");
        if (hashSet.isEmpty()) {
            System.out.println("The hashSet is empty");
        } else {
            System.out.println("The hashSet isn't empty");
        }

        // 18
        Integer[] array = new Integer[hashSet.size()];
        hashSet.toArray(array);

        // 19
        System.out.println("----------------------------");
        List<Integer> list = new ArrayList<>(hashSet);
        System.out.println(list);
        // 20
        HashSet<Integer> myhashSet = new HashSet<>();
        myhashSet.add(1);
        myhashSet.add(2);
        myhashSet.add(8);
        myhashSet.add(9);
        myhashSet.add(3);
        System.out.println("----------------------------");
        if (hashSet.equals(myhashSet)) {
            System.out.println("The hashSets aren't equal");
        } else {
            System.out.println("The hashSets are equal");
        }
        myhashSet.retainAll(hashSet);

        // 21
        HashSet<Integer> myHashSetClone = new HashSet<>(myhashSet);
        for (Integer number : myHashSetClone) {
            myhashSet.remove(number);
        }
        // or
        myHashSetClone.clear();

        // 22
        TreeSet<String> treeSet = new TreeSet<>();
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet.add("Mihai");
        treeSet.add("Gabriel");
        treeSet.add("Ion");
        treeSet.add("Matei");
        treeSet1.addAll(treeSet);

        // 23
        System.out.println("----------------------------");
        var treeReverse = treeSet1.descendingSet(); // went with what IntelliJ suggested :D
        System.out.println(treeReverse);

        // 24
        System.out.println("----------------------------");
        TreeSet<Integer> numberTreeSet = new TreeSet<>();
        numberTreeSet.add(1);
        numberTreeSet.add(8);
        numberTreeSet.add(9);
        numberTreeSet.add(6);
        numberTreeSet.add(3);
        numberTreeSet.add(4);
        for (Integer number : numberTreeSet) {
            if (number < 7)
                System.out.println(number);
        }

        // 25
        System.out.println("----------------------------");
        Integer element = 5; // went with an already given element, so we minimize the usage of inputs
        for (Integer number : numberTreeSet) {
            if (number <= element) System.out.println(number);
        }

        // 26
        numberTreeSet.pollFirst();

        // 27
        numberTreeSet.pollLast();

        // 28
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Mihai", 1);
        hashMap.put("Alexandru", 2);
        hashMap.put("Petre", 3);
        hashMap.put("Matei", 4);
        hashMap.put("Alex", 5);
        Map<String, Integer> clonedHashMap = new HashMap<>(hashMap);

        // 29
        System.out.println("----------------------------");
        if (hashMap.isEmpty()) {
            System.out.println("Hash map is empty");
        } else {
            System.out.println("Hash map isn't empty");
        }

        // 30
        System.out.println("----------------------------");
        String myKey = "Mihai";
        if (hashMap.containsKey(myKey)) {
            System.out.println("Map contains Key");
        } else {
            System.out.println("Map doesn't contain Key");
        }

        // 31
        System.out.println("----------------------------");
        Integer myValue = 1;
        if (hashMap.containsValue(myValue)) {
            System.out.println("Map contains value");
        } else {
            System.out.println("Map doesn't contain value");
        }

        // 32
        TreeMap<String, String> newTreeMap = new TreeMap<>(new sort_key());
        newTreeMap.put("100", "Mara");
        newTreeMap.put("108", "Claudia");
        newTreeMap.put("103", "Ana");
        newTreeMap.put("12", "Cristina");
        newTreeMap.put("11", "Gheorghe");
        // didn't know if I should use Comparator<> or separate method, so I went with this one

        // 33
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Name2", 3);
        treeMap.put("Name4", 4);
        treeMap.put("Name1", 1);
        treeMap.put("Name0", 8);
        treeMap.lastEntry();
        treeMap.firstEntry();

        // 34
        newTreeMap.firstKey();
        newTreeMap.lastKey();

        // 35
        System.out.println("----------------------------");
        var treemapReverse = newTreeMap.descendingKeySet();
        System.out.println(treemapReverse);

        // 36
        String key1 = "12";
        newTreeMap.floorEntry(key1);

        // 37
        newTreeMap.headMap(key1);

        // 38
        Map.Entry<String, String> value1 = newTreeMap.lowerEntry(key1);
        if (value1 == null) System.out.println("No key strictly less than the given key");

        // 39
        System.out.println("----------------------------");
        Set<String> keySet = newTreeMap.keySet();
        for (String i : keySet) {
            System.out.println(newTreeMap.get(i));
        }

        // 40
        System.out.println("----------------------------");
        Map<String, Integer> map = new HashMap<>();
        map.put("Ana", 5);
        map.put("Sabina", 3);
        map.put("Bogdan", 7);
        map.put("Stefan", 2);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        String getKey;
        int getValue;
        for (Map.Entry<String, Integer> entry : entrySet) {
            getKey = entry.getKey();
            getValue = entry.getValue();
            System.out.println(getKey + " " + getValue);
        }

        // 41
        System.out.println("----------------------------");
        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }

    static class sort_key implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            return str1.compareTo(str2);
        }

    }
}