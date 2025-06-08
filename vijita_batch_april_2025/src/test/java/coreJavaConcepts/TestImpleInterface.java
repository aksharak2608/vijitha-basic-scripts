package coreJavaConcepts;

public class TestImpleInterface implements Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestImpleInterface obj= new TestImpleInterface();
		obj.add();
		obj.sub();
	}

	
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("hi add");
	}

	
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("hi sub");
	}
	
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("hi mul");
	}


	@Override
	public void sub(int a) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void add1() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void sub2() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void sub2(int a) {
		// TODO Auto-generated method stub
		
	}

}
