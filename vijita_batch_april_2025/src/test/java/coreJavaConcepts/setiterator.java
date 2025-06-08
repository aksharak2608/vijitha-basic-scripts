package coreJavaConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class setiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,5,2,3,4,2,3,4};
		Set<Integer> s1= new HashSet<Integer>();
		s1=Arrays.stream(a).boxed().collect(Collectors.toSet());
			System.out.println(s1.size());	
			Iterator itr= s1.iterator();
			while(itr.hasNext())
			
		//	for(int i=0;i<s1.size();i++)
			{
				System.out.println(itr.next());
			}
			for(Integer i:s1)
			{
				System.out.println(i);
			}
	}

}
