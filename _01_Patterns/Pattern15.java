//Problem statement
//Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Reverse Letter Triangle.
//
//You must print a matrix corresponding to the given Reverse Letter Triangle.
//
//Example:
//Input: ‘N’ = 3
//
//Output:
//
//A B C
//A B
//A
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1  <= N <= 20
//Time Limit: 1 sec
//Sample Input 1:
//3
//Sample Output 1:
//A B C
//A B
//A
//Sample Input 2 :
//4
//Sample Output 2 :
//A B C D
//A B C
//A B
//A
//Sample Input 3 :
//7
//Sample Output 3 :
//A B C D E F G
//A B C D E F
//A B C D E
//A B C D
//A B C
//A B
//A
package _01_Patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int n =6;
        char ch ='A';
        for (int i = 0; i < n; i++) {
            ch ='A';
            for(int j=n ; j>i;j--){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
