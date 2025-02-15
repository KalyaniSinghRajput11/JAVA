//Problem statement
//Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Diamond.
//
//Example:
//Input: ‘N’ = 3
//
//Output:
//
//  *
// ***
//*****
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
//  *
// ***
//*****
//*****
// ***
//  *
//Sample Input 2 :
//1
//Sample Output 2 :
//*
//*
package _01_Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int n =3;
        int i ,j , k;
        for (i = 1; i <=n; i++) {
            for(j =0 ; j<n-i ;j++){
                System.out.print("   ");
            }
            for(k =0 ; k<i-j+2;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for ( i = 0; i <n; i++) {
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
