package ex05;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04_Stream {
	public static void main(String[] args) {
		Integer[] nums= {1,44,33,21,36,38,4,5,6,1,1,1,2,2,2};
		
		//1.스트림 객체만들기
		
		Stream<Integer> stream = Arrays.stream(nums);
		
		//2. 중간연산
		stream.distinct().sorted().limit(5).forEach(x -> System.out.println(x+" "));
		System.out.println();
		System.out.println(Arrays.toString(nums));
		
		//3. 정수범위생성
		
		IntStream intStream = IntStream.rangeClosed(1, 10);
		//skip(n) : 맨 처음 n개를 버리고 시작
		//limit(n) : n개의 개수를 갖는 스트림을 반환
		intStream.skip(3).limit(5).forEach(x -> System.out.println(x+""));
		System.out.println();
		
		IntStream intStream2 = IntStream.of(1,2,2,3,3,4,5,5,6,7,8,9,10);
		//246810
		intStream2.distinct().filter((x -> x % 2 == 0)).forEach(x -> System.out.print(x+" "));
		System.out.println();
		
		Stream.of("ab","a","abc","abcd","abcde","abcdef","abcdefg").filter(x -> x.length()>2).forEach(x -> System.out.print(x+" "));
	}
}
