package ex03_method;

public class Bus {
	// 메서드를 빠져 나가기 위한 return
	void take(int m) {
		while(!false) {
			if(m<3000) {
				System.out.println("교통카드를 충전하러 갑니다.");
				return;
			}
			System.out.println("버스를 탑니다.");
			m -=1400;
		}
	}
}
