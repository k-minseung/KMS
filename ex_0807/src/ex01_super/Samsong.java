package ex01_super;

public class Samsong extends Computer{//자식 클래스
	
		//오버라이드	오버로드
		//재정의		중복정의
	

	
	//오버라이징
	@Override
	void powerOn() {
		//같은메서드이지만 자식클래스의 상황에 맞게 재정의 하는것
		super.powerOn(); // 부모클래스의 메서드를 호출한 것
		System.out.println("아이 러브 샘송");
	}
	
	
	
	
	
}
