//Problem statement
//Aryan and his friends are very fond of the pattern. They want to make the Reverse N-Number Crown for a given integer' N'.
//
//Given 'N', print the corresponding pattern.
//
//Example:
//Input: ‘N’ = 3
//
//Output:
//
//1         1
//1 2     2 1
//1 2 3 3 2 1
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1  <= N <= 20
//Time Limit: 1 sec
//Sample Input 1:
//3
//Sample Output 1:
//1         1
//1 2     2 1
//1 2 3 3 2 1
//Sample Input 2 :
//4
//Sample Output 2 :
//1             1
//1 2         2 1
//1 2 3     3 2 1
//1 2 3 4 4 3 2 1
//Sample Input 3 :
//7
//Sample Output 3 :
//1                         1
//1 2                     2 1
//1 2 3                 3 2 1
//1 2 3 4             4 3 2 1
//1 2 3 4 5         5 4 3 2 1
//1 2 3 4 5 6     6 5 4 3 2 1
//1 2 3 4 5 6 7 7 6 5 4 3 2 1
package _01_Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        int n =5;
        for(int i = 1 ; i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k<=2*(n-i); k++) {
                System.out.print(" ");
            }
            for (int l = i; l >0; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
