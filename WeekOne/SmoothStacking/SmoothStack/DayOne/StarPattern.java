/*----------------------------------------------------------------------------
                            Program Useage:                               
*----------------------------------------------------------------------------*
1) forward
*
**
***
****

2) backward
****
***
**
*

3) pyramid
   *
  ***
 *****
*******

4) upside-down
********
 *****
  ***
   *
    

Author: Carl Clarke @ Smoothstack
----------------------------------------------------------------------------*/


public class StarPattern {

    String pattern = "", spaces;
    final int SIZE = 4;

    public StarPattern(String orientation) {

        switch (orientation) {

        case "forward":

            System.out.print("1)\n");
            
            for (int i = 0; i < SIZE; i++) {
             
                pattern += "*";
             
                System.out.println(pattern);
            }
            System.out.println("\n. . . . . . .\n");

        case "backward":
        pattern = "****";

        System.out.print("2)\n");
            
            for (int i = 0; i < SIZE; i++) {
            
                System.out.println(pattern.substring(i));
            
            }
            System.out.println("\n. . . . . . .\n");

        case "pyramid":
            spaces = "   ";
            pattern = "*";

            System.out.print("3)\n");
            for (int i = 0; i < SIZE; i++) {

                System.out.println(spaces + pattern + spaces);
                
                if ( spaces.length() >= 1 )
                spaces = spaces.substring(1);
                
                pattern += "**";
            
            }
            System.out.print("\n. . . . . . .\n");

        case "upside-down":

        spaces = "";
            pattern = "*******";

            System.out.println("4)\n" + pattern);

            for (int i = 1; i < SIZE; i += 2) {
                spaces += " ";
                pattern = spaces + pattern.substring(i, pattern.length() - 1) + spaces;
                System.out.println(pattern);
            }
            System.out.print("   *   ");
        }
        System.out.print("\n. . . . . . .\n");
    }

    public static void main(String[] args) {
        new StarPattern("forward");
    }
}