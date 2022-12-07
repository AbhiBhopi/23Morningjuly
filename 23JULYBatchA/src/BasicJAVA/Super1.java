package BasicJAVA;

public class Super1 extends Super {
	
	int a = 60;   // global variable
	
	public void Test() {
	
		
		int a = 70;  // local variable
		
		System.out.println(a); // 70 local variable
		System.out.println(this.a);// 60 global variable from same class
		System.out.println(super.a);// 50 global variable from different class
		
		
	}
	public static void main(String[] args) {
		
		Super1 x = new Super1();
		x.Test();
		
	}
	
	
	
	
	

}
