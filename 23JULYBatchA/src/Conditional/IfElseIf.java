package Conditional;

public class IfElseIf {
	
	
	public static void main(String[] args) {
		
		String Projectdomain ="";  // variable declaartion
		
		if (Projectdomain== "HealthCare")  {
		System.out.println("Medical related work");	
		}
		else if(Projectdomain == "Banking") {
			System.out.println("Work related banking transaction");
		}
		else if (Projectdomain =="Telecom" ) {
			System.out.println("Work related to Telecomunication");
		}
		else if (Projectdomain == "Booking portal") {
			System.out.println("Work related to booking tickets");
			
			
			}
		else {
			System.out.println("Random project domain");
		}
		
		
		
	}

}
