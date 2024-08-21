package ex05;

import java.util.Arrays;

public class Ex06_Stream {
	public static void main(String[] args) {
		String[] list2 = {"김길동","박자바","심슨"};
		Arrays.stream(list2).sorted().toArray(String[]::new);
		System.out.println(Arrays.toString(list2));
		System.out.println(Arrays.toString(list2_1));
	}
}
