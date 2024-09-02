package commaninterview;

public class powerof2 {
	 public static void main(String[] args) {
		  System.out.println("128 is power of two : "+powerOfTwoGeneral(128));
		  System.out.println("64 is power of two : "+powerOfTwoBitwise(64));
		  System.out.println("22 is power of two : "+powerOfTwoBitwise(22));
		  System.out.println("22 is power of two : "+powerOfTwoGeneral(22));
		 }
		 // Approach 1
		 public static boolean powerOfTwoGeneral(int n)
		 {
		  while(n%2==0)
		  {
		   n=n/2;
		  }
		  if(n==1)
		  {
		   return true;
		  }
		  else
		  {
		   return false;
		  }
		 }
		 // Approach 2
		 public static boolean powerOfTwoBitwise(int n)
		 {
		  return (n & n-1)==0;
		 }
		 
		}


