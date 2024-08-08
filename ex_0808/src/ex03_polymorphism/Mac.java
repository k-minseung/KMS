package ex03_polymorphism;

public class Mac extends Computer {
	
	@Override
	public void PowerOn() {
		super.PowerOn();
		System.out.println("Hello Apple");
	}
	
	public void info() {
		System.out.println("@442");
	}
	
}
