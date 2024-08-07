package ex05_Final;

public class BookMain {
	public static void main(String[] args) {
		Comic comicBook = new Comic("포켓몬","비상",true);
		//final로 선언된 메서드를 오버라이드는 안되지만 사용하는 건 가능하다
		comicBook.info_title();
		comicBook.info_author();
		comicBook.info_color();
	}
}
