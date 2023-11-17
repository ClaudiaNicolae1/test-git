package Session3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("First exercise: ");

        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println();

        System.out.println("Second exercise: ");

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        System.out.println();

        System.out.println("Third exercise: ");

        System.out.print("Enter any number: ");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("!N = " + factorial);
        }
        System.out.println();

        System.out.println("Fourth exercise: ");

        System.out.print("How many integers would you like to use? ");
        int n = input.nextInt();
        int[] anInt = new int[n];
        System.out.print("Write down the integers: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            anInt[i] = input.nextInt();
        }
        int sumEven = 0, sumOdd = 0;
        for (int i = 0; i < n; i++) {
            if (anInt[i] % 2 == 0) {
                sumEven += anInt[i];
            } else {
                sumOdd += anInt[i];
            }
        }
        System.out.println("Sum of even numbers = " + sumEven);
        System.out.println("Sum of odd numbers = " + sumOdd);

        System.out.println();

        System.out.println("Fifth exercise: ");

        System.out.print("Choose a number for a multiplication table: ");
        int a = input.nextInt();
        if (a <= 0) {
            System.out.print("Please enter a positive integer.");
        } else {
            System.out.println("Multiplication Table for " + a + ":");
            for (int i = 1; i <= 10; i++) {
                int result = a * i;
                System.out.println(a + " x " + i + " = " + result);
            }
        }
        System.out.println();

        System.out.println("Sixth exercise: ");

        System.out.print("First number: ");
        int write = input.nextInt();
        System.out.print("Second number: ");
        int write2 = input.nextInt();
        System.out.println("Choose to raise first ,type '1' or second ,type '2' number to the other");
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> System.out.println(Math.pow(write, write2));
            case 2 -> System.out.println(Math.pow(write2, write));
            default -> System.out.println("Choose 1 or 2");
        }
        System.out.println();

        System.out.println("Seventh exercise: ");

        System.out.print("Enter the number of rows: ");
        int numRows = input.nextInt();
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Eighth exercise: ");

        System.out.print("Write a natural number: ");
        n = input.nextInt();
        long product = 1;
        for (int i = 1; i <= n; i++) {
            int oddNumber = 2 * i - 1;
            product *= oddNumber;
        }
        System.out.println("The product of the first " + n + " odd natural numbers is: " + product);

        System.out.println();

        System.out.println("Ninth exercise: ");

        System.out.print("Enter the number of rows: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Tenth exercise: ");

        System.out.print("First n square numbers: ");
        n = input.nextInt();
        sum = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.print(square + " ");
            sum += square;
        }
        System.out.println("Sum of the first n square numbers is: " + sum);

        System.out.println();

        System.out.println("Eleventh exercise: ");

        System.out.print("Enter a number: ");
        num = input.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a perfect number.");
            return;
        }

        int sumOfDivisors = 1; // Initialize with 1 since all numbers are divisible by 1

        System.out.print("Divisors: 1");

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
                System.out.print(", " + i);
            }
        }

        if (sumOfDivisors == num) {
            System.out.println("\nSum of Divisors (excluding the number itself): " + sumOfDivisors);
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println("\nSum of Divisors (excluding the number itself): " + sumOfDivisors);
            System.out.println(num + " is not a perfect number.");
        }
        System.out.println();

        System.out.println("Twelve exercise: ");
        int lowerBound = 1;
        int upperBound = 1000;

        System.out.println("Perfect numbers in the range [" + lowerBound + ", " + upperBound + "]:");

        for (num = lowerBound; num <= upperBound; num++) {
            if (isPerfectNumber(num)) {
                System.out.println(num);
            }// programul nu da raspunsul dorit dar :(((( poate il discutam
        }
        System.out.println();

        System.out.println("Thirteenth exercise: ");
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        n = input.nextInt();
        int first = 0, second = 1;

        System.out.println("Fibonacci series of " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
    }
    public static boolean isPerfectNumber(int number) {
        int sum=0;
        for(int i=1; i<=number/2; i++) {
            if(number%i == 0) {
                sum += i;
            }
        }
        if(sum==number) {
            return true;
        }else {
            return false;
        }
    }

}
