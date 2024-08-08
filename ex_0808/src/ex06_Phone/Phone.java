package ex06_Phone;

public abstract class Phone {

	
	abstract public void openingLoge();
	
	public void powerOn() {
		openingLoge();
		System.out.println("핸드폰이 켜집니다.");
	}
	
	public void powerOff() {
		System.out.println("핸드폰이 꺼집니다.");
		
	}
	
	
	
	
}
