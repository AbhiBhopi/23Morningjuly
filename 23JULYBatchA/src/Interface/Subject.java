package Interface;

public class Subject implements R {
	
	public void Math() {
		System.out.println("Math method");
	}
	
	
	public void Science() {
		System.out.println("Science Method");
	}
	
	public void Physics() {
		System.out.println("Physics Method");
	}
	
	public void Chemistry() {
		System.out.println("Chemistry Method");
	}
	
	public static void main(String[] args) {
		
		Subject x = new Subject();
		x.Math();
		x.Physics();
		x.Science();
		x.Chemistry();
		
	}

}
