package ex03_String;

public class Ex06_String {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello");
		
		System.out.println(str);
		
		//append -> 기존 문자열 뒤에 삽입
		str.append(" World");
		System.out.println(str);
		
		//delete -> 문자열 삭제 직전까지만 삭제
		str.delete(0,6);
		System.out.println(str);
		
		//insert -> 원하는 위치에 문자열 삽입
		str.insert(0,"Hello ");
		System.out.println(str);
		
		//reverse -> 문자를 반대로 출력
		str.reverse();
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
