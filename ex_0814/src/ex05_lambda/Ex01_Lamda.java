package ex05_lambda;

public class Ex01_Lamda {
	public static void main(String[] args) {
		//클래스를 직접 생성하고 객체를 만들어서 호출하는 방식
		Calculator cal1= new CalculatorImpl();
		int res = cal1.plus(10, 20);
		System.out.println("cal1의 값 : "+res);
		
		//익명클래스를 통한 구현
		Calculator cal2 = new Calculator() {
			
			@Override
			public int plus(int num1, int num2) {
				return num1+num2;
			}
			
		};
		System.out.println("cal2의 값 : " + cal2.plus(10, 20));
		
		//람다식을 통한 구현
		Calculator cal3 = (num1, num2) -> num1 + num2;
		System.out.println("cal3의 값 : "+ cal3.plus(10, 20));
		
		//파라미터가 1개인 메서드 람다식으로 ㅁ나들기
	
		//MyFunction mf = (int num) -> {System.out.println(num);}; 
		//MyFunction mf = num -> {System.out.println(num);}; //매개변수 1개면 소괄호랑 같이 지울 수 있음
		//MyFunction mf = num -> System.out.println(num); // 반환형이 void라 중괄호도 지울 수 있음
		MyFunction mf = System.out::println;
		mf.method(10);
		
		//:: 이중콜론 : 메서드 참조 연산자
		//람다식을 보다 간결하게 사용할 수 있도록 해준다.
		
		
	}
}
