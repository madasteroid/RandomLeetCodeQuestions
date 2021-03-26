package frogLeafFall;


public class WildcardMatching {
	public static boolean isMatching(String s, String p) {
		char[] sl = s.toCharArray();
		char[] pl = p.toCharArray();
		int k =0;
		
		boolean isFirst = true;
		
		for(int i=0; i<pl.length; i++) {
			if(pl[i]=='*') {
				if(isFirst) {
					pl[k++]=pl[i];
					isFirst = false;
				}
			}
			else {
				pl[k++] = pl[i];
				isFirst = true;
				
			}
		}
		
		boolean DP[][] = new boolean[sl.length +1] [k +1];
		
		if(k>0 && pl[0]=='*') {
			DP [0][1] = true;
		}
		DP[0][0] = true ;
		
		for(int i=1; i<DP.length; i++) {
			for(int j=1; j<DP[0].length; j++) {
				if(sl[i-1]== pl[j-1] || pl[j-1]=='?') {
					DP[i][j] = DP[i-1][j-1];
				}else if(pl[j-1]=='*') {
					DP[i][j] = DP[i-1][j]||DP[i][j-1];
				}
			}
		}
		return DP[sl.length][k];
	}
	
	
	
	//removes consecutive asterisks as one or many asterisks means same
//	private static String removeDoubleAsterisks(String p) {
//		char[] pChar = p.toCharArray();
//		if(pChar.length<2) return String.valueOf(pChar);
//		int j =0;
//		boolean isFirst = true;
//		
//		for(int i=0; i<pChar.length; i++) {
//			if(pChar[i]=='*') {
//				if(isFirst) {
//					pChar[j++]=pChar[i];
//					isFirst = false;
//				}
//			}
//			else {
//				pChar[j++] = pChar[i];
//				isFirst = true;
//				
//			}
//		}
//		pChar = Arrays.copyOfRange(pChar, 0, j);
//		return String.valueOf(pChar);
//		
//	}
	
	public static void main(String[] args) {
		String s = "acdcb";
		String p = "a*c?b";
		System.out.println(isMatching(s, p));
	}

}
