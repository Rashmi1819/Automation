package qsp;

public class A {
	 void testA()
	{
		System.out.println("HI");
		
	}
	void testA(int i) 
	{
		System.out.println(i);
		
	}
}

class B{
	public static void main()
	{
		A a1=new A();
		a1.testA();
		
	}		
	
}