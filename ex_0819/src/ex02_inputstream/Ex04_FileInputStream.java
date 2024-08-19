package ex02_inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex04_FileInputStream {
	public static void main(String[] args) {
		//특정 경로에 file.txt문서를 만들고 아무 문장이나 입력해둔다
		//file.txt의 내용을 읽어온 뒤 회문인지 아닌지 판멸해서 출력하시오
		String path = "D:\\web0900_lhj\\1.Java\\work\\file.txt";
		File f = new File(path);
		
		byte[] read = new byte[(int) f.length()];
		FileInputStream fis = null;
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				fis.read(read);
				String ori = new String(read);
				
				String rev = "";
				for( int i = ori.length()-1;i>=0;i--) {
					rev+= ori.charAt(i);
				}
				if(ori.equals(rev)) {
					System.out.println(ori+"는 회문입니다.");
				}else {
					System.out.println(ori+"는 회문이 아닙니다.");
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					//잘 읽어오든, 읽어오지 못하던 무조건 닫아야함
					fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}//finally
		}
		
		
	}
}
