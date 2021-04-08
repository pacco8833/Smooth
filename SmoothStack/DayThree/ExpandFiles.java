package SmoothStack.DayThree;

import java.io.File;

public class ExpandFiles {

    public ExpandFiles(String file) {
        
        File path = new File(file);

        try {
            
            if(path.isDirectory()) {
            
                for (File f : path.listFiles()) {
                    System.out.println(f);
                }
            }

        } catch (Exception e) {
            System.out.println("File " + file + " is not a real file path");
        
        }

    }

    public static void main(String[] args) {

        new ExpandFiles("C:/Tony/Java");
    }

}