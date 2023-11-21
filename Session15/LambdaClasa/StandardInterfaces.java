package Session15.LambdaClasa;
import java.util.Random;
import java.util.function.*;

public class StandardInterfaces {
    public static void main(String[] args) {
        Predicate<String> predicate = o -> o != null && o.isEmpty();
        //trb generic(tip de data generic)
        boolean test = predicate.test("Bogdan");
        System.out.println(test);

        boolean test1 = predicate.test(null);
        System.out.println(test1);

        Consumer<String> printString =
                s -> System.out.println("I received a variable with value" + s);
        printString.accept("yoga");

        Predicate<String> andPredicate = predicate.and(s -> s != null && s.length() >3);

        Function<String, Integer> myFunction = s-> {
            if( s != null){
                return s.length();
            }
            return -1;
        };
        myFunction.apply("Bogdan");

        Supplier<Integer> mySupplier = () -> new Random().nextInt(10);
        Integer int1 = mySupplier.get();
        Integer int2 = mySupplier.get();
        Integer int3 = mySupplier.get();

        System.out.println("Sum of random numbers " + (int1 + int2 + int3));

        //specialized interface
        ToIntFunction<String> myFunctionSecond = s ->{
            if(s != null){
                return s.length();
            }
            return -1;
        };
        Integer bogdanSecond = myFunctionSecond.applyAsInt("Bogdan");
        System.out.println(bogdanSecond);

        UnaryOperator<String> myUnaryOperator = s -> "Some string" +s;
        String myUnaryOperatorValue = myUnaryOperator.apply("Bogdan");

        System.out.println(myUnaryOperatorValue);

        BinaryOperator<String> binaryOperator = (s1,s2) -> s1 + s2;
        System.out.println(binaryOperator.apply("Bogdan", "Ana"));


    }
}
