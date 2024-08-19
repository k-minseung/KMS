package ex04_Reader;

import java.io.FileReader;
import java.io.IOException;

public class Ex01_FileReader {
	public static void main(String[] args) {
		FileReader fr = null;
		//이미지,음악,동영상등을 전송할때는 byte기반의 스트림을 이용하는것이 좋다.
		try {
			fr = new FileReader("D:\\web0900_lhj\\1.Java\\work/test.txt");
			int code = 0 ;
			//
			while((code = fr.read()) != -1) {
				System.out.print((char)code);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		}
	}
}
