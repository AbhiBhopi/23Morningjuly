package Inheritance;

public class TestHirarchicle {
	public static void main(String[] args) {
		
		
		Son x = new Son();
		x.Bike();
		//System.out.println(x.a);
		x.Car();
		x.Money();
		x.Home();
		
		System.out.println("Methods from another sub class");
		
		Son123 y = new Son123();
		y.Laptop();
		y.Car();
		y.Money();
		y.Home();
		//System.out.println(y.a);
	}

}
