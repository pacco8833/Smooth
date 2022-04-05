import java.util.Scanner;

public class Singleton extends Thread {

    private static Singleton instance = null;

    private Singleton() {
        // every user on this Thread should be able to change the name
        Scanner user = new Scanner(System.in);
        String name = "Carl";
        System.out.println("The current name is " + name + ".\n what would you like the name to be?");

        name = user.nextLine();
        user.close();

    }

    public static Singleton getInstance() {

        if (instance == null) {
            // double checked locking
            synchronized (Singleton.class) {

                instance = (instance == null)?  
                new Singleton() : null;
            }
        } return instance;
    }
}
