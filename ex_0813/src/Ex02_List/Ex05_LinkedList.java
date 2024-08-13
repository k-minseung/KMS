package Ex02_List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex05_LinkedList {
	public static void main(String[] args) {
		//ArrayList와 LinkedList의 성능비교
		
		//ArrayList
		ArrayList<Integer> arraylist = new ArrayList<>();
		
		//LinkedList
		LinkedList<Integer> linkedlist =new LinkedList<>();
		
		//자료구조에 데이터 삽입시 걸리는 시간을 비교
		long startTime = System.nanoTime();
		//ArrayList와 LinkedList에 1000000 데이터 추가
		for(int i=0;i<1000000;i++) {
			arraylist.add(i);
		}
		long endTime = System.nanoTime();
		
		long duration = endTime - startTime;
		
		System.out.println("ArrayList 추가시간 : "+ duration);
		
		startTime = System.nanoTime();
		for(int i =0; i<1000000;i++) {
			linkedlist.add(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		
		System.out.println("ArrayList 추가시간 : "+ duration);
		
		/////////////////////////////////////////////////////////////
		System.out.println("----------------------------------------");
		//특정 위치에 삽입하는 시간을 비교
		
		startTime = System.nanoTime();
		arraylist.add(99,100);
		endTime = System.nanoTime();
		
		duration = endTime - startTime;
		System.out.println("ArrrayList 삽입시간 : "+ duration);
		
		startTime = System.nanoTime();
		linkedlist.add(99,100);
		endTime= System.nanoTime();
		
		duration = endTime - startTime;
		System.out.println("LinkList 삽입시간 : "+ duration);
		
		/////////////////////////////////////////////////////////////
		//요소의 삭제시간 비교
		System.out.println("----------------------------------------");
		
		//ArrayList
		startTime = System.nanoTime();
		for(int i =9999; i>=0;i--) {
			arraylist.remove(i);
		}
		endTime = System.nanoTime();
		
		duration = endTime - startTime;
		System.out.println("ArrayList 지우기 : "+ duration);
		
		//LinkedList
		startTime = System.nanoTime();
		for(int i =9999; i>=0;i--) {
			linkedlist.remove(i);
		}
		endTime = System.nanoTime();
		
		duration = endTime - startTime;
		System.out.println("LinkedList 지우기 : "+ duration);
		
		//ArrayList 삽입 삭제가 잘 일어나지 않는 경우 사용
		//LinkedList 삽입 삭제가 빈번하게 일어나는 경우 사용
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
