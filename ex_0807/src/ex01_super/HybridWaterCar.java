package ex01_super;

public class HybridWaterCar extends HybridCar {
	private int waterGauge;
	HybridWaterCar(int gasGauge, int electricGauge, int waterGauge) {
		super(waterGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	public void showCurrentGauge() {
		super.showCurrentGauge();
// HybridCar을 호출함으로써 상위 클래스 출력문까지 함께 출력
		System.out.println("잔여 워터량 : " + waterGauge);
	}
}
