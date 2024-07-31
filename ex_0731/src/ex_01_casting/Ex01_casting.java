package ex_01_casting;

public class Ex01_casting {
	public static void main(String[] args) {
		//int num = 11;
		//double num2Change = 3.14;
		
		//num2Change = num;//정수를 실수형 변수에 대입
		
		//형 변환은 숫자를 담을 수 있는 기본저료형간에만 가능하다.
		//byte, short, int, long, float, double형 간에만 가능하며 문자형인 char역시 정수이기도 하므로 형 변환이 가능하다.
		
		//자동형변환(promotion)
		//서로 다른 자료형간의 대입이나 연산을 할 때 형변환으로 자료형을 일치시켜야 하지만 다음과 같은 경우 자바의 컴파일러가 자동으로 형변환을 해준다.
		//작은 자료형에서 큰 자료형으로 변환할 때
		//정수형
		//byte(1byte) -> short(2byte) -> int(4byte) -> long(8byte)
		
		//실수형
		//float(4byte) -> double(8byte)
		
		int i =100;
		char c = 'a';
		i = c; //아스키코드로 97로 변해서 들어간다
		System.out.println("i의 값 = " + i);
		double d = i ;
		System.out.println("d의 값 = " + d);
		
		
		
	}
}
