package codeup기초3;

import java.util.Scanner;

public class Main1162 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if((a-b+c)%5==0) {
			System.out.println("대박");
		}
		else {
			System.out.println("그럭저럭");
		}
		scan.close();
	}

}
