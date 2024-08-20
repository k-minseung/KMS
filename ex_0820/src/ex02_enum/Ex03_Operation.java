package ex02_enum;

public class Ex03_Operation {
	public static void main(String[] args) {
		double x =2.5;
		double y =5.0;
		Operation[] otn = Operation.values(); 
		for(Operation ot : otn) {
			//System.out.println("2.5 "+ ot.getRes()+" 5.0 = "+ot.apply(2.5, 5.0));
			System.out.printf("%.1f %s %.1f = %.2f\n",x,ot.getRes(),y,ot.apply(x, y));
		}
	}
}
