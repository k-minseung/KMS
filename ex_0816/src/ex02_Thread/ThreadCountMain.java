package ex02_Thread;

import java.util.Scanner;

class ThreadCount extends Thread	{
	private int n;
	public ThreadCount(int n) {
		this.n=n;
	}
	@Override
	public void run() {
			for(int i=n;i>=0;i--) {
				try {
					System.out.println(i);
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			System.out.println("시스템 종료");
	}
}

public class ThreadCountMain {
//스캐너를 통해 숫자를 입력받고 
//스레드에서 입력받은 숫자부터 1 씩 감소하다가 0이 되었을 때
//종료 라는 메세지와 함께 스레드 종료
//스레드카운트 클래스에 스레드 정의하기	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
	
		ThreadCount t = new ThreadCount(sc.nextInt());	
		t.start();
		
		
	}
}

