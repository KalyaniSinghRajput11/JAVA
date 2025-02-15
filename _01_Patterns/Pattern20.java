//Problem statement
//        Sam is curious about symmetric patterns, so he decided to create one.
//
//        For every value of ‘N’, return the symmetry as shown in the example.
//
//        Example:
//        Input: ‘N’ = 3
//
//        Output:
//        *         *
//        * *     * *
//        * * * * * *
//        * *     * *
//        *         *
//        Detailed explanation ( Input/output format, Notes, Images )
//        Constraints :
//        1  <= N <= 25
//        Time Limit: 1 sec
//        Sample Input 1:
//        3
//        Sample Output 1:
//        *         *
//        * *     * *
//        * * * * * *
//        * *     * *
//        *         *
//        Sample Input 2 :
//        1
//        Sample Output 2 :
//        *
package _01_Patterns;
import java.util.*;
public class Pattern20 {
    public static void main(String[] args) {
        int n =5;
        for (int i = 0; i < n; i++) {  // Row loop
            for (int j = 0; j < n; j++) {  // Column loop
                // Conditions to print stars
                if (j == 0 || j == n - 1 ||  // First and last columns
                        i == n / 2 ||  // Middle row fully filled
                        (i < n / 2 && (j == i || j == n - i - 1)) ||  // Upper diagonals
                        (i > n / 2 && (j == i || j == n - i - 1))) {  // Lower diagonals
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Space for formatting
                }
            }
            System.out.println(); // Move to next line
        }
    }
}
