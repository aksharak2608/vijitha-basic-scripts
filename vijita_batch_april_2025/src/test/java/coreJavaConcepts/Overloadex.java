package coreJavaConcepts;

public class Overloadex extends Encapex{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloadex obj= new Overloadex();
		obj.ctest();
		obj.ctest('w');
		obj.ctest(0);
		obj.getter();
	}

	
	public void ctest()
	{
		System.out.println("btest");
		this.ctest(0);
	}
	
	public void ctest(int i)
	{
		System.out.println("btest2" +i);
	}
	public void ctest(char i)
	{
		System.out.println("btest2 "+ i);
	}
}
