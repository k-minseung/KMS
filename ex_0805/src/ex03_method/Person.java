package ex03_method;

public class Person {
	//이름과 나이를 전달받아 출력하는 introduce메서드 생성
	//결과
	//제 이름은 x이고, 나이는 x세입니다.
	//PersonMain에서 메서드 호출
	
	void introduce(String name, int age) {
		System.out.println("제 이름은  "+name + "이고 제 나이는 "+age+"입니다.");
		
	}
}
