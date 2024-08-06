package ex05_overriding;

public class CalMain {
	public static void main(String[] args) {
		
		CalPlus cp = new CalPlus();
		System.out.println("CalPlus : " + cp.getResult(10, 20));
		
		CalMinus cm = new CalMinus();
		System.out.println("CalMinus : " + cm.getResult(30, 15));
	}
	
}
	
	

 