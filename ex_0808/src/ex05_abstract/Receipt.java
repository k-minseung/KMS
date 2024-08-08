package ex05_abstract;

public abstract class Receipt {
	
	//필드 넣기 가능
	String chef;
	
	public Receipt (String chef) {
		this.chef = chef;	
	}
	
	void info() {
		System.out.println("이 레시피는 : "+ chef +"의 레시피입니다.");
	}

	
	
	
	
}
