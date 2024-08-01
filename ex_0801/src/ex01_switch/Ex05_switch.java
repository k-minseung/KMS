package ex01_switch;

import java.util.Scanner;

public class Ex05_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//10이하의 숫자를 입력받고 해당 숫자가 짝수인지 홀수인지 판별하는 코드를 switch로 작성해주세요
		
		System.out.print("10이하의 숫자를 입력해 주세요. : ");
		int num = sc.nextInt();
		//방법1
		switch(num) {
		case 1, 3, 5, 7, 9 -> System.out.println("홀수");
		case 2, 4, 6, 8, 10 -> System.out.println("짝수");
		default -> System.out.println("잘못된입력");
		}
		
		//방법2
		//짝수 홀수 판별 2로 나눈 나머지가 1이냐 0이냐
		switch(num % 2) {
		case 0 -> System.out.println("짝수");
		case 1 -> System.out.println("홀수");
		}
		
		//키보드에서 달(month)를 입력받아 해당달이 몇일까지 있는지 switch문으로 작성 x월은 x일까지 있습니다로 나오게 표현
		
		System.out.print("month : ");
		int month = sc.nextInt();
		switch(month) {
		case 4,6,9,11 -> System.out.println(month+"월은 30일까지 있습니다.");
		case 1,3,5,7,8,10,12 -> System.out.println(month+"월은 31일까지 있습니다.");
		case 2-> System.out.println(month+"월은 28일까지 있습니다.");
		default -> System.out.println("잘못된입력");
		}
		
		
		//계산기 프로그램 만들기
		//두개의 정수를 입력받는다 산술연산자도 입력받아 문자열에 담는다 ex) +
		//switch문을 이용하여 정수의 연산을 수행하는코드작성
		
		
		System.out.print("정수1 : ");
		int i = sc.nextInt();
		System.out.print("정수2 : ");
		int i2 = sc.nextInt();
		System.out.print("연산자 : ");
		String st = sc.next();
		System.out.print("결과 값 : ");
		
		
		switch(st) {
		case "+" -> System.out.printf("%d + %d = %d\n",i,i2,(i+i2));
		case "-" -> System.out.printf("%d - %d = %d\n",i,i2,(i-i2));
		case "*" -> System.out.printf("%d * %d = %d\n",i,i2,(i*i2));
		//수학적인 나누기를 하려면 숫자하나를 double로 형변환을 하면된다.
		case "/" -> System.out.printf("%d / %d = %f\n",i,i2,(i/(double)i2));
		
		}
		
		// %f %d 좀더 공부
		switch(st) {
		case "+" -> System.out.println(i+i2);
		case "-"-> System.out.println(i-i2);
		case "*" -> System.out.println(i*i2);
		case "/" -> System.out.println(i/i2);
		case "%" -> System.out.println(i%i2);
		}
		//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
