
public class instance {
	static int count=0;
	{
		count++;
	}
	void instance()
	{
		
	}
	instance(int i)
	{
		
	}
	public static void main(String[]args)
	{
		//instance t1=new instance();
		instance t2=new instance(10);
		System.out.println("The no. of object"  + count);
		
	}

}
