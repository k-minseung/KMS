package ex02;

import java.util.Scanner;

public class MethodTest {
 void maxFinder(int[] arr) {
		int max = arr[0];
		for(int i :arr) {
			if(i>max) {
				max=i;
				break;
			}
		}
		System.out.println("최대값 :"+max);
	}
 
	
//	최대값을 찾아야 하는 배열은 매개변수로 전달받는다.
//	배열의 최대값을 찾아서 메서드 안에서 출력하고 종료합니다.
//	메서드는 MethodMain클래스에서 호출합니다.
//	최대값을 찾을 배열은 int[] arr = {4,1,2,10,7,9,5,6,3,8} 입니다.

	
//	- 화씨를 섭씨로 바꾸는 fToc메서드
//    - 메서드 내부에서 온도를 입력받아 화씨를 섭씨로 바꾼 결과를 출력합니다.
//- 섭씨를 화씨로 바꾸는 cTof메서드
//    - 메서드 내부에서 온도를 입력받아 섭씨를 화씨로 바꾼 결과를 출력합니다.
//- 섭씨를 화씨로 바꾸는법 : 1.8 * 섭씨 + 32
//- 화씨를 섭씨로 바꾸는법 : (화씨-32)/1.8
//- MethodMain에서 숫자를 입력받는다.
//- 입력받은 숫자가 1이면 fToc메서드 호출하고 2면 cTof를 호출하시오

	
}

