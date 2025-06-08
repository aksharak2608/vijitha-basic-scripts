package coreJavaConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class arraytoset {
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,2,3,4};
		Set<Integer> s1= new HashSet<Integer>();
		s1=Arrays.stream(a).boxed().collect(Collectors.toSet());
			System.out.println(s1);	
			String b[]= {"wer","werw","wer"};
			Set<String> s2= new HashSet<String>();
			s2=Arrays.stream(b).collect(Collectors.toSet());
			System.out.println(s2);
			s2.add("werwer");
			Set<String> s3= new HashSet<String>();
			//s3=s2;
			s3.addAll(s2);
			System.out.println(s3);
			s2.remove("werwer");
			System.out.println(s2);

			System.out.println(s3.contains("wer"));
			System.out.println(s3.containsAll(s2));
			String op[]=s3.toArray(new String[0]);
			for(int i=0;i<op.length;i++)
			{
				System.out.println(op[i]);
			}
			


				//.collect(Collectors.toSet());
		//System.out.println(s1);
		//s1.
	}

}
