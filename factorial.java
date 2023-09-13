
import java.util.Scanner;

public class factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num= sc.nextInt();
		int temp =num;
		int fact = 1;

		for (; num>=1; num--)
			
			{
			fact = fact*num;
			} 
		System.out.println("Factorial of "+temp +" is "+ fact); 
		
		
		
    }
}
	