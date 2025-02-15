//Problem statement
//Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the Reverse N-Star Triangle.
//
//Example:
//Input: ‘N’ = 3
//
//Output:
//
//*****
// ***
//  *
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1  <= N <= 20
//Time Limit: 1 sec
//Sample Input 1:
//3
//Sample Output 1:
//*****
// ***
//  *
//Explanation Of Sample Input 1 :
//The first row contains five stars.
//The second row contains one space, followed by three stars.
//The third row contains two spaces, followed by a star.
//Sample Input 2 :
//1
//Sample Output 2 :
//*
package _01_Patterns;

public class Pattern09 {
    public static void main(String[] args) {
        int n = 3;
        int j , k;
        for (int i = 0; i <n; i++) {
            for(j =0 ; j<i ;j++){
                System.out.print("   ");
            }
            for(k =0 ; k<=n-i-j+1;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
