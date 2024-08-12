package ex01_try_catch;

import java.util.Scanner;

public class Ex02_Try_Catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//나이 입력받기 
		//20살 이상이면 성인 14살 이상이면 청소년 7살 이상이면 어린이 이외에는 아동입니다
		//단, 0 이하의 수가 입력되면 InputErrorException 발생 입력이 잘못 되었습니다
		
		try {
			System.out.print("당신의 나이를 입력하세요 :");
			int age=sc.nextInt(); // 예외발생가능성이 있음
			
			if(age < 0) {
				throw new InputErrorException("입력이 잘못 되었습니다.");
			}
			
			if(age>=20) {
				System.out.println("성인입니다.");
			}else if(age>=14) {
				System.out.println("청소년입니다.");
			}else if (age>=7) {
				System.out.println("어린이입니다.");
			}else {
				System.out.println("아동입니다.");
			}
			
		
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
