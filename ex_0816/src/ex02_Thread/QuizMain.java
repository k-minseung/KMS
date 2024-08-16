package ex02_Thread;

import java.util.Random;
import java.util.Scanner;

class QuizThread extends Thread{
	int sum1, sum2;
	int time = 0;
	int count = 0;
	final int FINISH =5;
	boolean ischeak = true;
	public void startGame(){
		while(ischeak) {
			try {
				int sum1=new Random().nextInt(100)+1;
				int sum2=new Random().nextInt(100)+1;
				System.out.print(sum1+"+"+sum2+"=");
				Scanner sc = new Scanner(System.in);
				int res = sc.nextInt();
				
				if(res==(sum1+sum2)) {
					System.out.println("정답");
				}else {
					System.out.println("오답");
					continue;
				}
				count++;
				
				if(count == FINISH) {
					System.out.println("걸린시간 : "+time+"초");
				}
				
				
				
			} catch (Exception e) {
				System.out.println("정답은 정수로 입력하세요");
			}//try-catch
		}//while
	}//startGame
	
	@Override
	public void run() {
		while(ischeak) {
		try {
			Thread.sleep(1000);
			time++;
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
	}
}

public class QuizMain {
	public static void main(String[] args) {
		QuizThread qt = new QuizThread();
		qt.start();
		qt.startGame();
	}
}
