package coreJavaConcepts;

public class Chartostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hello welcome to automation class";
		char a='d';
		char[] a1= {'h','e','l','l','o'};
		for(char temp:a1)
		//for(int i=0;i<a1.length;i++)
		{
			System.out.println(temp);
		
		}
		
		String r1;
		//r1=String.copyValueOf(a1);
		//r1=String.valueOf(a1);
		r1= new String(a1);
		System.out.println(r1);
		
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<a1.length;i++)
		{
			sb.append(a1[i]);
			
		}
		System.out.println(sb.insert(4,"test"));

		System.out.println(sb.replace(0,4,"test"));

		System.out.println(sb.capacity());
		StringBuffer sbf= new StringBuffer();
		
		char[] res=s.toCharArray();
		System.out.println(res);
	}

}
