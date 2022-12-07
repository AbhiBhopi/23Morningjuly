package Interface;

public class TestDefault1 implements Default{ // new implementation class
	
	public void Mart() { // completed from interface
		
		System.out.println("All shops closed");
		
	}
	
	
	public static void main(String[] args) {
		
		
		TestDefault x = new TestDefault();// object of implementation class
		TestDefault1 y = new TestDefault1();// object of implementation class
		
		
		x.Mart();// complete method from interface to class TestDefault
		x.Dmart();// default method of interface call with impl. class object (imple change)
		
		y.Mart();// complete method from interface to class TestDefault1
		y.Dmart();//default method from interface
		
		Default.PQR();
	}

}
