package ex05;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01_Stream {
	public static void main(String[] args) {
		String[] strArray = {"홍길동","김자바","박디비"}; //원본 배열
		Stream<String> strStream = Arrays.stream(strArray);// 배열이 복사되어서 들어감
		strStream.forEach(System.out::println);
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(System.out::print);
		}
	}

