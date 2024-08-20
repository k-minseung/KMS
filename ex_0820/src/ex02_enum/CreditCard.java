package ex02_enum;

import java.util.Arrays;
import java.util.List;

public enum CreditCard {
	SHINHAN("신한",Arrays.asList("Mr.Life카드","Deep Dream 카드", "Deep Oil 카드")),
	KB("국민",Arrays.asList("톡톡D 카드","티타늄 카드", "다담 카드")) ,
	NH("농협",Arrays.asList("올바른 FLEX카드","테이크5카드","NH올원 파이카드"));

	
	private String Enterprise;
	private List<String> cards;
	
	
	private CreditCard(String Enterprise, List<String> cards) {
		// TODO Auto-generated constructor stub
		this.cards=cards;
		this.Enterprise=Enterprise;
	}
	public List<String> getCards() {
		return cards;
	}
	public String getEnterprise() {
		return Enterprise;
	}
	//Enterprise, cards
}