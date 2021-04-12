package SmoothStack.DayTwo;

/*----------------------------------------------------------------------------
                            Program Useage:                               
*----------------------------------------------------------------------------*
1) Create multidimensional Array
2) Find the max in multidimensional Array 
3) Print sum of multidimensiional Array

Author: Carl Clarke @ Smoothstack
----------------------------------------------------------------------------*/

public class MultiMaxArray {

    int max = 0;

    int arr[][] = { { 11, 13, 15 }, { 2, 4, 6 } };

    MultiMaxArray() {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (max < arr[i][j])
                    max = arr[i][j];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        
        new MultiMaxArray();

    }
}