package Specail_Program;
import java.util.Scanner;
public class Palidrom_Number {
	public static void main(String [] args) {
		int n ,r,t;
		int sum =0;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		t=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=(sum*10)+r;
		}
		if (sum==t) {
			System.out.println("num is palidrom");
		}else {
			System.out.println("num is not palidrom");
		}
		
		
	}
	
	

}
