package codeup奄段4;

import java.util.Scanner;

public class Main1295 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		
		while(true) {
		// 舛源 巷縦馬惟 焼什徹 坪球拭辞 社庚切人 企庚切澗 辞稽 嘘発背爽壱 蟹袴走 採歳精 益企稽 床亀系 焼什徹 坪球 慎蝕聖 陥 設串陥.
		// ばばばばばばばばばばばばばばばばばばばばばばばばばばばば
			for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)>=65 && a.charAt(i)<=90) {
				System.out.printf((char)(a.charAt(i)+32)+"");
			}
			if(a.charAt(i)>=97 && a.charAt(i)<=122) {
				System.out.printf((char)(a.charAt(i)-32)+"");
			}
			if(a.charAt(i)<65) {
				System.out.printf((char)a.charAt(i)+"");
			}
			if(a.charAt(i)>90 && a.charAt(i)<97) {
				System.out.printf((char)a.charAt(i)+"");
			}
			if(a.charAt(i)>122) {
				System.out.printf((char)a.charAt(i)+"");
			}
			}
			break;
		}
		scan.close();
	}

}
