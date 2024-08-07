package ex05_Final;

public class Comic extends Book	{
	boolean isColor;
	public Comic(String title, String author,boolean isColor) {
		super(title,author);
		this.isColor=isColor;
	}
	
	@Override
	public void info_author() {
		System.out.println("이 만화책의 저자는 "+ author+ "입니다.");
	}
	/*
	@Override
	public void info_title(){ // info_title 는 final이 붙어있는 메서드기 때문에 오버라이딩이 안된다.
		System.out.println("이 만화책의 저자는 "+ author+ "입니다.");
	}
	
	*/
	
	public void info_color() {
		if(isColor) {
			System.out.println("이 만화책은 컬러입니다.");
		} else {
			System.out.println("이 만화책은 흑백입니다.");
		}
		
	}
	
}
