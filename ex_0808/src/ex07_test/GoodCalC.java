package ex07_test;

public class GoodCalC extends Calculator {

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int substract(int x, int y) {
		return x-y;
	}

	@Override
	public double average(int[] z) {
		int sum = 0;
		for(int i : z) {
			sum += i;
		}
		  double avg = sum / (double)z.length;
	        return avg;
		
	}
}
