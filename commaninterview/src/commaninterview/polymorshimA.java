package commaninterview;

class multiply {
	void mul( int a, int b) {
		System.out.println(" sum of a+b");
	}
	 void mul(int a,int b ,int c) {
		 System.out.println("sum of three =a+b+c");
	 }
}

public class polymorshimA {
	public static void main(String[] args) {
		multiply m = new multiply();
		m.mul(2,3);
		m.mul(5, 7, 8);
	}

}
