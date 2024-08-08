package ex03_polymorphism;

public class Samsung extends Computer {
	
	@Override
	public void PowerOn() {
		super.PowerOn();
		System.out.println("아이 러브 삼송");
	}
	
}
