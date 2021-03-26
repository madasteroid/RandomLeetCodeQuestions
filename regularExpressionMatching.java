package frogLeafFall;

public class regularExpressionMatching {
	public static boolean regular(String s, String p) {
		char[] sl = s.toCharArray();
		char[] pl = p.toCharArray();
		
		boolean RDP [] [] = new boolean [sl.length + 1][pl.length + 1];	
		RDP[0][0] = true;
		for(int i=1; i < RDP[0].length; i++) {
			if(pl[i-1]=='*') {
				RDP[0][i]= RDP[0][i-2];
			}
		}
		
		for(int i=1; i < RDP.length; i++) {
			for(int j=1; j < RDP[0].length; j++) {
				if(pl[j-1]=='.' || pl[j-1] == sl[i-1]) {
					RDP[i][j] = RDP[i-1][j-1];
				}else if(pl[j-1]=='*') {
					RDP[i][j]= RDP[i][j-2];
					if(pl[j-2]=='.'|| pl[j-2]==sl[i-1]) {
						RDP[i][j] = RDP[i][j]|RDP[i-1][j];
					}
				}
				else {
					RDP[i][j] = false;
				}
			}
			
		}
		return RDP[sl.length][pl.length];
		
	}
	
	
	public static void main(String[] args) {
		String s = "aab";
		String p = "c*a*b";
		System.out.println(regular(s,p));
	}

}
