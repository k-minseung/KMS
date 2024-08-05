package ex02_class;

public class Student {
	//정적 멤버의 선언
	static String schoolName = "코리아 고등학교";
	String studentName;
	
	static void goToSchool() {
		System.out.println("학교에 갑니다.");
		
	}
	void hello() {
		
		System.out.println("안녕하세요 제 이름은 : "+ studentName+"입니다.");
		}
}

