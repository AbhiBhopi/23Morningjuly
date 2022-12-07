package Methods;

public class TestAbstract extends ABCD {
	
	
	
	public void Test() {
		System.out.println("Abstract method converted to complete");
	}
	
	public static void main(String[] args) {
		
	
	TestAbstract x = new TestAbstract();
	x.Test();
	x.Demo();
	
	}
}
