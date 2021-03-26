package frogLeafFall;

import java.util.Arrays;
import java.util.LinkedHashSet;
public class removesDublicateLinkedHashSet {
	
	public static void main(String[] args) {
		String names[] = {"Toast","Freezer","Stove", "Stove", "Microwave", "RiceCooker", "Toast"};
		LinkedHashSet<String> newNames = new LinkedHashSet<String>(Arrays.asList(names));
		String[] names2 = newNames.toArray(new String[newNames.size()]);
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(names2));
	}
		
}
	
		


	
	

