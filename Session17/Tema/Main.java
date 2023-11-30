package Session17.Tema;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //1
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> integerStream = numbers.stream()
                .filter(x -> x % 2 == 1);
        List<Integer> oddNumbers = integerStream.toList();
        System.out.println(oddNumbers);

        //2
        List<String> string = List.of("John", "Joe", "Andrei");
        String string1 = String.valueOf(string.stream()
                .max((o1, o2) -> o1.length() - o2.length()));

        System.out.println();
        System.out.println(string1);

        //3
        List<Integer> nr = new ArrayList<>();
        for (int i = 2; i <= 100; i++) {
            nr.add(i);
        }
        Stream<Integer> array = nr.stream()
                .filter(Main::prime);
        array.forEach(System.out::println);

        //4
        System.out.println();
        List<String> stringsList = new ArrayList<>();
        stringsList.add("Mihai");
        stringsList.add("Stefan");
        stringsList.add("Ana");
        stringsList.add("Gabriel");
        String string2 = String.join(",", stringsList);
        System.out.println(string2);

        //5
        System.out.println();
        List<Person> people = new ArrayList<>();
        people.add(new Person(17, "Claudia", "Nicolae"));
        people.add(new Person(21, "Sabina", "Niculae"));
        people.add(new Person(13, "Ana", "Costica"));
        List<Person> checkAge = people.stream()
                .filter(person -> person.getAge() > 18)
                .toList();
        checkAge.forEach(person -> System.out.println(person.getFirstname()));

        //6
        System.out.println();
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
        int arr = Arrays.stream(array1).reduce(0, Integer::sum);
        System.out.println(arr);

        //7
        System.out.println();
        List<String> strings = new ArrayList<>();
        strings.add("Mihai");
        strings.add("Bella");
        strings.add("Gaby");
        strings.add("Alex");
        List<Integer> integers = strings.stream()
                .map(String::length)
                .toList();
        System.out.println("from strings to their lengths: " + integers);

        //8
        System.out.println();
        String myString = "Ana are mere";
        int nrVowels = (int) myString.toLowerCase()
                .chars()
                .filter(ch -> "aeiou".indexOf(ch) != -1)
                .count();
        System.out.println(nrVowels);

        //9
        System.out.println();
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Ceva");
        listOfStrings.add("Something ");
        listOfStrings.add("Wow");
        listOfStrings.add(" ");
        int nrOfCharacters = listOfStrings.stream()
                .mapToInt(s -> Math.toIntExact(s.chars().filter(c -> !Character.isWhitespace(c)).count()))
                .sum();
        //luat de pe net.. nu stiu cum sa rezolv
        System.out.println(nrOfCharacters);

        //10
        System.out.println();
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Maria", "department1", 10000));
        employeeList.add(new Employee("Andrea", "department2", 2000));
        employeeList.add(new Employee("Sebastian", "department3", 2000));
        employeeList.add(new Employee("Ariel", "department4", 3000));
        Map<String, Integer> departmentAndSalary = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingInt(Employee::getSalary)));
        System.out.println(departmentAndSalary);

        //11
        System.out.println();
        List<Products> products = new ArrayList<>();
                products.add(new Products("Laptop", "Electronice", 1200));
                products.add(new Products("Telefon", "Electronice", 500));
                products.add(new Products("HotDog", "Mancare", 30));
                products.add(new Products("Apa", "Lichide", 2));
        Map<String, Integer> CategoryAndPrice = products.stream()
                .collect(Collectors.groupingBy(Products::getCategory,
                        Collectors.summingInt(Products::getPrice)));
        System.out.println(CategoryAndPrice); //on sa refac exercitiul


    }
    private static boolean prime(Integer nr){
        for(int i = 2; i < nr; i++){
            if(nr % i == 0){
                return false;
            }
        }
        return true;
    }
}
class Person{
    private int age;
    private String firstname;
    private String lastname;

    public Person(int age, String firstname, String lastname) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
class Employee{
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
}
class Products{
    private String name;
    private String category;
    private int price;

    public Products(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }
}
