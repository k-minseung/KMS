package ex01_getter_setter;

public class PersonMain {
	public static void main(String[] args) {
		Person hong = new Person();
		//hong.age = -30;
		hong.setAge(-30);
		hong.setAge(30);//age 필드에 30 대입
		System.out.println("hong의 나이는 "+ hong.getAge() + "세입니다.");
	}
}
