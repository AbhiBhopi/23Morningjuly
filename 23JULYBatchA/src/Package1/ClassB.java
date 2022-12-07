package Package1;

public class ClassB {
	
	
	public static void main(String[] args) {
		ClassA y = new ClassA();
		
		System.out.println(y.a); // calling variable with public access specifier 
	//	System.out.println(y.b);  // calling variable with private access specifier
		System.out.println(y.c);   // calling variable with default access specifier
		System.out.println(y.d);  // calling variable with protected access specifier
		
		
		
	}

}
