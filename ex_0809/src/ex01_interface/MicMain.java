package ex01_interface;

public class MicMain {
	public static void main(String[] args) {
		
		//BluetoothMic bm = new BluetoothMic();
		
		//bm.sing();
		//bm.music();
		System.out.println("------ Tjmic 객체 -----");
		Tjmic tm= new Tjmic ();
	
		tm.connect();
		tm.music();
		tm.sing();
		
		System.out.println("--- Tjmic객체를 BuletoothMic로 타입 변환 ---");
		
		BluetoothMic bm =tm;
		bm.connect();
		bm.music();
		bm.sing();
		
		System.out.println("--- Tjmic객체를 MicroPhone로 타입 변환 ---");
		
		MicroPhone m = tm;
		m.sing();
		// m.connect(); 오류
		// m.music(); 오류
		
		System.out.println("--- Tjmic객체를 Speaker로 타입 변환 ---");
		
		Speaker s = tm;
		s.music();
		//s.connect(); 오류
		//s.sing(); 오류
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
