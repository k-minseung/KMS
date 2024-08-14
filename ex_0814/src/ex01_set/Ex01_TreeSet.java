package ex01_set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex01_TreeSet {
	public static void main(String[] args) {
		//TreeSet객체 생성
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		//set1의 모든 값을 가진 TreeSet 객체 생성
		TreeSet<Integer> set2 = new TreeSet<Integer>(set1);
		//초기값을 가지고 만들어지는 TreeSet 객체 생성
		TreeSet<Integer> set3 = new TreeSet<Integer>(Arrays.asList(1,2,3));
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		//TreeSet에 값 추가
		set.add(7);
		set.add(4);
		set.add(9);
		set.add(1);
		System.out.println(set);
		
		//TreeSet에 값 삭제
		set.remove(1);
		System.out.println(set);
		set.clear();
		System.out.println(set);
		
		//TreeSet크기 구하기
		TreeSet<Integer> set4 = new TreeSet<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		System.out.println(set4.size());
		
		//TreeSet값 출력하기
		System.out.println(set4);
		System.out.println(set4.first());	//최소값을 찾아서 반환
		System.out.println(set4.last());	//최대값을 찾아서 반환
		System.out.println(set4.higher(3)); //인자로 전달된 값보다 큰 데이터중 최소값 출력 없으면 null
		System.out.println(set.lower(3)); 	//인자로 전달된 값도다 작은 데이터중 최대값을 출력 없으면 null
		
		//index가 없어서 요소를 하나씩 꺼낼수가 없음 단, iterator 를 사용하면 하나씩 꺼낼 수 있음
		
		Iterator<Integer> iter = set4.iterator();
		//hasNext() -> 다음에 순회할 요소가 있으면 true, 없으면 false
		while(iter.hasNext()) {
			//다음요소를 반환한다.
			int val = iter.next();
			System.out.print(val);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
