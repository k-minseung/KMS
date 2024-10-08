package ex03_method;

public class MethodTest {
	// 배열의 최대값을 찾아 출력하는 maxFinder메서드 작성하기
	// 배열은 매개변수로 전달받는다
	//배열의 최대값을 찾는 maxFinder메서드
	public void maxFinder(int[] arr) {
		//탐색 알고리즘
		int max = arr[0];
		for(int x : arr) {
			if(x > max) max = x;
		}
		
		System.out.println("최대값 : " + max);
	 }
	
	//계산기 만들기
	//Main에서 숫자 두개랑 ,산술연산자를 전달받아서 계산을 해서 반환하는 
	//getResult()메서드 작성
	
	public int getResult(int x, int y, String op) {
		int result = 0;
		if(op.equals("+")) {
			return x + y;
		} else if(op.equals("-")) {
			return x - y;
		} else if(op.equals("*")) {
			return x * y;
		} else if(op.equals("/")) {
			return x / y;
		} else {
			System.out.println("연산기호가 올바르지 않습니다.");
			return-1;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

