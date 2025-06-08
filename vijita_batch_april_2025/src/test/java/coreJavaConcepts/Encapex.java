package coreJavaConcepts;

public class Encapex {
	private int a, b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriddingex obj=  new Overriddingex();
		obj.ctest();
		obj.setter(5, 6);
		System.out.println(obj.gettera());
		
	}

	
	private void ctest()
	{
		System.out.println("btest");
		
	}
	
	private int ctest(int i)
	{
		System.out.println("btest2" +i);
		return i;
	}
	
	public int  getter()
	{
		
		return ctest(5);
	}
	public void setter(int a, int b)
	{
		this.a=a;
		this.b=b;
		
	}
	
	public int  gettera()
	{
		
		return this.a;
	}
}
