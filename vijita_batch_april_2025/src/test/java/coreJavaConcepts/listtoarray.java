package coreJavaConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listtoarray {

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
	
	Object[] op=new Object[6];
		op=	l1.toArray();
		
		Integer[] op1=new Integer[6];
		l1.toArray(op1);
		for(int i=0;i<op1.length;i++)
		System.out.println(op1[i]);
		
		//array to list when it is a int array
		int[] intArray = {1, 2, 3, 4, 5};

        // Convert the int array to a List
        List<Integer> intList = Arrays.stream(intArray)
                                      .boxed() // Convert primitive int to Integer objects
                                      .collect(Collectors.toList());

        // Print the List
        System.out.println("List: " + intList);

	}
}
