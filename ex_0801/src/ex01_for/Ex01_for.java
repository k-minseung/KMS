package ex01_for;

import java.util.Scanner;

public class Ex01_for {

	public static void main(String[] args) {
		
		for(int i = 0; i<3; i++) {// 0 1 2 -> 도출되는 결과의 숫자의 개수가 반복횟수이다.
			
			System.out.println(i);
			
//		}
//		
//		System.out.println("----------------------------------------------------------------------");
//		//1 2 3 4 5 6 7 8 9 10
//		System.out.println();
//		for(int n = 0 ; n <10 ; n++) {
//			System.out.print((n+1)+" ");
//		}
//		
//		//10 9 8 7 .. 1
//		
//		System.out.println();
//		for(int i = 10 ; i >0 ; i--){
//			System.out.print(i+ " ");
//		}
//		System.out.println();
//		//1~20까지 홀수만 가로
//		for(int i = 1; i < 21 ; i++) {
//			if(i % 2 == 1) {
//				System.out.print(i+" ");
//			} 
//		}
//		
//		//1~10 3의 배수만
//		System.out.println();
//		for(int i = 3; i<10 ; i++) {
//			if(i%3==0) {
//				System.out.print((i+" "));
//			}
//		}
//		
//		//1~10까지의 총합
//		System.out.println();
//		int sum =0;
//		System.out.println();
//		for(int i =1 ; i<11; i++) {
//			sum+=i; // sum = sum+i	누적합계,곱을 구할 때 좋음
//			
// 		}
//		System.out.print(sum);
//		
//		//정수형 변수 dan에 2~9사이의값으로 초기화 하고 해당 dan에 해당하는 구구단 출력하기
//		System.out.println();
//		int dan = 3;
//
//		System.out.println();
//		for(int i=1 ; i<10 ; i++) {
//			System.out.println(dan + "x" + i + "="+(dan*i));
//			
//		}
//		
		//키보드에서 정수르 하나 입룍 1부터 입력받은 수까지의 총합
//		System.out.println();
	Scanner sc=new Scanner(System.in);
//		System.out.print("정수 : ");
//		int n1 =sc.nextInt();
//		sum =0;
//		
//		for(int i = 1; i <= n1; i++) {
//			sum+=i;
//		}
//		System.out.println("총 합 : " + sum);
//		
//		//10개의 정수를 입력받아 그 중에 짝수가 몇개인지 개수를 출력
//		int count = 0;
		
//		for(int i = 0 ; i < 10 ; i++) {
//			System.out.print("정수 입력 : ");
//			int n = sc.nextInt();
//			
//			//짝수인지 판별
//			if(n % 2 == 0){
//				//개수를 센다
//				count ++;
//			}
//		}
//		System.out.println("짝수의 개수 : "+ count);
		
		//키보드로 부터 정수를 2개 입력받은 x부터y의까지의 총합을 출력하세요
		//단 x가y보다큰경우 x와y값을 바꿔서 총합을 구한다.
	
		System.out.print("정수 입력 : ");
		int x = sc.nextInt();
		
		System.out.print("정수 입력 : ");
		int y = sc.nextInt();
		
		int sum = 0;
		
		//x와 y의 크기비교
		if(x>y) {
			int z = x;
			x = y;
			y = z;
		}
		sum = 0 ;
		for(int z = x; i <=y ; i++) {
			sum+=i;
		}
				
		System.out.printf("%d부터 %d까지의 총합 : %d", x,y,sum);		
				
				

	}

}
}
