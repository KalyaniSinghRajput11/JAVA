package _03_Recursion;

import java.util.Scanner;

public class _07_Sum_of_n_numbers {
    static void sum(int n , int sum){
        if(n<1) {
            System.out.println(sum);
            return ;
        }
        sum(n-1 , sum+n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        sum(n,0);
    }
}
