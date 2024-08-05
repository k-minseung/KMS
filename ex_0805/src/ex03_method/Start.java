package ex03_method;

import java.util.Random;

public class Start {
	//1~50 사이의 난수를 발생시킨다
	//StartMain사용자가 키보드를 통해 정수를 입력 받는다
	//Start클래서에서 사용자가 입력한 숫자를 판단하여 발생한
	//난수보다 크다면 Down 작다면 Up 출력
	//사용자가 입력한 숫자와 발생한 난수가 같은경울 프로그램 종료시키며
	//몇회만에 정답을 맞추는지 카운트 하기
	Random rnd = new Random();
	int n1 =rnd.nextInt(50)+1;// 50까지의 난수를 작성 (50)+1
	int count = 1;
	public String check(int n) {
		if(n == n1) {
			return "정답";
		} else if(n1<n) {
			return "Up";
		} else {
			return "Down";
		}
		
	}

	
}
