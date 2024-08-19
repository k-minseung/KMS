package ex03_outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03_CopyTest {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in=new FileInputStream("D:\\web0900_lhj\\1.Java\\work/사진.jpg");
			out = new FileOutputStream("D:\\web0900_lhj\\1.Java\\work/사진_copy.jpg");
			
			byte[] buffer= new byte[512];
			
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			
			int read=0;
			while((read = in.read(buffer))!= -1) {
				out.write(buffer,0,read);
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			double time = (double)(end - start)/1000;
			System.out.println(time+"초");
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
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
		//읽자마자 쓰는것보다 중간에 buffer라는 공간을 두는 것이 속도가 훨씬 빠르다.
		
		
	}
}
