package frogLeafFall;

import java.util.Arrays;

public class indexRepeatingString {
	public static String repeatIndex(String[] str ) {
		int n = str.length;
		
		for(int i=0; i<n; i++) {
			int count = 0;
			for(int j=i+1; j<n; j++) {
				if(str[i].equals(str[j])) {
					count++;
					str[j] = str[j] + count;
				}
			}
		}
		return Arrays.toString(str);
	}
	
	public static void main(String[] args) {
		
		String[] str = {"Apple", "Ball","Cat","Dog","Elephant","Apple","Dog","Ball","Apple","Orange","Elephant","Onion","Risk","Cat","Apple","Dog","Jesus"};
		System.out.println(repeatIndex(str));
	}
}
