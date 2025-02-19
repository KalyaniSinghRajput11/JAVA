package _03_Recursion;

import java.util.Scanner;

public class _05_BackTracking_Print_1_to_n {
    //not allowed to use f(i+1,n)
    static void print(int i , int n){
        if(i<1) return;
        print(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        print(n,n);
    }
}
