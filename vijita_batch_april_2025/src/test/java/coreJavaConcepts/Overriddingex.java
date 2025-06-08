package coreJavaConcepts;

public class Overriddingex extends Overloadex{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriddingex obj=  new Overriddingex();
		obj.ctest();
		
	}

	
	public void ctest()
	{
		System.out.println("btest");
		super.ctest();
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
