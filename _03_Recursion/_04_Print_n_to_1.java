package _03_Recursion;

import java.util.Scanner;

public class _04_Print_n_to_1 {
    static void print(int n , int i){
        if(i==0) return ;
        System.out.println(n);
        print(n-1 ,i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        print(n,1);
    }
}
