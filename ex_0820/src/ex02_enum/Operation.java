package ex02_enum;

public enum Operation {
	//public static final Operation PLUS = new Operation(); -> 같은 효과
	PLUS("+"){
		@Override
		public double apply(double x, double y) {
			return x+y;
		}
	},	
	MINUS("-"){
		@Override
		public double apply(double x, double y) {
			// TODO Auto-generated method stub
			return x-y;
		}
	},
	MULTI("*"){
		@Override
		public double apply(double x, double y) {
			// TODO Auto-generated method stub
			return x*y;
		}
	},
	DIVIDE("/"){
		@Override
		public double apply(double x, double y) {
			// TODO Auto-generated method stub
			return x/y;
		}
	};
	//
	private String res;
	//생서자를 호출할 때 전달한 인자를 받는 생성자를 정의해야한다.
	Operation(String res) {
		this.res = res;
	}
	//private으로 설정된 필드의 값을 외부에서 보기위해 메서드를 사용 getter
	public String getRes() {
		return res;
	}
	
	public abstract double apply (double x, double y);
	
	
}
