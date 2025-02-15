//Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.
//
//An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
//
//Examples
//Example 1:
//Input:N = 153
//Output:True
//Explanation: 13+53+33 = 1 + 125 + 27 = 153
//Example 2:
//Input:N = 371
//Output: True
//Explanation: 33+53+13 = 27 + 343 + 1 = 371
package _02_Basic_Math;

public class _04_Armstrong_Number {
    public static void main(String[] args) {
        int n =153;

        int a = 0 , d=0 , m=n;
        while(n>0){
            d=n%10;
            a= a + (int)Math.pow(d,3);
            n=n/10;
        }
        System.out.println((a==m)?"Armstrong":"not");
    }
}
