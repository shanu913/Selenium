
abstract class Test {
	Test()
	{
		System.out.println("abstract claa cons");
	}
	abstract void m1();	
}

class Test1 extends Test
{
	Test1()
	{
		System.out.println("normal claa cons");
	}
	void m1()
	{
		System.out.println("m1 method");
	}
	public static void main (String[] args)
	{
		Test1 t=new Test1();
	
	}
}