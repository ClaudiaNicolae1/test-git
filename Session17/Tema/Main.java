package Session17.Tema;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //1
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> integerStream = numbers.stream()
                .filter(x -> x % 2 ==1);
        List<Integer> oddNumbers = integerStream.toList();
        System.out.println(oddNumbers);

        //2
        List<String> string = List.of("John", "Joe", "Andrei");
        String string1 = String.valueOf(string.stream()
                .max((o1, o2) -> o1.length() - o2.length()));

        System.out.println();
        System.out.println(string1);

        //3 (neterminata)
        List<Integer> nr = new ArrayList<>();
        for (int i = 2; i <=100; i++){
            nr.add(i);
        }

    }

}
