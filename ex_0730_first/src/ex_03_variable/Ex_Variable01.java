package ex_03_variable;

public class Ex_Variable01 {
	public static void main(String[] args) {
		
		//변수의 선언
		//변수를 사용하기 위해서는 변수의 선언이 선행되어야 한다.
		//변수를 선언하기 위해서는 메모리에 두가지 정보가 필요하다.
		//1. 변수에 담을 데이터의 타입
		//2. 변수의 이름
		
		int number;
		
		//변수명 명명 규칙
		//사용용도를 최대한 명확하게 보여줄 수 있는 이름이라면
		//개발자가 마음대로 지정할 수 있지만 다음과 같은 규칙을 지켜야한다.
		
		//1. 숫자가먼저 들어가면 안된다.
		//2. 영어 대소문자를 구분한다(Name과 name는 다른 변수라고 인식한다.)
		//3. 일반적으로 영어소문자로 시작한다.
		//4. _,$를 제외하고 특수기호가 포함될 수 없다.
		//5. 예약어 금지(if, for, switch, new, while 등)(대문자 lf는 됨)
		//6. 한글은 쓰지 말것 (자바는 가능)
		
		//변수명은 문자 수의 제한이 없으므로 
		//최대한 변수의 의미를 쉽게 파악할 수 있도록 구체적으로 명명하는것이 좋다
		
		//표기법
		//카멜표기법(camel case) - userName, phoneNumber
		//두번째 단어부터 첫글자를 대문자로 표기하는 방법 
		
		//스네이크표기법(snake vase) -user_name, phone_number
		//모든 단어가 소문자로 시작하고, 단어와 단어 사이는 _로 연결하는 방식 
		
		//변수의 데이터 대입하기
		//개발자가 데이터에 값이 필요할 때 데이터의 값을 직접 사용하는 대신,
		//데이터를 변수에 저장해두고 변수의 이름을 호출하여 그 값을 사용할 수 있게 해준다.
		
		// = 기호를 사용한다.
		//수학에서는 좌변과 우변이 같다는 의미이지만 프로그래민에서는 우변의 값을 좌변에 대입한다는 의미를 가지고 있다.
		
		int studentAge; //학생의 나이를 저장할 수 있는 변수의 선언
		studentAge =25; //변수의 값을 대입
		
		System.out.println(studentAge);
		System.out.println(studentAge);
		System.out.println(studentAge);
		System.out.println(studentAge);
		System.out.println(studentAge);
		
		//변수를 선언하고 처음으로 값을 대입하는것을 '초기화' 라고 한다.(initialization)
		//초기값을 지정한다 라는 의미
		//변수를 선언하고 초기화 하는 작업을 한 줄로 쓸 수 있다.
		System.out.println();
		String myCity = "Seoul";
		System.out.println("Im from " + myCity);
	}
}
