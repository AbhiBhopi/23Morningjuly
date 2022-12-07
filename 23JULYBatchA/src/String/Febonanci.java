package String;

public class Febonanci {// 0 1 1 2 3 5 8 13 21 34
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		//int c= 10;
		int d;
		System.out.print(a+" "+b); // 0 1
		
		for(int i=2;i<10;i++) {
			d= a + b; // 0  1 
			System.out.print(" "+d); // 1
			
			a=b;
			b=d;
		}
		
	}

}
