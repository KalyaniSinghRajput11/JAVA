//Problem statement
//Sam is researching on Alpha-Triangles. So, he needs to create them for different integers ‘N’.
//
//An Alpha-Triangle is represented by the triangular pattern of alphabets in reverse order.
//
//For every value of ‘N’, help sam to print the corresponding Alpha-Triangle.
//
//Example:
//Input: ‘N’ = 3
//
//Output:
//C
//C B
//C B A
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1  <= N <= 25
//Time Limit: 1 sec
//Sample Input 1:
//3
//Sample Output 1:
//C
//C B
//C B A
//Sample Input 2 :
//1
//Sample Output 2 :
//A
package _01_Patterns;

public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;
        char aj = 'A';
        for(int k =1;k<n ;k++){
            aj++;
        }
        char ch =aj;
        for(int i =0 ; i<n;i++){
           ch=aj;
            for(int j =0 ; j<=i;j++){
                System.out.print(" "+ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}
