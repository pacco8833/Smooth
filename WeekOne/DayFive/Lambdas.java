import java.util.Scanner;

public class Lambdas {

    public Lambdas() {

        Scanner user = new Scanner(System.in);
        int number = 0;

        while (number != -1) {
            System.out.println("Enter a number to know if it is even or odd");
            number = user.nextInt();
            System.out.println(isOdd(number) + "\n" + isPalindrome(number) + "\n" + isPrime(number));
        }

        user.close();
    }

    public boolean isOdd(int num) {
        EvenOdd val = (x) -> (x % 2) != 0;
        return val.evenOrOdd(num);
    }

    public boolean isPalindrome(int num) {

        EvenOdd val = (x) -> {
            String first = x + "";
            StringBuilder last = new StringBuilder(first).reverse();
            return first.equals(last.toString());
        };
        return val.evenOrOdd(num);
    }

    public boolean isPrime(int num) {

        EvenOdd val = (x) -> {
            boolean prime = false;
            if (x > 1)
                for (int i = 2; i <= num / 2; ++i)
                    prime = (num % i == 0) ? true : false;

            return prime;
        };

        return val.evenOrOdd(num);
    }

    public static void main(String[] args) {
        new Lambdas();
    }
}