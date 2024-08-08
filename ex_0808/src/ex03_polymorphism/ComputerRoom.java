package ex03_polymorphism;

//컴퓨터실

public class ComputerRoom {
	//필드에 있는것이 기본자료형이 아닌객체변수가 선언;
	//String str;
	//Samsung com1;
	//Samsung com2;
	//Lz com1;
	//Lz com2;
	Computer com1;
	Computer com2;
	Computer com3;

	
	public void allPowerOn() {
		com1.PowerOn();
		com2.PowerOn();
		com3.PowerOn();
	}
	public void allPowerOff() {
		com1.PowerOff();
		com2.PowerOff();
		com3.PowerOff();
	}
	
	
	
}
