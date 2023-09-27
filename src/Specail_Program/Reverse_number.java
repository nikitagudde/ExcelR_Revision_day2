package Specail_Program;

import java.util.Scanner;

public class Reverse_number {
	public static void main(String [] args) {
		int n,r;
		int sum=0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=(sum+10)+r;
			
		}
		System.out.println("Reverse number is"+sum);
		
		
	}

}
