package SmoothStack.DayTwo;

import java.util.InputMismatchException;

/*----------------------------------------------------------------------------
                            Program Useage:                               
*----------------------------------------------------------------------------*
1) Take multiple numbers from the terminal.
2) Sum numbers 
3) Return the sum.

Author: Carl Clarke @ Smoothstack
----------------------------------------------------------------------------*/

public class TerminalSum {

    private static int[] numbers = { 0 };

    public static void main(String[] args) {

        int i = 0;
       
        // go through args array and (attempt to) parse everything into int.
        for (String str : args) {

            try {
                numbers[i++] = Integer.parseInt(str);
            } catch(InputMismatchException e) {
                continue;
            } catch(NullPointerException e) {
                continue;
            } catch (Exception e) {
                System.out.println("Exception " + e + " has been thrown");
            }
        
        }
        if (numbers.length > 0)
            sum();
    }

    //Sum and Print sum
    private static void sum() {
        double addition = 0;

        for (int i = 0; i < numbers.length; i++)
            addition += numbers[i];

        System.out.println(addition);

    }

    /* my java cli component isn't working... I don't know if this code works correctly. */
}