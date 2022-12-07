package String;

public class Demo {
	
	public static void main(String[] args) {
		
		String a = "velocity";
		String b = "velocity";
		
		String c = new String("velocity");
		String d = new String ("velocity");
		
		
		System.out.println(a==b);// True
		System.out.println(c==d);// False comparison of adress
		System.out.println(a==c);// false
		
		System.out.println("------------------------");
		
		b= "class";
		
		System.out.println(b);
		System.out.println(a);
		System.out.println(a==b);// false
		
		System.out.println("---------------------------------------");
		
		
		b="velocity";
		System.out.println(b);
		System.out.println(a);
		System.out.println(a==b);// false
		
		
	}

}
