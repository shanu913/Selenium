package Javatpoint;

public class Child extends Parent
{
	void m1()
	{
		System.out.println("child m1 method");
	}
	
	void m2()
	{
		System.out.println("child m2 method");
	}
	
	public static void main(String [] args)
	{
		Child c=(Child) new Parent();
		c.m1();
	}

	Parent p=new Child();
	
	Child ch=(Child)p;
}
