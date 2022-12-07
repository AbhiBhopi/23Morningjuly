package Methods;

public class GlobalLocal {
	
	
	int a = 80;// global variable declared outside the method
	
	public void Test() {
		
		int b =78; // Local variable inside method 
		int a=45;
		System.out.println(a);
		System.out.println(b);
	}
	
	public void Test1() {
		int c = 90;  // Local variable inside method 
		int b = 12;
		
		System.out.println(a);// global variable printing
		System.out.println(b);
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		
		GlobalLocal x = new GlobalLocal();
		
		System.out.println(x.a);
		
		x.Test();  // 78,45
		x.Test1();// 80,12,90
		
	}
	
	
	
	

}
