package FizzBuzz;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        if (divisibleBy3(number) && divisibleBy5(number))
            return "FizzBuzz";
        if (divisibleBy3(number))
            return "Fizz";
        if (divisibleBy5(number))
            return "Buzz";
        return number + "";
    }

    private static boolean divisibleBy5(int number) {
        return number % 5 == 0;
    }

    private static boolean divisibleBy3(int number) {
        return number % 3 == 0;
    }
}