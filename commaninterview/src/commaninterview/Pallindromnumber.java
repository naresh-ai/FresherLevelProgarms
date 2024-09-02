package commaninterview;

public class Pallindromnumber {

	public static void main(String[] args) {
		
  int num=1331;
  int rev=0;
  int actuallnum=num;
  
  while(num !=0) {
	  int n= num%10;
	  rev=rev*10+n;
	  num=num/10;
  }
  System.out.println(rev);
  
  
  if(actuallnum==rev) {
	  System.out.println(num+"is a pallindrome");
  }else {
	  System.out.println(num+"is a not a pallindrome");
  }
	}

}
