package commaninterview;

import java.util.Scanner;

public class mile22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the costprice");
		 double cp=sc.nextDouble();
		 System.out.println("enter the sellingprice");
		 double sp=sc.nextDouble();
		 if(sp-cp>0) {
			 System.out.println("loss:"+(cp-sp));
			 
		 }
		 else if(sp-cp<0)
		 {
			 System.out.println("profit:"+(cp-sp));
			 
		 }else
			 System.out.println("neutral");
	}
		

}
