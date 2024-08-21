package ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		ArrayList<UserInfo> list = new ArrayList<>();
		outer : while(true) {
			 System.out.println("아이디 생성: ");
			 Scanner sc = new Scanner(System.in);
			 UserInfo ui = new UserInfo();
			 ui.setId(sc.next());
			 
			 for(int i=0; i < list.size(); i++) {
				 if(ui.getId().equals(list.get(i).getId())) {
					 System.out.println("아이디중복");
					 continue outer;
				 }
			 }
			 System.out.println("패스워드 입력 : ");
			 ui.setPwd(sc.nextInt());
			 
			 list.add(ui);
			 for(UserInfo u : list) {
				 System.out.println(u.getId());
				 System.out.println(u.getPwd());
				 System.out.println("--------------------------");
			 }
			 
		 }
		
		
	}
// 	 UserMain클래스 생성하기
//   User객체를 가지는 ArrayList 생성하기
//   유저의 정보를 입력받아 ArrayList에 저장하기
//   다음과 같은 결과가 나오도록 코드를 작성하시오
//   아이디가 중복될경우 “아이디가 중복됩니다”라는 메세지를 출력하고 다시 입력받는다.
}
// 아이디 생성 : aaa
//
// 패스워드 입력 : 1234
//
//aaa
//
//1234
//
//------------------------