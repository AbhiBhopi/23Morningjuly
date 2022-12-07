package Constructor;

public class ConsSample {
	
	int a ;
	int b;
	int m;
	String name;
	String velocity;
	

	
	
	ConsSample(){ // user define cons with  zero argument / parameter
		
		 a = 89;
		 b =90;
	
	}
	
	
	ConsSample(int c , int d){ // user define cons with  Argument / Parameter
		
		a=c;
		b=d;
		
	}
	
	
ConsSample(int c ,int d, int i){ // user define cons with  Argument / Parameter
		
		a=c;
		b=d;
		m=i;
		System.out.println(m+a+b);
	}
	
ConsSample(String p,String q){// user define cons with  Argument / Parameter
	name =p;
	velocity =q;
}
	public void addition() {
		System.out.println(m+a+b);
	}
	
	public void St() {
		System.out.println(name);
		System.out.println(velocity);
		
	}
	
	public static void main(String[] args) {
		
		ConsSample y = new ConsSample(700,800,90);
		y.addition();
		ConsSample r = new ConsSample(700,900,990);
		
		ConsSample x = new ConsSample();
		x.addition();
	//	x.St(); // null
		
		ConsSample z = new ConsSample(70,80);
		z.addition();
		
		ConsSample j = new ConsSample("RAMESH","TESTING");
		j.St();
		
	}
	
	
	
	
	
	

}