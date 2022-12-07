package Methods;

public class ABC {

	
	public void Demo(){ // Declaring non static method
		
		System.out.println("Non static method Running");
		
	}
	
  public void Memo(){ // Declaring non static method
		
		System.out.println("Non static method Running from Memo");
		
	}
	
	
	
	public static void main(String[] args) {
		
		ABC s = new ABC();
		
		s.Demo(); // non static method call from same class
		s.Memo();
		
	}

}
