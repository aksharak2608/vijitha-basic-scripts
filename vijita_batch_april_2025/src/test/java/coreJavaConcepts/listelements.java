package coreJavaConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class listelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> l1= new ArrayList();
	l1.add(4);
	l1.add(3);
	l1.add(null);
	l1.add(41);
	l1.add(31);
	l1.add(null);
	System.out.println(l1);
	
	for(int i=0;i<l1.size();i++)
	{
		//System.out.println( l1.get(i));
	}
	
	ListIterator<Integer > iter1=l1.listIterator();
	while(iter1.hasNext())
	{
		System.out.println(iter1.next());
	}
}
}