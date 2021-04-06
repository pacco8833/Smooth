package java.ss.Day1;

public class FirstDay {

    String value = "";
    final int SIZE = 6, half = SIZE / 2;

    public FirstDay(String orientation) {

        switch (orientation) {

        case "forward":

        System.out.print("1)\n");
            for (int i = 0; i < SIZE; i++) {
                value += "*";
                System.out.println(value);
            }
            System.out.println("\n. . . . . . .\n");

        case "backward":
        System.out.print("2)\n");
            value = "******";
            for (int i = 0; i < SIZE; i++) {
                System.out.println(value.substring(i));
            }
            System.out.println("\n. . . . . . .\n");

        case "pyramid":
        System.out.print("3)\n");
        value = "";
            for (int i = 0; i < SIZE; i++) {

                value = (i < half) ? value + "*" : value.substring( 1 );

                System.out.print(value);
            }
            System.out.print("\n. . . . . . .\n");

        case "upside-down":
        System.out.print("4)\n");
            for (int i = 0; i < SIZE; i++) {

                value = (i <= half) ? value.substring( 1 ) : value + "*";

                System.out.print(value);
            }
            System.out.print("\n. . . . . . .\n");

        }
    }

    public static void main(String[] args) {
        new FirstDay("forward");
    }
}