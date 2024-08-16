package Ex01_lamda;

import java.io.InterruptedIOException;

interface Interface{
	//추상메서드
	abstract void methodA();
	abstract void methodB();
	abstract void methodC();
	
	//1 메서드 앞에 default 예약어를 붙힌다.
	//2 body(구현부)가 있어야한다.
	
	default void dafaultMethodA() {
		System.out.println("디폴트 메서드 A");
	}
	
}

class InterImpl implements Interface{
	// 안쓴다고 할지언정 일단 모든 메서드를 오버라이딩 해야한다.
	@Override
	public void methodA() {
		 System.out.println("오버라이딩된 메서드 A");
		
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		
	}
	
}


public class Ex02_DafaultMethod {
	public static void main(String[] args) {
		Interface inter = new InterImpl();
		inter.dafaultMethodA();
		inter.methodA();
	}
}
