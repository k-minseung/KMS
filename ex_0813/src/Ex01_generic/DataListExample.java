package Ex01_generic;

public class DataListExample {
	public static void main(String[] args) {
		//dataList 객체 생성 변수명 list
		//DataList list = new DataList(); // 변수명이 list인 객체생성
		
		//제네릭 타입은 기본자료형으로 인식하지 않는다.
		//따라서 int , double 등 기본자료형을 제네릭 타입으로 이용하려면 Intger, Double등 Wrapper클래스를 이용해야함
		DataList<Integer> list = new DataList<Integer>();
		//정수입력
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		//문자열저장
		//list.add("문자열");
		
		//실수 저장
		//list.add(12.45);
		
		//데이터 출력
		int sum=0;
		for(int i =0; i <list.size();i++) {
			sum+= list.get(i);
//			System.out.println(list.get(i));
//			Object data =list.get(i);
//			
//			//지정된 타입이 어떤타입인지 검사
//			if(data instanceof Integer) {
//				System.out.println("정수 : "+(int)data);
//			}else if (data instanceof Double) {
//				System.out.println("정수 : "+(double)data);
//			}else if (data instanceof String) {
//				System.out.println("정수 : "+(String)data);
//			}
//			
//			
		}
		System.out.println("총합 : "+ sum);
		
		
		
		
		
		
		
		
		
	}
}
