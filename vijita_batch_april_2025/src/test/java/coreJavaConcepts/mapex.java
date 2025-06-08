package coreJavaConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Map<Integer, String>m1= new HashMap<>();
 m1.put(1, "hello");
 m1.put(3,"welcom2");
 m1.put(2, "you are");
 System.out.println(m1);
 
 System.out.println(m1.get(1));
 System.out.println(m1.keySet());
 System.out.println(m1.values());
 System.out.println(m1.entrySet());
 
 for(Map.Entry<Integer, String> entry: m1.entrySet())
 {
	 System.out.println(entry.getKey());
	 System.out.println(entry.getValue());
 }
 
 
 
	}
	
	

}
