package commaninterview;

public class Sum_of_nat_no {

	public static void main(String[] args) {
		int num=5;
		int sum=0;
		//1+2+3+4+5.......+100=>500
			for(int i=1;i<=num;i++) {
				sum=sum+i;
				
			}
			System.out.println("sum is"+sum);
	}

}
