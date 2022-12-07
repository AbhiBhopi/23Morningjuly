package Casting;

public class TestUpCasting {
	
	public static void main(String[] args) {
		
		System.out.println("************With super class object*************");
		
		Upcasting x = new Upcasting();
		x.Demo();
		x.Set();
		x.Static();
		Upcasting.Static();
		
		
		System.out.println("************With sub class object*************");
		Upcasting1 y = new Upcasting1();
		
		y.Demo();
		y.Set();
		y.Sub();
		y.Static();
		
		
		System.out.println("************With Upcasting*************");
		
		Upcasting z = new Upcasting1(); // upcasting
		
		z.Demo();
		z.Set();
		z.Static();
		
		System.out.println("*******************Down casting******************");
		
		Upcasting1 ar = (Upcasting1) new Upcasting(); // Down casting syntax
	// Down casting
		
		ar.Demo();
		ar.Set();
		ar.Static();
		ar.Sub();
		
		
		
	}

}
