package ex02_class;

class A{
	
}
//프로그램을 실행했을 때 코드를 컴파일한 결과물은 코드 파일을 각각 작성한것과 동일하게 각 클래스별로 도출되어 2개가 된다.
//파일 분리 여부와 상관없이 결과물이 같기 때문에, 분리 여부는 개발자가 원하는데로 작성해도 무방하다.
//그러나, 추후 유지보수의 편리성과 클래스 재사용을 고려해 하나에 한 개의 클래스를 작성하는 것을 추천한다.
//main은 실행되는 클래스에 하나만 적는다

public class Cat {
	public static void main(String[] args) {
		// 개체변수의 선언
		// 객체를 담을 수 있는 변수를 선언
		// 클래스명 변수명;

		Cat c;

		// 만들어진 객체 변수에 객체를 만들어 대입하기

		c = new Cat();

		//new는 메모리에 객체를 생성하기 위한 공간을 할당 받는 키워드
		
		Cat c2 = new Cat();
		
		// 자동차 객체 생성하기
		
		Car car = new Car();
		
		//변수명.필드명
		//뱐수명 : 클래스를 이용해 만든 객체의 이름
		//필드명 : 만든 객체가 가지고 있는 필드의 이름

		System.out.println("car의 바퀴수 : " +car.wheel);
		
		car.wheel=4;
		
		Car car2 = new Car();
		System.out.println("wheel의 개수는 " + car.wheel + "개입니다.");
		
		car.ride();
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
