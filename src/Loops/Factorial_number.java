package Loops;
import java.util.Scanner;

public class Factorial_number {

	public static void main(String[] args) {
		int i , n , f=1;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		for(i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println("Factorial is:"+f);
	}

}
