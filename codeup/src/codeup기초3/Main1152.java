package codeup����3;

import java.util.Scanner;

public class Main1152 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		if(a<10) {
			System.out.println("small");
		}
		else {
			System.out.println("big");
		}
		scan.close();
	}

}
