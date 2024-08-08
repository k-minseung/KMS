package ex07_test;

public class CalMain {
	public static void main(String[] args) {
		//추상클래스는 직접 객체화 할 수 없다.
		Calculator gc = new GoodCalC();
		int[] z = {1,2,3,4,5};
		System.out.printf("두 수의 합 : %d\n",gc.add(1, 2)); // ("합 : " + CalC.add(1.2))
		System.out.printf("두 수의 차 : %d\n",gc.substract(3,4));
		System.out.printf("두 수의 평균 : %.2f",gc.average(z));
		
		
				
	}
}
