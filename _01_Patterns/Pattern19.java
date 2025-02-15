//Problem statement
//        Sam is curious about symmetric patterns, so he decided to create one.
//
//        For every value of ‘N’, return the symmetry as shown in the example.
//
//        Example:
//        Input: ‘N’ = 3
//
//        Output:
//        * * * * * *
//        * *     * *
//        *         *
//        *         *
//        * *     * *
//        * * * * * *
//        Detailed explanation ( Input/output format, Notes, Images )
//        Constraints :
//        1  <= N <= 25
//        Time Limit: 1 sec
//        Sample Input 1:
//        3
//        Sample Output 1:
//        * * * * * *
//        * *     * *
//        *         *
//        *         *
//        * *     * *
//        * * * * * *
//        Sample Input 2 :
//        1
//        Sample Output 2 :
//        * *
//        * *
        package _01_Patterns;

public class Pattern19 {
        public static void main(String[] args) {
                int n =3;
                int  i , j, k;
                for(i = 0 ; i<n;i++){
                        for(j = 1 ; j<=n-i;j++){
                                System.out.print("*");
                        }
                        for(k = n-i;k<n+i;k++ ){
                                System.out.print(".");

                        }
                        for(j = 1 ; j<=n-i;j++){
                                System.out.print("*");
                        }
                        System.out.println();
                }
                for(i = n ; i>0;i--){
                        for(j = 0 ; j<=n-i;j++){
                                System.out.print("*");
                        }
                        for(k = n+i;k>n-i+2;k--){
                                System.out.print(".");

                        }

                        for(j = 0 ; j<=n-i;j++){
                                System.out.print("*");
                        }

                        System.out.println();
                }
        }
}
