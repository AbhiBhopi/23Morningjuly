package Operators;

public class LogicAnd {
	
public static void main(String[] args) {
	
	//&& operator
	
	System.out.println((10>5)&& (12>6));//true
	System.out.println((10<5)&& (2>6));// false	
	
	
	// || OR Operator
	
	System.out.println((12>45)|| (34>87));// false
	System.out.println((12<3)||(5>2));// True
		
	// Not operator !	
	
	System.out.println(!(3==5));// true
	System.out.println(!(3==3));// false
		
	}

}
