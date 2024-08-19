package ex01_File;

import java.io.File;

public class Ex03_File {
	public static void main(String[] args) {
		//aaa bbb 같은 경우 실제 있는 경로가 아님
		String path= "D:\\web0900_lhj\\1.Java\\work\\bbb/aaa";
		
		File f = new File(path);
		//최종목적지가 파일이든 폴더든간에 아예 존재하지가 않음
		//exists() -> 최종 목적지 까지 존재하지 않으면 false
		if(!f.mkdirs()) {
			System.out.println("폴더 생성");
			//mkdir() -> 오직 한개의 폴더를 만들어주는 메서드
			//mkdirs() -> 복수개의 폴더를 만들어주는 메서드
			f.mkdirs();
		}
		
		//파일클래스의 세번쨰 기능
		//목적지까지 경로가 존재하는지 파악가능
		//폴더를 만드는것이 가능하다.
		
		//파일클래스는 특정문서를 만드는 기능은 없다.
		//폴더를 만드는 것만 가능하다.
		
		//파일클래스의 역할
		//경로의 검증(존재하는지 파일인지 폴더인지 또는 파일의 이름가져오기)
	}
}
