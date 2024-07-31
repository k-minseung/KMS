package ex_03_Operator;

import java.util.Scanner;

public class Ex08_Operator {
	public static void main(String[] args) {
		//문제풀이
		//과수원에서 배 사과 오렌지를 하루에 각각 5 7 5개씩 생산한다.
		//1. 과수원에서 하루에 생산되는 과일의 총 개수를 구하기
		//2. 시간당 총 생산량 구하기
		
		//int pear = 5;
		//int apple = 7;
		//int orange = 5;
		
		int pear = 5, apple = 7, orange = 5 ;
		int total = pear + apple + orange;
		System.out.println(total);
		
		double avg = (double)total/24 ; //  한 시간당 생산량
		System.out.println(avg);
		
		//상자 하나에는 농구공이 5개가 들어갈 수 있다
		//만일 농구공이 23개라면 몇개의 상자가 필요한가?
		
		int ball =23; //공의 개수
		int n =5; // 담을 수 있는 개수
		
		int result = ball % n == 0 ? ball / n : ball / n + 1;
		System.out.println(result);
		
		//국어 영어 수학에 대한 점수를 키보드를 이용해 정수로 입력받고 
		//1. 세 과목에 대한 합계 출력
		//2. 평균 출력 합계 / 3.0
		//세 과목의 점수와 평균을 가지고 합격여부를 처리하는데
		//세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일때합격 아니면 불합격
		
		
		/*Scanner scan = new Scanner(System.in);
		
		System.out.printf("국어 : ");
		double a = scan.nextDouble();
		System.out.printf("%.1f점\n",a);
		
		System.out.printf("영어 : ");
		double b = scan.nextDouble();
		System.out.printf("%.1f점\n",b);
		
		System.out.printf("영어 : ");
		double c = scan.nextDouble();
		System.out.printf("%.1f점\n",c);
		
		
		int all = a+b+c ;
		System.out.println(total);
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		
		int avd = kor + eng + math ;
		System.out.println(avd);
		double avf = (double)avd / 3.0;
		System.out.println("세 과목의 평균 : "+  avf);
		
		
		
	 
	}
}
