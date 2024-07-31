package ex_04_lf;

import java.util.Scanner;

public class Ex01_if {
	public static void main(String[] args) {
		
		int result=0;
		if(3>2) {
			result = 3;
			//int n = 10;
		}
		System.out.println(result);//result를 밖에서 만들고 안에서 사용하는 건 가능
		//System.out.println(n); //int n 안에서 만든 건 밖에서 사용할 수 없다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		if(age > 19) {
			System.out.println("성인입니다.");
		}
		
		
		
		
		
	}
}
