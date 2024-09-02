
package commaninterview;

public class Checktheleapyear {

	public static void main(String[] args) {
	//divisble by 4 for all the century years---- ending with 00
		// century year is leap year only when its perfertly divisible by 400.
		// 1900 is not a leap year 
		// 2012 leap year
		
		int year= 1900;
		boolean leap=false;
		if(year %4==0) {
			if(year%100==0) {
				leap=true;
				
			}else {
				leap=false;
				
			}
			
		 }
		else {
			leap=true;
			
		}
		
	}
		
	}


