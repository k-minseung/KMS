package ex03_mathod;

public class Bread {
	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
	}
	public void makeBread(int n) {
			for(int i=0; i < n; i++) {
				System.out.println("빵을 만들었습니다.");
			}
			System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n",n);
		}
	public void makeBread(int n,String name) {
		for(int i=0; i < n; i++) {
			System.out.println(name + "빵을 만들었습니다.");
		}
		System.out.printf("요청하신 %d개의 %s빵을 만들었습니다.\n",n,name);
	}
		
	}

