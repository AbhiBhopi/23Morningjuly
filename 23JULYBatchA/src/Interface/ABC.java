package Interface;

public class ABC implements A{
	
	
	public void Demo() {
		System.out.println("Demo method started");
		
		
	}
	
	public void Test() {
		System.out.println("Test method started");
		
	}
	
	public static void main(String[] args) {
		ABC x=new ABC();
		x.Demo();
		x.Test();
	}

}
