package Session15.LambdaClasa;
import java.util.Random;
import java.util.function.*;
public class ExercitiiClasa {
    public static void main(String[] args) {
        GreetingService greetingService = System.out::println;
        greetingService.greet("Helloo");
        GreetingService anonymous = new GreetingService() {
            @Override
            public void greet(String m) {
                System.out.println(m);
            }
        };
        anonymous.greet("Buna:)");
        Supplier<Double> mySupplier = () -> new Random().nextDouble(10);
        Double double1 = mySupplier.get();
        Double double2 = mySupplier.get();
        Double double3 = mySupplier.get();
        System.out.println("Sum of random numbers " + (double1 + double2 + double3));
    }
}
@FunctionalInterface
interface GreetingService{
    void greet(String m);
}