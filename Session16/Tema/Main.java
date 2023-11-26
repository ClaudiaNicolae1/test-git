package Session16.Tema;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        functionalInterface functionalInterface = (input) ->{
            List<Integer> num = new ArrayList<>();
            for (Integer number : input) {
                if(number % 2 != 0){
                    num.add(number);
                }
            }
            return num;
        };
        System.out.println(functionalInterface.oddNumbers(numbers));

        System.out.println();

        //2
        List<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("cristina");
        names.add("mihai");
        firstNames firstNames = (input) ->{
            List<String> name = new ArrayList<>();
            for (String s : names) {
                name.add(s.toUpperCase());
            }
            return name;
        };
        System.out.println(firstNames.firstnames(names));

        System.out.println();

        //3
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(1);
        list.add(2);
        Integer contains = 1;
        generic<Integer> generic = (input) -> input.contains(contains);
        System.out.println(generic.findItem(list));

        System.out.println();


        //4
        squareRoot squareRoot = Math::sqrt; //n-am facut cu lambda:)
        double num = 16;
        System.out.println(squareRoot.num(num));

        System.out.println();

        //5
        strings strings = (s1, s2) -> s1 + " " + s2;
        String s1 ="Hello";
        String s2 ="World";
        System.out.println(strings.string(s1,s2));

        System.out.println();

        //6
        compare compare = (string1, string2) ->{
            int a;
            if(string1.length() < string2.length()){
                a = string2.length();
            }else{
                a = string1.length();
            }
            return a;
            //returneaza int
        };
        System.out.println("The length of the longer string");
        System.out.println(compare.comparator(s1,s2));

        System.out.println();
        //7
        stringReturn stringReturn = (myString, num1) ->{
            if(num1 > myString.length()) {
                return myString;
            }
            return myString.substring(0,num1);
        };
        int n = 3;
        System.out.println(stringReturn.string(s1,n));
    }
}


@FunctionalInterface
interface functionalInterface{
    List<Integer> oddNumbers(List<Integer> input);
}
@FunctionalInterface
interface firstNames{
    List<String> firstnames(List<String> name);
}

@FunctionalInterface
interface generic<T>{
    boolean findItem(List<T> list);
}

@FunctionalInterface
interface squareRoot{
    double num(double num);
}

@FunctionalInterface
interface strings{
    String string(String s1, String s2);
}
@FunctionalInterface
interface compare{
    int comparator(String string1, String string2);
}
@FunctionalInterface
interface stringReturn{
    String string(String myString, int num);
}