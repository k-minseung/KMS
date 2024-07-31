package ex_01_casting;

public class Ex02_casting {
	public static void main(String[] args) {
		//강제형변환(Demotion)
		//큰 컵의 물을 작은 컵에 옮겨 담는것과 같다.
		//물의 양에 따라서 보존될 수 있지만 넘칠수도있다.
		//큰 자료형에서 작은 자료형으로 옮길 때 데이터의 손실이 발생할수도 있고 안할수도 있다.
		//데이터의 손실이 일어난다면 정확한 연산을 수핼할 수 없기 떄문에 예상하지 못한 결과를 얻을 수 있으므로 강제 형변환은 항상 주의가 필요하다.
		
		//Demotion방법
		//(원하는 자료형)데이터 or 변수;
		
		//int -> byte
		int i = 10;
		byte b = (byte) i; //byte는 -128~127
		System.out.println("[int -> byte] i의 값 : " + i + ", b의 값 : " + b);
		System.out.printf("[int -> byte] i의 값 : %d, b의 값 : %d\n",i,b);
		
		//int -> byte(값이 큰경우)
		int j = 1000; //byte의 값보다 커서 예상과 다른 값이 나올 수 있다.
		byte c = (byte)j;
		System.out.printf("[int -> byte] i의 값 : %d, c의 값 : %d",j,c);
	}
}
