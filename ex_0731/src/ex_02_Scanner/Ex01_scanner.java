package ex_02_Scanner;

import java.util.Scanner;

public class Ex01_scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요 : ");
		int age = scan.nextInt();
		System.out.printf("제 나이는 %d세 입니다\n",age);
		//제 이름은 xxx 입니다.
		
		System.out.print("이름을 입력해주세요 : ");
	    String name = scan.next();
	    scan.nextLine();
		System.out.printf("제 이름은 %s 입니다\n", name);
		
		
		//제 주소는 xxx입니다.
		System.out.print("주소를 입력해주세요 : ");
		
		String address = scan.nextLine();
		System.out.printf("제 주소는 %s 입니다\n", address);
		
		//제 키는 xx.xcm입니다.
		System.out.print("키를 입력하세요 : ");
		float height = scan.nextFloat();
		System.out.printf("제 키는 %.1fcm 입니다.", height);
		
		
		
		
		
		
		
		
		
		
	}
}
