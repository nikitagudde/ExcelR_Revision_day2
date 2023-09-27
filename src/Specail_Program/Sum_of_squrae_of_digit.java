package Specail_Program;

import java.util.Scanner;

public class Sum_of_squrae_of_digit {
	public static void main(String [] args) {
		int r, n;
		int sum = 0;
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r*r;
		}
		System.out.println("Sum of Digit="+sum);
		
	}

}
