package SmoothStack.DayThree;

import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;
import java.io.FileReader;

public class LetterCounter {

    private static Scanner user = new Scanner(System.in);

    public LetterCounter() {

        File file = getFile().exists() ? getFile() : new File("SmoothStack/DayThree/Lorem.txt");
        char letter = getLetter();

        System.out.println(counter(file, letter) + " number of " + letter + "(s) in this file.");

        System.exit(0);
    }

    private File getFile() {

        String str = "";

        System.out.println("What file do you to append to?");

        try {
            str = user.nextLine();
        } catch (Exception e) {
            System.out.println("Exception " + e + " needs to be handled more gracefully.");
        }
        return new File(str);
    }

    private int counter(File file, char let) {

        int count = 0, str;

        try (FileReader reader = new FileReader(file)) {
            BufferedReader buffer = new BufferedReader(reader);

            while ((str = buffer.read()) != -1) {
                if (str == let) {
                    count++;
                    
                }
            }
        } catch (java.io.IOException e) {
            System.out.println(
                    "The File " + file + " does not seem to exist. Please make sure it is in the correct path.");
        } catch (Exception e) {
            System.out.println("Exception " + e + " needs to be handled more gracefully.");
        }
        return count;
    }

    private char getLetter() {

        String letter = "a";

        System.out.println("What letter(s) do you want to count in the file?");

        try {
            letter = user.nextLine();
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Exception " + e + " needs to be handled more gracefully\n Line 65");
        }
        return letter.charAt(0);
    }

    public static void main(String[] args) {
        new LetterCounter();
    }
}