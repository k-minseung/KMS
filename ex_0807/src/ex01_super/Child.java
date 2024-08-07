package ex01_super;

public class Child extends Parent{//자식역할의 클래스
	public Child(int n) {
		super(n); //부모생성자의 호출
		//매개변수가 없으면 super을 생략 가능,
		//매개변수가 있으면 생략이 불가능 하다
	}
}
