package _04_Sorting;
// perfect loops , check 2 elements , swap if needed , j++
public class Bubble_sort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //Printing array
        for(int i =0 ; i<n ;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
