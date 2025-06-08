package coreJavaConcepts;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Test obj=new Test();
	int c=	obj.Add(5,6);
	float ab=23.6f;
	System.out.println(c);
String s="30";
b=Integer.parseInt(s);
System.out.println(b);
int b1=50;
s=String.format("% d", b1);
//%d is the formate specifier for idecimal integer
System.out.println(s);
	}
	int  Add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		return c;
	}

}
