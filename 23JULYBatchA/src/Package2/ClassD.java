package Package2;

import Package1.ClassA;

public class ClassD extends ClassA {
	
	public static void main(String[] args) {
		
	
		ClassD x = new ClassD();
	
	System.out.println(x.a); // calling variable with public access specifier 
 //System.out.println(x.b);  // calling variable with private access specifier
//	System.out.println(x.c);   // calling variable with default access specifier
	System.out.println(x.d);  // calling variable with protected access specifier
	
	
	}
}
