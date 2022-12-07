package String;

public class Reverse {
	
	public static void main(String[] args) {
		
		String a= "121";
		String rev="";
		
		for(int i =a.length()-1;i>=0;i--) {
			rev = rev + a.charAt(i);
			
			
		}
		System.out.println(rev);
		
		if(a.equals(rev)) {
			System.out.println("Given string is pallindrome");
			
			
		}
		else {
			System.out.println("Given string is not pallindrome");
		}
		
		
	}

}
