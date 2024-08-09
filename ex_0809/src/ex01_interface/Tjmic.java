package ex01_interface;

public class Tjmic implements BluetoothMic {

	@Override
	public void sing() {
		System.out.println("마이크에 대고 노래부르기");
		
	}

	@Override
	public void music() {
		System.out.println("마이크에 장착된 스피커로 음악듣기");
		
	}

	@Override
	public void connect() {
		System.out.println("핸드폰이 블루투스와 연결이 되었습니다.");
		
	}
	
}
