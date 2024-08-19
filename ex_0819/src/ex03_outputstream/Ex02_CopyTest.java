package ex03_outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex02_CopyTest {
	public static void main(String[] args) {
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in=new FileInputStream("D:\\web0900_lhj\\1.Java\\work/사진.jpg");
			out = new FileOutputStream("D:\\web0900_lhj\\1.Java\\work/사진_copy.jpg");
			
			//현재시간을 m/s으로 나타냄
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0 ;
			//읽어서
			while((read=in.read())!= -1) {
				//쓰기
				out.write(read);
			}
			System.out.println("이미지 읽기 완료");
			long end = System.currentTimeMillis();
			long time = (end-start)/1000;
			System.out.println(time+"초");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(out != null) {
					out.close();
				}
				if(in != null) {
					in.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}