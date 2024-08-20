package ex01_buffered;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex05_OutputStreamReader {
	public static void main(String[] args) {
		FileOutputStream out = null;
		OutputStreamWriter os = null;
		
		try {
			out = new FileOutputStream("D:\\web0900_lhj\\1.Java\\work\\수업자료/out예제.txt");
			os = new OutputStreamWriter(out,"UTF-8");
			
			System.out.println("파일생성시작");
			String [] strArray = {"OutputStreamWriter에 대해 배웁니다.","we are learning about OutputStreamWriter"};
			
			for(String str : strArray) {
				os.write(str+"\n");
			}
			System.out.println("파일생성완료");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(os != null){os.close();}
				if(out != null){out.close();}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
