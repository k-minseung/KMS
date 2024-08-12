package ex04_Math;

public class Ex01_Math {
	public static void main(String[] args) {
		//올림 ceil
		System.out.println("3.51올림 : "+ Math.ceil(3.51));
		
		//내림 floor
		System.out.println("31.61내림 : "+ Math.floor(13.61));
		
		//반올림 round
		System.out.println("12.8반올림 : "+Math.round(12.8));
		
		//최대값 구하기 [ int max(int a, int b) , double max(double a, double b) ]
		
		int maxValue = Math.max(30,60);
		
		//최소값 구하기 [ int min(int a, int b) , double min(double a, double b) ]
		
		int minValue = Math.min(40, 70);
		
		System.out.println(" 30, 60 최채값 : "+ maxValue);
		System.out.println(" 40, 70 최채값 : "+ minValue);
		
		//ex) 소수점 둘째자리 이하에서의 반올림 
		double pie = 3.14159265358979;
		
		System.out.println(Math.round(pie*100)/100.0);  // 3,14
		System.out.println(Math.round(pie*1000)/1000.0); // 3.142
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
