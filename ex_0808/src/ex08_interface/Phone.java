package ex08_interface;

public interface Phone {
	
	//상수만 들어갈 수 있다 -> 변수의 반대말
	//값을 한 번 넣어놓으면 대입이 불가능하다.
	//상수명은 대문자로 작성한다.
	public static final int MAX_BATTERY_CAPACITY = 100;
	
	
	
	//추상메서드 abstract를 생략해도 interface에서는 abstract메서드로 인식
	abstract void powerOn();
	abstract void powerOff();
	abstract boolean isOn();
	abstract void watchUtube();
	abstract void charge();
	//인터페이스도 마찬가지로 추상 메서드가 비어있기 떄문에 객체 생성을 스스로 할 수 없다.
	//따라서 인터페이스도 자신이 가지고 있는 추상 메서드를 구현해줄 클래스를 작성해야만 한다.
	//인터페이스를 구현해주는 클래스를 '구현 클래스'라고 한다.
	
	
	
	
	
	
}



/*
	[접근제한다] interface 인터페이스명 {
		상수
		추상메서드
	}
*/