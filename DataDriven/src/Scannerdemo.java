import java.io.InputStream;
import java.util.Scanner;

public class Scannerdemo {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
 
        // String input
        String name = sc.nextLine();
        
        System.out.println(name);
        
        int age= sc.nextInt();
        
        System.out.println(age);    }

}