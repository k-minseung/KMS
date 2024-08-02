package ex03_array;

import java.util.Random;
import java.util.Scanner;

public class Ex04_array {
	public static void main(String[] args) {
		//10개의 정수를 담을 수 있는 배열의 생성
		//배열의 이름은 numbers
		int [] numbers = new int[10];
	
		
		//배열에 Random클래스를 이용하여 1~30사이의 난수 넣기
		//nextInt(30)+1;
//		Random rnd = new Random();
//		for(int i=0; i<10; i++) {
//			numbers[i] =rnd.nextInt(30)+1;
//		}
		      
		//배열의 모든 요소 출력하기(가로)
		for(int i=0; i<numbers.length; i++) {
			System.out.print((numbers[i])+ " ");
		}
		
		
		
		//배열 안에서 짝수의 합 구하기
		int sum =0;
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]%2==0) {
				sum+= numbers[i];
			}
		}
		System.out.println();
		System.out.println("짝수의 합 : "+ sum);
		
		//배열에서 영문자만 추출하여 이어붙혀 출력하기
		char[] cards = {'1','L','2','O','3', 'V','E','4'};
		String myWord= "";
		//'A' -> 65
		//배열의 전체를 순회하는 반복문
		for(int i=0; i<cards.length;i++) {
			if(cards[i]>= 65 && cards[i]<=90) {//아스키코드 'A'가65 'Z'가90
				myWord+=cards[i];
				//myWord = "" + cards[i];
			}
		}
		System.out.println("단어 : "+ myWord);
		
		
		//배열 arr에 담겨있느 모든 값의 합을 구하세요
		
		int [] arr = {10,20,30,40,50};
		
		int total = 0;
		for(int i =0;i<arr.length; i++) {
			total+=arr[i];
		}
		System.out.println("총합 : " + total);
		
		//다음조건에 맞는 문제를  푸세요
		//- 키보드에 배열의 길이를 입력받는다
		//입력받은 길이만큼 알파벳을  넣고 출력한다
		//ex)배령의 길이를 입력하세요
		//ABCDE
//		Scanner sc = new Scanner(System.in);
//		System.out.print("배열의 길이 : ");
//		char[] c = new char [sc.nextInt()];
//		char c2 ='A';
//		
//		for(int i =0;i<c.length; i++) {
//			System.out.print(c[1] = c2++);
//		}
		
		//동전의 개수 구하기
		//10~5000사이의 난수를 변수에 담는다.
		//1의 자리는 반드시 0
		//발생된 난수를 각 동전으로 바꾸면 몇개씩 필요한지 판단하는 코드
		//가능한 적은 수의 동전을 사용하도록한다.
		System.out.println();
		
		
		int[] coin = {500,100,50,10};
		Random rnd = new Random();
		//난수에는 1의 자리가 없어야함
		int money =(rnd.nextInt(500)+1)*10;
		System.out.println("가격 : " +money);
		for(int i =0 ; i < coin.length ; i++) {
			//4170원이라고가정
			int res = money / coin[i];//동전의 개수
			money%=coin[i];//잔돈 money= money / coin[i];
			System.out.printf("%d원 : %d개\n",coin[i],res);
		}
		
		//로또번호 생성하기
		//1~45사이의 난수를 발생시켜 로또번호를 배열에 저장하고 출력하기
		//몇번만에 끝날지 모름
		int[] looto = new int[6];
		outer: for(int i=0; i < looto.length;) {
			looto[i]=rnd.nextInt(45)+1;
			for(int j = 0; j < i ; j++) {
				if(looto[i]==looto[j]) {
					continue outer;
				}
			}//inner
			
			System.out.print(looto[i]+" ");
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
