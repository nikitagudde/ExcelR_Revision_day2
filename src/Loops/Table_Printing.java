package Loops;

import java.util.Scanner;

public class Table_Printing {

	public static void main(String[] args) {
		int i, n, t;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (i = 1; i <= 10; i++) {
			t = i * n;
			System.out.println(t);

		}

	}

}
