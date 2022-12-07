package Polymorphism;

public class poly {
	
	public  void Addition(int a, int b) {
		System.out.println(a+b);
	}
	
	
	public  void Addition(int a, int b ,int c) {
		System.out.println(a+b+c);
		
		
	}
	
	public static void main(String[] args) {
		poly x = new poly();
		x.Addition(30,40);
		x.Addition(440, 550, 660);
		
	}

}
