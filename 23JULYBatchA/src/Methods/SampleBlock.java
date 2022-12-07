package Methods;

public class SampleBlock {
	
	static { 
		
		System.out.println("static block running");
		
	}
	
	{
		System.out.println("Non static block is running");
	}
	
	
	public static void main(String[] args) {
		
		SampleBlock a = new SampleBlock();
		
		System.out.println("Main method started");
		
		SampleBlock u = new SampleBlock();
		
		
	}

}
