package _03_Recursion;

import java.util.Scanner;

public class _06_BackTracking_Print_n_to_1 {
    //not allowed to use f(n-1,n)
    static void print(int i, int n){
        if(i>n) return;
        print(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        print(1,n);
    }
}
