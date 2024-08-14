package ex05_lambda;

@FunctionalInterface
//@FunctionalInterface
//인터페이스의  추상메서드가 무조건 1개 있어야 오류가나지 않는다.
public interface Calculator {// 함수형 인터페이스를 쓰려면 '무조건 한 개'의 추상 메서드만 존재해야함 
	int plus(int num1,int num2);
	//int minus(int num1,int num2);
	
}
