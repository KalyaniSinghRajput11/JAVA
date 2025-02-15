//Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.
//
//Examples
//Example 1:
//Input:N = 2
//Output:True
//Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
//Example 2:
//Input:N =10
//Output: False
//Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and 10.
package _02_Basic_Math;

public class _06_Prime {
    public static void main(String[] args) {
        int n = 43;
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
count++;
        }
        System.out.println((count>0)?"Prime":"No");
    }
}
