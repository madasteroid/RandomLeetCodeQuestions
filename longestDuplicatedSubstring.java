package frogLeafFall;

import java.util.Arrays;

public class longestDuplicatedSubstring {
	public static String duplicate(String str) {
		char[] string = str.toCharArray();
		int n = string.length;
		for(int i=0; i<n; i++) {
			for(int j= i+1; j<n; j++) {
				if(string[i]==string[j]) {
					
				}
			}
			
		}
		return String.valueOf(string);
	}
	
	public static void main(String[] args) {
		String str = "banana";
		System.out.println(duplicate(str));
		}

}
