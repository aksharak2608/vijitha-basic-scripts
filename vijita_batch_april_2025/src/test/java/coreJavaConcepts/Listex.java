package coreJavaConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Listex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1= new ArrayList();
		l1.add(4);
		l1.add(3);
		l1.add(null);
		System.out.println(l1);
		Integer a[]= {5,1,2,3,4,4,3,24};
		List<Integer> l2=  new ArrayList<>(Arrays.asList(a));
		System.out.println(l2);
		l2.add(null);
		//l2.add(5);
		System.out.println(l2.reversed());
		List<Integer> result= new ArrayList();
		List<Integer> l3=  Arrays.asList(a);
		System.out.println(l3);
		//l3.add(null);
		//l2.add(5);
		Collections.sort(l3);
		System.out.println(l3);
		
		for(int i=0;i<l2.size();i++)
		{
			System.out.println( l2.get(i));
		}
		int size=l2.size();
		for(int i=0;i<size;i++ )
		{
			int temp=l2.get(i);
			for(int j=i+1;j<size;j++ )
			{
				if(!(temp==l2.get(j))) {
					result.add(temp);
				}
			}
		}
		System.out.println(result);
		
		
		
		
	}

}
