package ex03_annotation;


@FunctionalInterface
interface B{
	void methed();
}

@SuppressWarnings("removal")
class A{
	@Deprecated
	public void oldOne() {
		
	}
	
	Integer i = new Integer(10);
}
public class Ex01_annotation {
	//@Override
	//컴파일러에게 재정의하는 메서드라는것을 알린다.
	
	//@Deprecated 앞으로 사용되지 않을 것을 권장하는 대상에게 붙힌다
	//@SuppressWarnings 경고를 무시해준다.
}
