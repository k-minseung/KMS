package ex03_polymorphism;

public class Lz extends Computer {
	
	@Override
	public void PowerOn() {
		super.PowerOn();
		System.out.println("사랑해요 LZ");
	}
}
