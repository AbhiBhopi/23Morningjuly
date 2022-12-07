package BasicJAVA;

public class This {
	
int a = 70;   // Global variable


public void Demo() {
	int a =80;      // local variable
	
	System.out.println(a);
	
	System.out.println(this.a); // calling global variable
	
}

public static void main(String[] args) {
	
	This x = new This();
	x.Demo();
}

	
	
	
	
	
	

}
