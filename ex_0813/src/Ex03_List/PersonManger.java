package Ex03_List;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManger {
	public void personMgr() {
		int select;
		Person p;
		
		ArrayList<Person> personArr = new ArrayList<Person>();
		while(true) {
			System.out.println("1. 정보추가");
			System.out.println("2. 정보삭제");
			System.out.println("3. 전체정보");
			System.out.println("4. 종료");
			System.out.print("항목선택 : ");
			Scanner sc = new Scanner(System.in);
			select = sc.nextInt();
			
			switch(select) {
			case 1: // 정보추가
				p=new Person();//사람객체 만들기
				System.out.println("---정보추가---");
			
				System.out.print("이름 : ");
				p.setName(sc.next());
			
				System.out.print("나이 : ");
				p.setAge(sc.nextInt());
			
				System.out.print("전화 : ");
				p.setTel(sc.next());
			
				personArr.add(p);
				System.out.println("정보가 저장되었습니다.");
				System.out.println("------------------");
				break;
	
			case 2: // 정보삭제
				//이름을 입력 받는다
				//리스트안에 입력받은 이름이 있으면 삭제
				//xx의 이름을 삭제했습니다 출력
				//xx이 존재하지 않습니다 출력
				System.out.println("---정보삭제---");
				System.out.print("삭제할 이름 : ");
				String str = sc.next();
				
				for(int i =0; i < personArr.size();i++) {
					if((personArr.get(i).getName()).equals(str)) {
						personArr.remove(i);
						System.out.println(str+"의 정보를 삭제했습니다.");
						break;
					}else {
						//list에 저장된 사람이 아닐 때
						if(i + 1 == personArr.size()) {
							System.out.println(str+"이 존재하지 않습니다.");
						}
					}
				}
				break;
				
			case 3: // 전체정보
				System.out.println("---전체정보---");
				System.out.println("등록인원"+personArr.size()+"명");
				for(Person pe : personArr) {
					System.out.println("이름 : "+pe.getName());
					System.out.println("나이 : "+pe.getAge());
					System.out.println("번호 : "+pe.getTel());
					System.out.println("---------------------");
				}
				break;
				
				
			case 4: // 종료
				System.out.println("---종료---");
				return ;
				
				
				
				
				
			}
		}
	}
}
