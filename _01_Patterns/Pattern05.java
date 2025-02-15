//Problem statement
//        Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the Reverse N-Number Triangle.
//
//        Example:
//        Input: ‘N’ = 3
//
//        Output:
//
//        1 2 3
//        1 2
//        1
package _01_Patterns;

public class Pattern05 {
    public static void main(String[] args) {
        int n =3;
        for (int i = 0; i < n; i++) {
            for(int j = n-1 ; j>=i;j--){
                System.out.print(n-j);
            }
            System.out.println();
        }
    }
}


