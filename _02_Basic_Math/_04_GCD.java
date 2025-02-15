//Problem Statement: Given two integers N1 and N2, find their greatest common divisor.
//
//The Greatest Common Divisor of any two integers is the largest number that divides both integers.
//
//Examples
//Example 1:
//Input:N1 = 9, N2 = 12
//
//Output:3
//Explanation:Factors of 9: 1, 3 and 9
//Factors of 12: 1, 2, 3, 4, 6, 12
//Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.
//Example 2:
//Input:N1 = 20, N2 = 15
//
//Output: 5
//Explanation:Factors of 20: 1, 2, 4, 5
//Factors of 15: 1, 3, 5
//Common Factors: 1, 5 out of which 5 is the greatest hence it is the GCD.
package _02_Basic_Math;

public class _04_GCD {
    public static int findGcd(int n, int m) {
        while(n> 0 && m >0) {
            if (n > m) {
                n = n % m;
            } else {
                m = m % n;
            }
        }
        if(n==0) {
            return m;
        }
        return n;
    }

    public static void main(String[] args) {
        int n = 12;
        int m =9;
        int gcd=1;
        //METHOD 1
        for(int i = 1 ; i<=Math.min(n ,m);i++){
            if(n%i==0 && m%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);



        //METHOD 2
        //Algorithm / Intuition
        //The Euclidean Algorithm is a method for finding the greatest common divisor of two numbers. It operates on the principle that the GCD of two numbers remains the same even if the smaller number is subtracted from the larger number.
        //
        //To find the GCD of n1 and n2 where n1 > n2:
        //
        //Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
        //Once one of them becomes 0, the other number is the GCD of the original numbers.
        //Eg, n1 = 20, n2 = 15:
        //
        //gcd(20, 15) = gcd(20-15, 15) = gcd(5, 15)
        //
        //gcd(5, 15) = gcd(15-5, 5) = gcd(10, 5)
        //
        //gcd(10, 5) = gcd(10-5, 5) = gcd(5, 5)
        //
        //gcd(5, 5) = gcd(5-5, 5) = gcd(0, 5)
        //
        //Hence, return 5 as the gcd.
        int gcd2=findGcd(n , m);
        System.out.println(gcd2);

    }
}
