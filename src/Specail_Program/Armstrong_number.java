package Specail_Program;
import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		int r, n ;
		int sum =0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
			
		}
		if(sum==n) {
			System.out.println("num is armstrong");
			
		}
		else {
			System.out.println("num is not armstrong");
		}
		
		

	}

}
