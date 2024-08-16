package Ex01_lamda;

import java.util.function.Function;

public class Ex05_lamda {
	public static void main(String[] args) {
		// R apply(T t)
		Function<String, Integer> f = s -> Integer.parseInt(s, 16); // 16진수 -> 10진수로 변환
		Function<Integer, String> g = i -> Integer.toBinaryString(i);// 2진수로 변환
		Function<String, String> h= f.andThen(g);
		System.out.println(h.apply("FF")); // FF -> 225 이기때문에 이진수로 바꾸면 11111111 이 나옴
		
		Function<Integer, String> x = i -> Integer.toBinaryString(i);
		Function<String, Integer> y = s -> Integer.parseInt(s,16);
		Function<Integer, Integer> z = f.compose(x);
		System.out.println(z.apply(2)); // 2-> " 10" -> 16 2를 이진법으로 바꾸면 10 을 바꾸면 16
		
		
		
		
		
		
		
		
		
	}
}
