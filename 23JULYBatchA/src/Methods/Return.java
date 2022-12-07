package Methods;

public class Return {
	
	static int Memo() {  // user define with int return type
		
		int x = 15;
		int y =30;
		int  z= x+y;
		System.out.println(z);
		return z ;
		
		
	}
	
	static String xyz(){     // user define with String return type
		return "Welcome to velocity";
		
	}
	
	public static void main(String[] args) {
		
		Memo();
		
		
		//String a = Test();
		//System.out.println(a);
		
	}
	

}
