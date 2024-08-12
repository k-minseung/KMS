package ex02_Object;

public class CarMain {
	public static void main(String[] args) {
		Ex02_Car car = new Ex02_Car("소나타","현대");
		System.out.println(car.toString());
		
		//System.out.println("차 이름 : "+ car.getCarName());
		//System.out.println("차 이름 : "+ car.getCompany());
	}
}
