package Session16.LambdaClasa;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        myFunctionalInterface myFunctionalInterface = () -> System.out.println("do something");
        //sout intoarce void
       myFunctionalInterface.doSomething();
       myFunctionalInterfaceWithReturnType myReturn = () -> "Do something";
        String string = myReturn.doSomething();

        myFunctional myArg = s -> s + "is doing something";
        //putem sa nu punem paranteze pentru un argument dar pentru mai multe trb >:(
        System.out.println(myArg.doSomething("Bogdan"));

        myFunction myFunctional = (x,y) -> x + " is doing" + y;

        System.out.println(myFunctional.doSomething("Bogdan", "yoga"));

        myFunctionWithBody functionWithBody = (x,y) ->{
            //datele de intrare nu trb sa fie modificate
            //putem folosi x,y din exterior dar trb sa fie final (adk nu e modificata)
            System.out.println("do something");
            if(x.equals("Bogdan")){
                y = "nothing";
                //y nu se schimba si in afara
            }
            return x + " is doing " + y;
        };
        System.out.println(functionWithBody.doSomething("Bogdan", "yoga"));

        final String z = "yoga"; //e la fel cu "const" din C++
        //std::println (<- putem folosi)
    }
}

//no arguments with void
@FunctionalInterface
interface myFunctionalInterface{
    void doSomething();
    // o singura metoda abstracta
}

// fara argumente cu return type
@FunctionalInterface
interface myFunctionalInterfaceWithReturnType{
    String doSomething();
    // o singura metoda abstracta
}

//un argument cu un return type
@FunctionalInterface
interface myFunctional{
    String doSomething(String s);
}

@FunctionalInterface
interface myFunction{
    String doSomething(String s, String m);
}

@FunctionalInterface
interface myFunctionWithBody{
    String doSomething(String s, String m);
}
