class animal1
{
	int num1, num2, result;
	void total()
	{
		result=num1+num2;
		System.out.println("The sum is:" +result);
	}
}
class dog1 extends animal1
{
	void total2()
	{
		result=num1-num2;
		System.out.println("The sbm is:" +result);
	}
}
public class TestInheritance2 {
	public static void main (String[] args)
	{
	dog1 obj=new dog1();
	obj.num1=5;
	obj.num2=3;
	obj.total();
	obj.total2();
	}

}
