package Interface;

public class TestPractice extends Practice {   // concrete class
	
	
	public void Test() {  // incomplete method from abstract class is completed here
		
		System.out.println("Method from abstract class completed in concrete class");
		
	}
	
public static void main(String[] args) {
		
		TestPractice x = new TestPractice();
		x.Demo();
		x.Test();
		

	}	
	
	
	

}
