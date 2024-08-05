package ex03_method;

public class MidTermMain {
	public static void main(String[] args) {
		int[] studentA = {97,42};
		int[] studentB = {99,45};
		MidTerm s = new MidTerm ();
		
		int sumA = s.score(studentA);
		int sumB = s.score(studentB);
		
		if(sumA>sumB) {
			System.out.println("A학생의  점수가 B 학생보다 더 높습니다. ");
		} else if(sumB>sumA) {
			System.out.println("B학생의  점수가 A 학생보다 더 높습니다.");
		} else {
			System.out.println("두 학생의 점수가 같습니다.");
		}
		
		
		
		
		
	}
}
