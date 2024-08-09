package ex05_try_catch;

public class Ex01_Try_Catch {
	public static void main(String[] args) {
		int result = 0 ;
		try {
			result = 10 /0 ; // 무조건 예외가 발생한다.
			System.out.println("나누기 결과 : "+ result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기 할 수 없습니다.");
		}
		System.out.println("프로그램 종료");
	}
}
