package ex02_enum;

public enum Season {
	//상수 하나하나를 객체라고 보면된다.
	//1.생성자에 값을 전달하는것과 같은 원리이다.
	
	//상수
	SPRING("봄","spring"),
	SUMMER("여름","summer"),
	FALL("가을","fall"),
	WINTER("겨울","winter");
	//3.필드에 전달된다.
	private String season;
	private String e_season;
	//2.전달한 값을 생성자를 통해서 받고
	Season(String season, String e_season) {
		this.season=season;
		this.e_season = e_season;
	}
	public String getSeason() {
		return season;
	}
	public String getE_season() {
		return e_season;
	}
}
