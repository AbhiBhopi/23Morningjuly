package Interface;

public interface Default {
	
	// public is access specifier and default is keyword for interface
	public default void Dmart() {  // Default method of Interface
		System.out.println("Shopping");
	}
	
	public static void PQR() throws InterruptedException {
		System.out.println("Static method running");
		
		Thread.sleep(5000);
	}
	
	
   public  void Mart(); // interface incomplete method
 
 


}
