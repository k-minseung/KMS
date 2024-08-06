package ex04_inheritance;

public class PersonMain {
	public static void main(String[] args) {
		Customer c1 = new Customer("박자마", 23, 20240001);
		Customer c2 = new Customer("송코딩", 25, 20240002);
		c1.enter();
		c2.enter();
		
	}
}
