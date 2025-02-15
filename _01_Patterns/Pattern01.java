//Problem statement
//        Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.
//
//        For every value of ‘N’, help sam to print the corresponding N-dimensional forest.
//
//        Example:
//        Input: ‘N’ = 3
//
//        Output:
//        * * *
//        * * *
//        * * *
package _01_Patterns;
import java.util.Scanner;
public class Pattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Lines");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
