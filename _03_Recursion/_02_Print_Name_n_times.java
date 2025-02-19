package _03_Recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _02_Print_Name_n_times {
    static void print(int i , int n ){
       if(i>n) return;
        System.out.println("Kalyani");
        print(i+1 , n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of times to be printed");
        int n = sc.nextInt();
        print(1,n);
    }
}
