package commaninterview;

import java.util.HashSet;

public class mile4 {
	public static void main(String[] args) {
		int number=315;
		primefactors(number);
		
	}

	private static void primefactors(int number) {
	 
		HashSet<Integer>hashset=new HashSet<>();
		for(int i=2;i<=number;i++) {
			while(number%i==0) {
				
				hashset.add(number);
				number=number/i;
				
				
				
			}
		}
		
	}

}
