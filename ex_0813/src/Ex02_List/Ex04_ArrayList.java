package Ex02_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex04_ArrayList {
	public static void main(String[] args) {
		//ArrayList의 데이터 얻기
		
		List<Integer> list = new ArrayList();
		
		//1~30사이의 난수 10개를 list에 추가
		
		Random rnd = new Random();
		
		for(int i=0; i<10;i++) {
			list.add((int)(Math.random()*30)+1);
		}
		
		//List에 담긴 데이터중 짝수만 출력
		System.out.println("짝수 : ");
		for(int i=0;i<list.size();i++) {
			//List에서 각 index에 위치하는 값 가져오기
			int value=list.get(i);
			if(value % 2 == 0) {
				System.out.print(value+" ");
			}
		}
		System.out.println();
		//추가 add()
		//조회 get()
		//삭제 remove()
		//수정 set()
		//비어있는지 검증 isEmpty();
		//크기가 몇인지 size();
		//포함하고 있는지 contain();
		
		//배열의 크기 : 배열명.length
		//문자열의 크기 : 문자열.length()
		//컬렉션의 크기 : 컬레션객체.size()
		
		//향상된 for문을 통해 출력
		for(int value : list) {
			System.out.println("값 : "+value);
		}
		
		
		
		
		
		
		
		
	}
}
