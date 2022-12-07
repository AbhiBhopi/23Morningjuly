package OOps;

public class Encapsulation {
	
	private int a=10;
	private int b=20;
	
	
	Encapsulation(){
		
		a=34;
		b=65;
		
	}
	
	Encapsulation(int c, int d){
		
	   a=c;
	   b=d;
		
	}
	
	
	public void Test() {
		int c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Encapsulation a = new	Encapsulation(50,60);
		a.Test();
		
	}
	
	
	
	

}
