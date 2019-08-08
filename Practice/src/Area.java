
public class Area {
	int length;
	double breath;
	int height; 
	double result;
	double result1;
	
	Area(int length, int b, int h)
	{
	length=length;
	breath=b;
	height=h;
	}
	
	Area(int l, double d)
	{
	length=l;
	breath=d;
	
	
	}
	public void result()
	{
		result=length*breath*height;
		System.out.println("result is "  + result);
	
	}
	public void result1 ()
	{
		result1=length*breath;
		System.out.println("result1 is "  + result1);
	}
	
public static void main (String [] args)
{
	Area obj=new Area(20,10,30);
	obj.result1();
	Area obj1=new Area(10,2.2);
	obj1.result1();
	
	
}
}
