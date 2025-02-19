package _03_Recursion;

import java.util.Scanner;

public class _03_Print_1_to_n {
    static void print(int i , int n ){
        if(i<1) return ;
        System.out.println(i);
        print(i-1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        print(n,n);
    }
}
