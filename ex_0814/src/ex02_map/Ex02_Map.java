package ex02_map;

import java.util.HashMap;

public class Ex02_Map {
	public static void main(String[] args) {
		HashMap<String, Float> map = new HashMap<String, Float>();
		map.put("k1", 100.0f);
		map.put("k2", 3.14f);
		map.put("k3", 4.15f);
		System.out.println(map);
		
		//Map에 특정 key값이 포함되어 있는지 확인하는 메서드
		//containskey()
		if(map.containsKey("k3")) {
			System.out.println("k3는 key가 존재합니다.");
			
		}
		
		//Map에 특정 value값이 포함되어 있는지 확인하는 메서드
		//containsValue()
		if(map.containsValue(3.14f)) {
			System.out.println("map에 3.14라는 value가 존재합니다.");
		}
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
