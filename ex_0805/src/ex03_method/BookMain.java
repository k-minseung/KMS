package ex03_method;

public class BookMain {
	public static void main(String[] args) {
		Book b = new Book();
		//메서드의 매개변수가 선언되어다면 
		//호출할 때 값을 전달하지 않으면 에러가 남
		b.count(5);
	}
}
