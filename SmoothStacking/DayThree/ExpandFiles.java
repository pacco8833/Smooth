package SmoothStack.DayThree;

import java.io.File;
import java.util.Scanner;

/*-----------------------------------------------------------*
Program Useage:    
Write all Folders and subfolders of a certain directory in plain text                          
*-----------------------------------------------------------*
1) Open File
2) Get Letter The User wants to find 
3) Count number of letters in file.
*-----------------------------------------------------------*
Author: Carl Clarke @ Smoothstack
*-----------------------------------------------------------*/
public class ExpandFiles {

    public ExpandFiles(File path) {
        checker(path);
    }

    private static File getFile() {

        Scanner user = new Scanner(System.in);
        String str = "";

        System.out.println("What file do you want to print the folders and subfolders of?");

        try {
            str = user.nextLine();
        } catch (Exception e) {
            System.out.println("Exception " + e + " needs to be handled more gracefully.");
        }
        finally {
            user.close();
        }
        File file = new File(str);
        return file.exists() ? file : new File("C:/Tony/Java");
    }

    public void checker(File f) {

        if (f.isDirectory()) {
            for (File file : f.listFiles())
                checker(file);
        } else
            System.out.println(f.getPath());
    }

    public static void main(String[] args) {

        File f = getFile();
        new ExpandFiles(f);
    }

}