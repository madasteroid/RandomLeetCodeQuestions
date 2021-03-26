package frogLeafFall;

public class Frog {
	static char[] reverse(String str) {
		int n = str.length();
		char []ch = str.toCharArray();
		char temp;
		for(int i =0, j=n-1; i<j; i++,j--) {
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		return ch;
	}
	
	public static void main(String args[]) {
		String str = "Computer";
		System.out.println(str);
		char []reverse1 = reverse(str);
		String str2 = String.valueOf(reverse1);
		System.out.println(str2);
		if(str.equals(str2)) {
		System.out.println("This is a palindrome.");	
		}
		else {
		System.out.println("This is not a palindrome.");
		}
	}

}
