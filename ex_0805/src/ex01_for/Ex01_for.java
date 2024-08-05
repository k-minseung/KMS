package ex01_for;

public class Ex01_for {
	public static void main(String[] args) {
		// 향상된 for문 jdk 1.5부터 새롭게 추가된 기능으로 배열과 컬렉션의 모든 요소를 참조하기 위한 반복문이다.
		/*
		 * 향상된 for문 for(자료형 변수 : 배열 or 컬렉션){ 반복하고자하는 코드 }
		 */

		// for문을 실행할 반복 대상이 있으면 변수는 반복대상이 지닌 자료형과 같은 타입으로 지정해야한다.
		// 반복 대상의 요소를 하나씩 꺼내서 변수에 대입하고, 반복대상의 길이만큼 횟수가 반복된다.

		int[] score = { 90, 92, 93 };
		int sum = 0;
		double avg = 0.0;
		
//		기존 방식
//		for (int i=0;i<score.length; i++) {
//			sum+=score[i];
//		}
		
		for(int i : score) {
			sum+=i;
		}
		avg=(double)sum/3;
		System.out.println("총점 : "+ sum+". 평균 : "+ avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
