package ex03_generic;

import java.util.ArrayList;
import java.util.List;

class pear{};
class peach{};

class FruitBox2<T,U>{
	List<T> pears = new ArrayList<>();
	List<U> peaches = new ArrayList<>();
	
	public void add(T pear, U peach) {
		pears.add(pear);
		peaches.add(peach);
	}
	
	
}
public class Ex03_Generic {
	//멀티타입 파라미터
	//재네릭을 꼭 하나만 사용해야 하는법은 없다.
	//지정해야 할 타입이 여러개인 경우 2개든 3개든 얼마든지 만들 수 있다.
	public static void main(String[] args) {
		FruitBox2<pear, peach> box = new FruitBox2<>();
		box.add(new pear(), new peach());
		box.add(new pear(), new peach());
		
		
		
	}
}
