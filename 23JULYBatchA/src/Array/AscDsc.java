package Array;

import java.util.Arrays;

public class AscDsc {
	
	public static void main(String[] args) {
		
		int s[] = {15,70,80,10,50,56};// declaratioin of array
		
		System.out.println("----------Array all info--------------");
		
		for(int i =0;i<=s.length-1;i++) {
			System.out.println(s[i]);
			
		}
		
		Arrays.sort(s);
		System.out.println("-------Array all info in Ascending order------------");
		
		for(int i =0;i<=s.length-1;i++) {
			System.out.println(s[i]);
			
		}
		//System.out.println(s[1]); // 20
		
		
System.out.println("-------Array all info in Descending order------------");
		
		for(int i =s.length-1;i>=0;i--) {
			System.out.println(s[i]);
			
		
	}System.out.println(s[1]);
	}

}
