package coreJavaConcepts;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello welcome to automation class";
		char a='d';
		char[] a1= {'h','e','l','l','o'};
char[] r;
r= s.toCharArray();
System.out.println(r);
StringBuilder sb= new StringBuilder();
for(int i=0;i<a1.length;i++)
{
	sb.append(a1[i]);
}
String r1;
r1=String.valueOf(a1);
r1=String.copyValueOf(a1);
//r1=new String(a1);
System.out.println(r1);
	}

}
