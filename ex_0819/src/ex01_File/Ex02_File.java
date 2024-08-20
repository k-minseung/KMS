package ex01_File;

import java.io.File;
import java.util.Arrays;

public class Ex02_File {
	public static void main(String[] args) {
		String path = "D:\\web0900_lhj\\1.Java\\work";
		
		File f= new File(path);
		//경로의 최종 목적지가 폴더면 true
		if(f.isDirectory()) {
			//f경로의 하위 요소들을 문자열 배열로 반환
			String [] names = f.list();
			
			//System.out.println(Arrays.toString(names));
			for ( String s : names){
				System.out.println(s);;
			}
		}
		
		//File클래스의 두번쨰 기능
		//폴더의 하위 목록의 이름을 가져올 수 있고, 폴더인지 파악하는 기능
		
		
	}
}