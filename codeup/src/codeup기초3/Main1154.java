package codeup����3;

import java.util.Scanner;

public class Main1154 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(Math.max(a, b)-Math.min(a, b));
		scan.close();
	}

}
