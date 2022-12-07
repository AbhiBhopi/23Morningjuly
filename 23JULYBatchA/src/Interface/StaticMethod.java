package Interface;

public class StaticMethod implements MethodsStat{
	
	
	public void Display() { // method from interface is completed
		System.out.println("Non static method running");
	}
	
	
	public static void main(String[] args) {
		
		
		StaticMethod x = new StaticMethod(); // implementation class object
		
		x.Display();
		MethodsStat.Show();// static method of interface call with interface name only
		
	}

}
