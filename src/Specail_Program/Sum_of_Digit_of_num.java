package Specail_Program;
import java.util.Scanner;
public class Sum_of_Digit_of_num {
	public static void main(String [] args) {
		int t, n;
		int sum = 0;
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(n>0) {
			t=n%10;
			n=n/10;
			sum=sum+t;
		}
		System.out.println("Sum of Digit="+sum);
		
	}

}
