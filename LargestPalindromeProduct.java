package frogLeafFall;

public class LargestPalindromeProduct {
	public static int largestPalindrome(int n) {
        long UP = (long)Math.pow(10,n)-1;
        long LP = UP/10;
        for(long i=UP; i>LP; i--) {
        	long left = i, right =0;
        	for(long j=i; j!=0; right= right*10+j%10, j/=10, left*=10);
        	long palindrome = left+right;
        	
        	for(long k=UP; k>LP; k--) {
        		long l = palindrome/k;
        		if(l>k) break;
        		if(palindrome%k==0) return (int)(palindrome%1337);
        	}
        	
        }
        return 9;
    }
	public static void main(String[] args) {
		int n =5;
		System.out.println(largestPalindrome(n));
	}

}
