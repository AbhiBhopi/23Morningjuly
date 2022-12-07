package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class Basic {
	
public static void main(String[] args) {
	
	Hashtable<Integer,String> table = new Hashtable <Integer,String>();
	
	table.put(34, "Testing");
	table.put(35, "Manual");
	table.put(76, "sdfgh");
	table.put(90, "ASDFGHJ");
	table.put(43, "JAVA");
	table.put(21, "API");
	table.put(45, "67890");
	
	for(Map.Entry<Integer,String> m : table.entrySet()) {
		System.out.println(m.getKey()+ " " + m.getValue() );
	}
	
	
	
	System.out.println("******************************************");
	
	for(Map.Entry<Integer,String> m : table.entrySet()) {
		System.out.println(m.getKey()+ " " + m.getValue() );
	}
	
	}
	
}


