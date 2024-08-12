package ex02_Object;

public class Ex02_Car {
	//toString() 메서드
	//toString() 메서드 객체의 문자 정보를 반환해주는 메서드
	//print()문을 사용해 객체를 출력할 경우 해당 메서드가 자동으로 실해되어
	//객체의 정보를 반환해주고 출력이 된다.
	//따라서 해담 메서드를 재정의해서 사용하면 원하는 객체의 정보를 쉽게 출력할 수 있다.
	
	private String carName;
	private String company;
	
	public Ex02_Car(String carName, String company) {
		this.carName = carName;
		this.company = company;
	}
	
	//자바의 모든 클래스는 Object클래스를 상속받는다.
	@Override
	public String toString() {
		String str1 = "차량이름 : "+ this.carName+" 제조사 : "+ this.company;
		return str1;
	}
//	
//	public String getCarName() {
//		return carName;
//	}
//	
//	public String getCompany() {
//		return company;
//	}
	
}
