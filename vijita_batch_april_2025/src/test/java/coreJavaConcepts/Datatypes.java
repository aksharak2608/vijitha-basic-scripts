package coreJavaConcepts;

public class Datatypes {
	static int c=4;//static
	int nv=3;//instance

	public static void main(String[] args) {
		// TODO Auto-generated method stub
short a=1231;
int b,r;
		b=a;
		System.out.println(b);
		byte ba;
		r=a/20;
		ba=(byte)r;
		System.out.println(ba);
		System.out.println(c);
		c=78;
		Datatypes ob=new Datatypes();
		ob.nv=30;
		System.out.println("c value is"+c);

		System.out.println("ob.nv value is"+ob.nv);
		Datatypes ob1=new Datatypes();

		System.out.println("c value is"+c);

		System.out.println("ob1.nv value is"+ob1.nv);
	}

	
	int add(int a, int b)
	{
		 c=a+b;//local
		return c;
	}
}
;