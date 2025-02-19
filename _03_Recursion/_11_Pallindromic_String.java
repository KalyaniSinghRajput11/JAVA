package _03_Recursion;

public class _11_Pallindromic_String {
    static boolean pallindrome(String st ,int i, int n){
        if(i>=n/2) return true;
        if(st.charAt(i)!=st.charAt(n-i-1)) return false;

        return pallindrome(st , i+1 , n);
    }
    public static void main(String[] args) {
        String st = "MADAM";

        int n = st.length();
        boolean ans = pallindrome(st ,0, n);
        System.out.println((ans)?"Pallindrome ":"not");
    }
}
