package ex04_generic;


interface Person{}

class Student implements Person{}

class Worker{}

//Person 인터페이스를 구현한 클래스만 제네릭타입으로 들어올 수 있다.
class School<T extends Person>{}

public class Ex02_Generic {
	public static void main(String[] args) {
		//Worker 클래스가 Person 인터페이스를 구현하지 않았기 떄문에 불가능하다
		// School<Worker> s = new School<>();  //Worker은 상속받는 애가 아니라서 오류
		School<Student> s = new School<>();
		
		
		
		
	}
}
