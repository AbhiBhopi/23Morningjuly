package Constructor;

import java.util.Scanner;

public class scan {
public static void main(String[] args) {
		
		Scanner Demo = new Scanner(System.in); // scanner class object
		
		System.out.println("Enter integer value");
		
		int value = Demo.nextInt();
		System.out.println("Your enter value is " + value);
		
		System.out.println();
		
		System.out.println("Enter float value");
		float value1 = Demo.nextFloat();
		System.out.println("Your enter value is " + value1);
		System.out.println();
		
		System.out.println("Enter String value");
		
		String value2= Demo.next();
		System.out.println("Your enter string is " + value2);
		
		
		Demo.close();
	}
}
