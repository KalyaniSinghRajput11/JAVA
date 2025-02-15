//Problem Statement: Given an integer N return the reverse of the given number.
//
//Note: If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.
//
//Examples
//Example 1:
//Input:N = 12345
//Output:54321
//Explanation: The reverse of 12345 is 54321.
//Example 2:
//Input:N = 7789
//Output: 9877
//Explanation: The reverse of number 7789 is 9877.
package _02_Basic_Math;
public class _02_Reverse_Digits {
    public static void main(String[] args) {
  int n= 48957;
  int rev=0;
  while(n>0){
      int d =n%10;
      rev = (rev*10)+d;
      n=n/10;
  }
        System.out.println(rev);
    }
}
