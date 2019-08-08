package Javatpoint;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args)
	{
		
	String original, rev="";
	
	Scanner sc= new Scanner(System.in);
	
	original=sc.nextLine();
	
	int length=original.length();
	
	for(int i=length-1;i>=0;i--)
	{
		rev=rev+original.charAt(i);
		
	}

	if(original.equalsIgnoreCase(rev))
	{
		System.out.println("yes");
	}
	else {
		System.out.println("not");
}
}
	}
	