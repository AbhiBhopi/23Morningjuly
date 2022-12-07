package Casting;

public class Son extends Father {  // performing inheritance
	
	public void Bike() {  // property from subclass
		
		System.out.println("Son property bike");
	}
	
	
	
	public static void main(String[] args) {
		
		
		Father x = new Son(); // upcasting syntax
		
		// super class  ref variable = new   Sub class();
		
		x.Car();
		x.Home();
		
		
	}

}
