
package Loops;
import java.util.Scanner;

public class Prime_number_or_not  {

	public static void main(String[] args) {
		int n,i;
		
		boolean go=false;
		
		System.out.println("enter the number");
		
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		if(n>=1)
		{
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				go=false;
			}
			
			else
			{
				go=true;
			}
		}
		}
		
		else
		{
			System.out.println("num is less than 1");
		}
		
		if(go)
		{
			System.out.println("number is prime");
		}
		else 
		{
			System.out.println("num is not prime ");
		}
		

	}

}
