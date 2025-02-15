//Problem statement
//Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Rotated Triangle.
//
//Example:
//Input: ‘N’ = 3
//
//Output:
//
//*
//**
//***
//**
//*
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1  <= N <= 20
//Time Limit: 1 sec
//Sample Input 1:
//3
//Sample Output 1:
//*
//**
//***
//**
//*
//Sample Input 2 :
//1
//Sample Output 2 :
//*
package _01_Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i= n-1 ; i>=1;i--){
            for(int j =i ; j>=1 ;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
