package commaninterview;

public class Number_of_digit {

	public static void main(String[] args) {
	long num=12346;
	int count=0;
	while(num !=0) {
		num=num/10;
		++count;
	}
System.out.println("number of digits:"+count);

	}

}
