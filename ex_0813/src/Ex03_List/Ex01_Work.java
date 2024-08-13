package Ex03_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01_Work {
	public static void main(String[] args) {
		//아이디 생성 : abc
		//abc
		//아이디 생성 : abc2
		//abc abc2
		//아이디 생성 : abc3
		//abc abc2 abc3
		//아이디 생성 : abc3
		//중복된 아이디
		//아이디 생성 : abc4
		//abc abc2 abc3 abc4
		
		
		//중복된 아이디를 입력했을 때 다시 입력을 받기
		// 리스트의 요소의 개수가 4개이면 프로그램 종료
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		
		
		while(true) {
		System.out.print("아이디 생성 : ");
		String Id = sc.next();
//		//리스트에 있는지 검증
//		for(int i=0; i<list.size();i++) {
//			if(Id.equals(list.get(i))) {
//				System.out.println("중복된아이디");
//				continue Outer;
//			}
//		}
		//리스트에 있는지 검증
		if(list.contains(Id)) {
			System.out.println("중복된 아이디");
			continue;
		}
		
		
		list.add(Id);
		System.out.println(list);
		System.out.println("----------------------------");
	
			if(list.size()==4) {
				break;
			}
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
