package Ex02_List;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		//리스트 선언
		List<String> list = new ArrayList();
		
		//리스트의 데이터 추가 add(E e) 메서드 사용
		//순차적으로 추가
		list.add("딸기");
		list.add("바나나");
		list.add("망고");
		
		//리스트 출력
		System.out.println("list 내용 1 :"+list);
		
		//리스트의 3번째 위치에 사용
		//특정위치에 삽입
		list.add(2,"수박");
		
		System.out.println("list 내용 2 : "+ list);
		
		
		
		
		
		
		
		
		
	}
}
