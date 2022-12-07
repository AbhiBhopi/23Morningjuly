package OOps;

public class TestGeneralisation {
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("****************Specifications of JIO Operator******************");
		
		JIO x = new JIO();
		x.audiocalling();
		x.Internet();
		x.SMS();
		x.PrimeMember();
		
		System.out.println("****************Specifications of JIO Operator******************");
		
		VI y = new VI();
		y.audiocalling();
		y.Internet();
		y.SMS();
		
		
		System.out.println("****************Specifications of Airtel Operator******************");
		
		Airtel z = new Airtel();
		z.audiocalling();
		z.SMS();
		z.Internet();
		z.AirtelBank();
		
	}

}
