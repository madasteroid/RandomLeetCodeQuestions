package frogLeafFall;

import java.util.Arrays;


public class medianOfTwoSortedArrays {
	
	
	public static double findMedianSortedArrays(int[]a, int[]b) {
		
		int a1= a.length;
		int b1 = b.length;
		int c1 = a1+b1;
		double globalMed = 0.00;
		
		int [] c = new int[c1];
	
		System.arraycopy(a, 0, c, 0, a1);
		System.arraycopy(b, 0, c, a1, b1);
		Arrays.sort(c);
			if((c.length) % 2 == 1) {
				globalMed = c[c.length/2];
			}
			else {
				globalMed = (double) (c[c.length/2] + c[(c.length/2)-1])/2;
			}
			
		return globalMed;
			
		}
			
	
	
	public static void main(String[] args) {
		int [] a = {1,3,7};
		int [] b = {2};
		System.out.println(findMedianSortedArrays(a,b));
	}

}
