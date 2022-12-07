package Methods;

public class StaticNonstatic {
	

	static int a=10;
	int b= 20;
	
	public static void main(String[] args) {
		System.out.println("Static variable ="+a);
		
		StaticNonstatic x = new StaticNonstatic(); // object creation
		
		System.out.println("NOn-static variable call with ref of x ="+x.b);
		
		StaticNonstatic y = new StaticNonstatic(); // object creation
		System.out.println("NOn-static variable call with ref of y ="+y.b);
		
		x.b=45;
		System.out.println("NOn-static variable call with ref of x updated ="+x.b);
		System.out.println("NOn-static variable call with ref of y updated ="+y.b);
		
		System.out.println("static variable call with ref of x ="+x.a);
		System.out.println("static variable call with ref of y ="+y.a);
		
		x.a =80;
		System.out.println("static variable call with ref of x updated ="+x.a);//80
		System.out.println("static variable call with ref of y updated ="+y.a);//80
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
