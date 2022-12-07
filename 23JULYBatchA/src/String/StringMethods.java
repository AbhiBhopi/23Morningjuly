package String;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String a = "velocity";
		String b ="VELOCITY";  // 0 1 2 3 4 5 6 7
		String c ="city";
		
		System.out.println(a.replace("o", "TATA"));// it replace some char from string
		System.out.println(b.isEmpty());// false or true
		System.out.println(c.concat(a));// String concating thet means adding
		System.out.println(b.substring(0, 7));
		System.out.println(a.substring(3));
		System.out.println(a.endsWith("y"));// true or false
		System.out.println(a.startsWith("velo"));//true or false
		System.out.println(a.lastIndexOf("e"));
		System.out.println(a.indexOf("e"));
		System.out.println(b.charAt(3));
		System.out.println(a.contains("city"));
		System.out.println(a.equals(b));
		System.out.println(b.equalsIgnoreCase(a));
		System.out.println(a.length());
		System.out.println(b.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a==b);
		
		
		String s = String.join(b,a,c);
		System.out.println(s);
		
		
		
		
		
		
		
	}
	

}
