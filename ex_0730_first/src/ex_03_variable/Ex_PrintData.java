package ex_03_variable;

public class Ex_PrintData {
	public static void main(String[] args) {
		
		//정수형 데이터 : 소수점이 없는 숫자 1, 24, 100, -50, -125, ...
		//실수형 데이터 : 소수점이 있는 숫자 1.23, 4.12, ...
		//문자형 데이터 : '홑따음표'로 감싼 한글자 'a', 'f', 'd', ...
		//문자열 데이터 : "쌍따옴표"로 감싼 글자 "안녕하세요", "반갑습니다", "하이", ...
				
		System.out.println(100);
		System.out.println(100+50);
		System.out.println("안녕하세요"+50);
		
		//문자열앞뒤에 오는 더하기는 "연결의 의미를 가지고 있다."
		//"안녕하세요50"
		System.out.println(5+10+":"+(5+10));
		System.out.println("2 + 2 = " + (2 + 2) );
	}
}
