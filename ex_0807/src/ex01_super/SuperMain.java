package ex01_super;

public class SuperMain {
	public static void main(String[] args) {
		Child c = new Child(1);//자식객체
		//자식객체를 생성하고 실행을 했는데
		//부모생성자 안에 있는 명령이 실행 됨
		//이것은 부모생성자가 실행이 됐다는 의미이다.
		
		//부모객체가 만들어지면서
		System.out.println("money : "+ c.money);
		
	}
}
