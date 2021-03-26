package frogLeafFall;

public class intToEnglishWords {
	public static String Solution(int num) {
		if(num==0) return "Zero";
		return helper(num);
	}
	public static String helper(int num) {
		String[] belowTen = {"", " One"," Two"," Three"," Four"," Five"," Six"," Seven"," Eight"," Nine"};
		String[] belowTwenty = {" Ten "," Eleven"," Twelve"," Thirteen"," Fourteen"," Fifteen"," Sixteen"," Seventeen"," Eighteen"," Nineteen"," Twenty"};
		String[] belowHundred = {" "," "," Twenty"," Thirty"," Fourty"," Fifty"," Sixty"," Seventy"," Eighty"," Ninety"};
	
		if(num<10) {
			return belowTen[(int) num];
		}
		else if(num<20) {
			return belowTwenty[(int) (num-10)];
		}
		else if(num<100) {
			return (belowHundred[(int) (num/10)] +  belowTen[(int) (num%10)]);
		}
		else if(num<1000) {
			
			return (helper(num/100)+ " Hundred" + helper(num%100));
		}
		else if(num<1000000) {
			return (helper(num/1000)+ " Thousand" + helper(num%1000));
		}
		else if(num<1000000000) {
			return (helper(num/1000000) + " Million" + helper(num%1000000));
		}
		
		return null;
		
		
	}
	
	public static void main(String[] args) {
		int num =  100;
		System.out.println(Solution(num));
	}

}
