package ex06_Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex02_ReadImage {
	public static void main(String[] args) {
		
		//기반스트림만 사용해서 이미지 읽어보기
		FileInputStream readFile = null;
		
		//기반 + 보조 스트림을 사용해서 이미지 읽어보기
		FileInputStream bisReadFile = null;
		BufferedInputStream bis = null;
		
		try {
			System.out.println("기본 스트림을 읽기 시작");
			readFile = new FileInputStream("D:\\web0900_lhj\\1.Java\\work/사진.jpg");
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			while(readFile.read() != -1) {
				
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			long time = (end - start)/1000;
			System.out.println("소요시간 : "+ time + "초");
			System.out.println("기본 스트림으로 읽기 종료");
			
			System.out.println("--------------------------");
			System.out.println("보조스트림으로 읽기 시작");
			bisReadFile = new FileInputStream("D:\\web0900_lhj\\1.Java\\work/사진.jpg");
			bis = new BufferedInputStream(bisReadFile);
			start = System.currentTimeMillis();		
			System.out.println("이미지 읽기 시작 후");
			while(bis.read() != -1) {
				//이미지 읽기
				
			}
			System.out.println("이미지 읽기 종료 ");
			end = System.currentTimeMillis();
			double res = (double)(end-start)/1000;
			
			System.out.println("소요 시간 : "+res +"초");
			System.out.println("보조 스트림으로 읽기 종료");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {//늘 보조스트림부터  close해줘야한다
				if(bis!=null) {bis.close();}
				if(bisReadFile != null) {bisReadFile.close();}
				if(readFile != null) {readFile.close();}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
		
		
		
		
	}
}
