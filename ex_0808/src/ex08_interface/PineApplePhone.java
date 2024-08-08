package ex08_interface;

public class PineApplePhone implements Phone {
	
	//인터페이스를 구상하는 클래스에 모든 추상메서드를 구체화 해야한다.
	
	int batteryCapcity=40;
	boolean isOn = false;
	
	@Override
	public void powerOn() {
		if(batteryCapcity > 30) {
		System.out.println("@@@Power on!@@@");
		isOn=true;
		} else {
			System.out.println("Low Battery.../");
		}
	}

	@Override
	public void powerOff() {
		System.out.println("@@@Power off!@@@");
		isOn = false;
		
	}

	@Override
	public boolean isOn() {
		if(isOn) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void watchUtube() {
		if(batteryCapcity > 10) {
			System.out.println("--- WatchUtube ---");
			batteryCapcity -=10;
			System.out.println("battery is ---"+ batteryCapcity+"%");
		} else {
			System.out.println("Low Battery.../");
			powerOff();
		}
		
	}

	@Override
	public void charge() {
		if(batteryCapcity<Phone.MAX_BATTERY_CAPACITY-20) {
			System.out.println("--- Charge ---");
			batteryCapcity += 5;
			System.out.println("Charged..."+ batteryCapcity + "%");
		} else {
			System.out.println("You don't have to Charge.");
			System.out.println("It's enough..."+ batteryCapcity+"%");
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
