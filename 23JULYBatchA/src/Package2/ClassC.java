package Package2;

import Package1.ClassA;

public class ClassC {
	
	public static void main(String[] args) {
		
		ClassA z = new ClassA();
		
		System.out.println(z.a); // calling variable with public access specifier 
		//System.out.println(z.b);  // calling variable with private access specifier
		//System.out.println(z.c);   // calling variable with default access specifier
		//System.out.println(z.d);  // calling variable with protected access specifier
		
	}

}
