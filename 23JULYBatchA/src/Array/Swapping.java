package Array;

public class Swapping {
	
	
	public static void main(String[] args) {
		
		
		int a[]= {30,50,60,54,65,78,29};
		
		for (int i =0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		
		
		for(int i =0;i<(a.length/2);i++) {
			int z; // news variable declare
			
			z = a[i];
			a[i]=a[(a.length-1)-i]; // a[5]
			
			a[(a.length-1)-i]=z;
			
		}
		System.out.println();
		
		System.out.println(a[4]);
		
		
		
		for (int i =0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		
		
	}

}
