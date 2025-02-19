package _04_Sorting;
// find minimun , swap , i++ , repeat
public class Selection_Sort {
    public static void main(String[] args) {
        int arr[]={13 , 46 , 24 , 52, 20 , 9};
        int n = arr.length;
        for(int i =0 ; i<=n-2 ;i++) {
            //find min
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        //Printing array
        for(int i =0 ; i<n ;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
