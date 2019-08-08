
public class emp {
void m1 ()
{
System.out.println("m1 method");	
}
static void m2()
{
	System.out.println("m2 method");
}
public static void main (String[]args)
{
	//emp e1=new emp();
	e1.m1(new emp());
	emp.m2();
}
}