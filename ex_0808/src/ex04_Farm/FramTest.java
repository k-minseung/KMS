package ex04_Farm;


class Animal{
	public void cry() {}; // 오버라이드하기위해 만든메서드
}


class Pig extends Animal{
	@Override
	public void cry() {System.out.println("꿀꿀");}
	
}


class Cow extends Animal{
	@Override
	public void cry() { System.out.println("음메~");}
	
}


class Farm{
	public void sound(Animal animal) {
//		if(animal instanceof Pig) {
//			System.out.println("꿀꿀");
//		} else {
//			System.out.println("음메");
//		}
//	
		animal.cry();
	}
}

public class FramTest {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		
		f.sound(p);
		f.sound(c);
	}
}














