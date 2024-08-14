package ex05_lambda;

@FunctionalInterface
interface Iadd{
	int add (int x, int y);
}

public class Ex02_Lamda {
	public static void main(String[] args) {
		//람다식을 매서드의 매개변수로 활용
		Iadd add = (x,y) -> x+y;
		int res = result(add);
		System.out.println("람다식 매개변수로 활용 : "+ res);
	}
	
	public static int result(Iadd lamda) {
		return lamda.add(3, 2);
	}
	
	
	
	
}
