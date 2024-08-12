package ex03_String;

import java.util.Scanner;

public class Ex03_String {
	public static void main(String[] args) {
		//회문수란 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 숫자를 말합니다.
		//기러기 토마토 스위스 별똥별 역삼역
		//키보드에서 문장을 입력받고 해당 문장이 회문이면
		//xxx회문입니다. 아니면 xxx는 회문이 아닙니다 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("문장 입력 : ");
		String ori = sc.next(); // 원본을 입력받는다
		
		String rev = ""; // 뒤집어서 담기 위한 문자열변수
		for(int i = ori.length(); i>0 ; i --) {
			rev += ori.charAt(i-1);
		}
		
		if(ori.equals(rev)) {
			System.out.println(ori + "는 회문입니다.");
		}else {
			System.out.println(ori + "는 회문이 아닙니다.");
		}
		
		System.out.println("------------------------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
