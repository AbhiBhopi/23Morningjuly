package Methods;

public class ABC123 {
	
	public void TaTa() {
		int s = 78;
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		ABC s = new ABC(); // Object creation for calling non static method
		s.Demo(); // calling non static method in different class
		s.Memo();
		
		
		ABC123 a = new ABC123();
		a.TaTa();
	}
	
	

}
