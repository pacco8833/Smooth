package SmoothStack.DayThree;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/*-----------------------------------------------------------*
Program Useage:    
Write new message into an exisiting file.                          
*-----------------------------------------------------------*
1) Open File
2) Get User Messae to append 
3) Add user's message to file.
*-----------------------------------------------------------*
Author: Carl Clarke @ Smoothstack
*-----------------------------------------------------------*/

public class Appender {

    File file;
    String msg;

    public Appender() {

        file = getFile();
        msg = getMessage();

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(msg);
        } catch (Exception e) {
            System.out.println("Exception " + e + " needs to be handled more gracefully.");
        }

    }

    private File getFile() {

        Scanner user = new Scanner(System.in);
        String str = "";

        System.out.println("What file do you want to append to?");
        try {
            str = user.nextLine();
        } catch (Exception e) {
            System.out.println("Exception " + e + " needs to be handled more gracefully.");
        } finally {
            user.close();
        }
        return new File(str);
    }

    private String getMessage() {

        Scanner user = new Scanner(System.in);
        String message = "";

        System.out.println("What message do you want to append to the file?");
        try {
            message = user.nextLine();
        } catch (Exception e) {
            System.out.println("Exception " + e + " needs to be handled more gracefully");
        } finally {
            user.close();
        }
        return message;
    }

    public static void main(String[] args) {
        new Appender();
    }
}