class parent
{
	void m1()
	{
		System.out.print("m1 method");
	}
	
}
 class inher extends parent 
 {
	 void m1 ()
	 {
		 System.out.println("child method");
	 }
	 void m2()
	 {
		 System.out.println("child method 2");
	 }
	 public static void main(String[]args)
	 {
		 parent p=new inher();
		 p.m1();
		inher h=(inher) p;
		h.m2();
	 }

}
