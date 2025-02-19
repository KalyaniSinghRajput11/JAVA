package _03_Recursion;

public class _10_Reverse_an_array_with_single_Pointer {
    static void ReverseMethod(int[] arr , int i , int n){
        if(i<(n/2)){
            int temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1] = temp;
            i++;
            ReverseMethod(arr , i ,n);
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
        ReverseMethod(arr, 0 , n);
        print(arr,n);
    }
}
