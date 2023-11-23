package Session16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
////        List<String> string = List.of("John", "Joe", "Bogdan");
//
//       Stream<Integer> integerStream = numbers.stream()
//               .peek(Main::doSomethingWithValue) //peek consuma valoarea(Comsumer), face cv cu valoarea
//                .filter(x -> x % 2 ==1) //"Filter through values"
//                .peek(System.out::println)
//                .filter(x -> x < 3)
//                .peek(System.out::println);

//        List<Integer> oddNumbers = integerStream.toList();
//        List<String> string = List.of("John", "Joe","Jay", "Bogdan");
//        string.stream()
//                .sorted(Comparator.comparing(String::length))
//                //sorteaza dupa lungimea de caractere
//                 .forEach(System.out::println);

//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
//       Integer sum =  numbers.stream()
//                .reduce(0, Integer::sum);
//                //reduce intoarce o valoare
//                //peek does consuma nu intoarce
//        //identity = valoarea initiala
//        //a = identity
//        //a = a + elem1, a = a + elem2, etc
//        System.out.println(sum);
//        int[] numberArray = {4, 2, 9, 7, 5};
//        int max = Arrays.stream(numberArray)
//                .reduce(Integer.MIN_VALUE) (a,b) ->Integer.max(a, b);
    }
//    private static void doSomethingWithValue(Integer someValue){
//        //trb neaparat sa fie void pentru ca nu poate returna
//        if(someValue > 0){
//            System.out.println("greater than 0");
//        }else{
//            System.out.println("not greater than 0");
//        }
//    }


    class Student{
        String name;
        int grade;

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }
    }
}
