package ex05_lambda;

public class CalculatorImpl implements Calculator {
	//추상메서드 오버라이딩 해야함
	@Override
	public int plus(int num1, int num2) {
		return num1+num2;
	}

}
