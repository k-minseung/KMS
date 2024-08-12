package ex03_String;

import java.util.Scanner;

public class Ex05_String {
	public static void main(String[] args) {
		//문자열 s는 키보드에서 입력 받기
		//문자열 s의 길이가 4또는 6이고 , 숫자로만 구성되었는지
		//확인하는 코드만들기
		//ex "a234"면 false, "1234"면 true
		//제한사항
		//s 는 길이 1이상.8이하의 문자열
		//s는 영문 알파벳 대소문자 또는 0-9까지의 숫자로 이루어져있습니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String s = sc.next();
		
		System.out.println("결과 : "+solution(s));
	}
		public static boolean solution(String s) {

			if(s.length()==4||s.length()==6) {
				try {
					//Integer.parseInt -> 인자로 전달된 문자열을 정수로 바꾸는것
					int n = Integer.parseInt(s);
					return true;
				} catch (Exception e) {
					return false;
				}
			}return true;
		}
}

