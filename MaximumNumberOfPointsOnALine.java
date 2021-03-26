package frogLeafFall;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumNumberOfPointsOnALine {
	public static int MaxPoints(int[][] points) {
		int n = points.length;
		if(n<2) return n;
		int max =1;
		Set<String> set = new HashSet<>();
		for(int i=0; i<n&& !set.contains(points[0]+"-"+points[1]) ; i++) {
			int[] a = points[i];
			int same = 0;
			int local_max =1;
			Map<Double,Integer> map = new HashMap<>();
			for(int j=i+1; j<n; j++) {
				if(isSame(a,points[j])) {
					same++;
					continue;
				}
				
				double slope = getSlope(a,points[j]);
				map.put(slope, map.getOrDefault(slope, 1)+1);
				local_max = Math.max(local_max, map.get(slope));
			}
			set.add(a[0]+"-"+a[1]);
			max = Math.max(max, local_max+same);
		}
		return max;
		
	}
	private static boolean isSame(int[] a, int[] b) {
		return a[0]==b[0]&&a[1]==b[1];
	}
	private static double getSlope(int[]a, int[]b) {
		if(a[0]==b[0]) return Double.MAX_VALUE;
		if(a[1]==b[1]) return 0;
		return ((double)a[0]-b[0])/((double)a[1]-b[1]);
	}
	
	public static void main(String[] args) {
		int[][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
		System.out.println(MaxPoints(points));
	}

}
