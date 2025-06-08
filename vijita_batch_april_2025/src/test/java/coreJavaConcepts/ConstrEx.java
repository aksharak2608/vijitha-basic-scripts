package coreJavaConcepts;

public class ConstrEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstrEx obj= new ConstrEx();
		obj.add();
		
		ConstrEx obj1= new ConstrEx(5);
	}
	
	public void add()
	{
		System.out.println("add test");
	}
	ConstrEx()
	{
		System.out.println("constructor");
	}
	ConstrEx(int a)
	{
		System.out.println("constructor "+a);
	}
}
