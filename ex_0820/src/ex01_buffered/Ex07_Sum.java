package ex01_buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex07_Sum {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력 : ");
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;//총합을담을 변수
		
		//입력받은 문자열을 미리 배열에 담아놓는다
		String [] arr = br.readLine().split("");
		
		//내가 입력받은 숫자만큼만 반복
		for(int i=0 ; i <n; i++) {
			//입력받은만큼만 더함
			sum += Integer.parseInt(arr[i]);
		}
		System.out.println("총합 : "+ sum);
		
		
	//N개의 숫자가 공백없이 쓰여있다 이숫자를 모두 합해서 출력하는 프로그램을 작성하세요
		
		//입력
		//N개의 숫자 입력, 입력된 n개의 숫자만큼 숫자들이 공백없이 주어진다.
		
		//출력
		//입력으로 주어진 숫자 n개의 합을 출력
		
		//예시
		//1
		//1
		//결과
		//1
		
		//5
		//54321
		//결과 
		//15
		
		//25
		//70000000000000000000000
		//결과
		//7
		
		//11
		//10987654321
		//46
	
	
		
		
		

	
		
		
		
		
		
		
		
	}
}
