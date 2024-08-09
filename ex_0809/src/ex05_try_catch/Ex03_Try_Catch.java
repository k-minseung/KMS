package ex05_try_catch;
//키보드에서 정수를 입력받고록 하고 정수 이외의 값이 입력되었다면
//정수만 입력가능이라는 메세지 출력하기

import java.util.InputMismatchException;
import java.util.Scanner;

//결과
//정수 : 100
//입력받은수 : 100

//정수: aaa
//aaa는 정수가 아닙니다
public class Ex03_Try_Catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("정수 : ");
			int Num = sc.nextInt();
			System.out.println("입력받은수 : "+Num);
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력가능");
		}
		
		String Num = "";
		try {
			System.out.print("정수 : ");
			Num = sc.next();
			int n = Integer.parseInt(Num);
			System.out.println("입력받은 수 : "+Num);
		} catch (Exception e) {
			System.out.println( Num+ "은(는) 정수가 아닙니다.");
		}
		
		
		
		
		
		
		
		
		
	}
}
