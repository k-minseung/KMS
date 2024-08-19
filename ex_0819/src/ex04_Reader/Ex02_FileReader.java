package ex04_Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02_FileReader {
	public static void main(String[] args) {
		//특정경로에 reader.txt 파일을 만들고 아무내용이나 적는다
		// 그파일을 읽어서 알파벳 대문자와 소문자의 개수를 출력하세요
		FileReader rd = null;
		int lower = 0;
		int upper = 0;
		
		try {
			rd = new FileReader("D:\\web0900_lhj\\1.Java\\work/reader.txt");
			int code = 0 ;
			while((code = rd.read()) != -1) {
				if(code>='a'&& code<='z') {
					lower++;
				}else if(code>='A'&& code<='Z') {
					upper++;
				}
				System.out.print((char)code); // 내가 입력한 문자를 출력
			}//while
			System.out.println();
			System.out.println("소문자 : "+lower+"개");
			System.out.println("대문자 : "+upper+"개");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(rd != null) {
				try {
					rd.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
}
