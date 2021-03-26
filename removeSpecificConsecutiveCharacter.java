package frogLeafFall;

import java.util.Arrays;

public class removeSpecificConsecutiveCharacter {
	public static String remove(String p) {
		char[] pl = p.toCharArray();
		boolean isSame = true;
		
		
		int counter =0;
		for(int i=0; i<pl.length; i++) {
			if(pl[i]== '*') {
				if(isSame) {
					pl[counter++] = pl[i];
					isSame = false;
				}
			}else {
				pl[counter++] = pl[i];
				isSame = true;
			}
		}
		
		return String.valueOf(Arrays.copyOfRange(pl, 0, counter));
		
	}
	public static void main(String[] args) {
		String p = "?a**b***c**d";
		System.out.println(remove(p));
		
	}

}
