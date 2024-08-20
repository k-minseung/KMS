package ex01_buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex01_CopyImage {
	public static void main(String[] args) {
		//보조스트림을 이용해서 이미지를 복사
		//사진_copy.jpg이름으로 복사
		
		FileInputStream readFile = null;
		BufferedInputStream bis = null;
		
		FileOutputStream writeFile = null;
		BufferedOutputStream bos = null;
		
		try {
			readFile = new FileInputStream("D:\\web0900_lhj\\1.Java\\work\\수업자료/사진_copy2.jpg");
			bis = new BufferedInputStream(readFile);
			writeFile = new FileOutputStream("D:\\web0900_lhj\\1.Java\\work\\수업자료/사진_copy3.jpg");
			bos = new BufferedOutputStream(writeFile);
			
			int code = 0;
			while((code = bis.read()) != -1) {
				bos.write(code);
			}
			System.out.println("복사완료");
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(bos != null) {bos.close();}
				if(writeFile != null) {writeFile.close();}
				if(bis != null) {bis.close();}
				if(readFile != null) {readFile.close();}	
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
