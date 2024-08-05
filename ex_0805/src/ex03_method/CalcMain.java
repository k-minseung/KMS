package ex03_method;

public class CalcMain {
	public static void main(String[] args) {
		Calc c = new Calc();
		c.sum(2, 4);
		c.sum(5, 6);
		
		int []nums = {100,200};
		//c.sum(nums);
		//필요에 따라 결과값을 변수에 저장하여 활용할 수 있다.
		int n = c.sum(nums);
		System.out.println("총합 : "+ n);
		
	}
}
