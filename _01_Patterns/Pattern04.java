//Problem statement
//        Sam is planting trees on the upper half region (separated by the left diagonal) of the square shared field.
//
//        For every value of ‘N’, print the field if the trees are represented by ‘*’.
//
//        Example:
//        Input: ‘N’ = 3
//
//        Output:
//        * * *
//        * *
//        *
package _01_Patterns;
public class Pattern04 {
    public static void main(String[] args) {
        int n =3;
        for (int i = 0; i < n; i++) {
            for(int j = n-1 ; j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

