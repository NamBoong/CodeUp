package codeup晦蟾2;

import java.util.Scanner;

public class Main1161 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if((a+b)%2!=0) {
			if(a%2==0) {
				System.out.println("礎熱+�汝�=�汝�");
			}
			else {
				System.out.println("�汝�+礎熱=�汝�");
			}
		}
		else {
				if(a%2==0 && b%2==0) {
					System.out.println("礎熱+礎熱=礎熱");
				}
				else {
					System.out.println("�汝�+�汝�=礎熱");
				}
			}
		scan.close();
	}
}
