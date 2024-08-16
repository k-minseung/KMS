package Ex01_lamda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Ex07_lamda {
	public static void main(String[] args) {
		//메서드의 참조								//클래스명  //메서드명
		Function<String, Integer> f = (String s) -> Integer.parseInt(s);				   
		Function<String, Integer> f1 = Integer::parseInt;
		System.out.println("정수 : "+f.apply("100"));
		
		//BiFunction<String, String, Boolean> f2 = (s1,s2) -> s1.equals(s2);
		BiFunction<String, String, Boolean> f2 = String::equals;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
