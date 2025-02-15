//Example 1:
//Input:N = 12345
//Output:5
//Explanation:  The number 12345 has 5 digits.
//Example 2:
//Input:N = 7789
//Output: 4
//Explanation: The number 7789 has 4 digits.
package _02_Basic_Math;

public class _01_Count_digits_in_a_number {
    public static void main(String[] args) {
        int n = 34353;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println(count);
        //Method 2
        int m =34353;
        int cnt = (int) (Math.log10(m) + 1);
        System.out.println(cnt);
    }
}
