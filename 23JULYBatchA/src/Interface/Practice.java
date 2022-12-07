package Interface;

public abstract class Practice {
	
	
	public static void Display() {
		
		System.out.println("complete static method");
		
	}
	
	public void Demo() { 
		
		// complete method
		
		System.out.println("Complete method");
		
	}
	
	
	public abstract void Test();   // incomplete method
	
	public static void main(String[] args) {
		Practice.Display();
		
	}

}
