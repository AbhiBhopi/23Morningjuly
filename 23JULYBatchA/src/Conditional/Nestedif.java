package Conditional;

public class Nestedif {
	
	public static void main(String[] args) {
		String UN = "AC";
		String PWD = "XYZ";
		
	if (UN == "A") { // condition 1 true
		System.out.println("User name is correct");
		
		
		if(PWD=="XY") { //condition 2 
			System.out.println("Password is correct");
			System.out.println("Login is succesful");
			
		}
		else {
			System.out.println("Wrong password");
			System.out.println("Login is failed");
		}
		
	}
	else {
		System.out.println("Wrong username");
		System.out.println("Login failed");
	}
		
		
		
		
	}

}
