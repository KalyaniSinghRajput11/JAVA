package _03_Recursion;

import java.util.Scanner;

public class _09_Reverse_Array {
    static void ReverseMethod1(int[] arr,int start, int end){
        if(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            ReverseMethod1(arr, start + 1, end - 1);
        }
    }
    static void print(int[] arr , int n){

        for(int i =0; i<n; i++ ){
            System.out.print(arr[i] +" ");
        }

    }
    public static void main(String[] args) {
        int[] arr ={5 , 6, 7 ,8 ,9};
        int n = arr.length;
       ReverseMethod1(arr,0,n-1);
       print(arr,n);
    }
}
