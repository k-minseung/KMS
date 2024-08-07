package ex01_super;
	//상속을 이용해서 다음 클래스들을 간결한 구조로 만드세요.
	//부모 -> 넓은 범위의 개념, 자식 -> 좁은 범위의 개념

	class Pen{
		private int amount;
		public int getAmount() {return amount;}
		public void setAmount(int amount){this.amount = amount;}
	}


	class SharpPencil extends Pen{ //샤프펜 Pen에서 상속받기
	    private int width; //펜의 굵기
	   /*
	    private int amount; //남은 량
	    public int getAmount(){return amount;}
	    public void setAmount(int amount){this.amount = amount;}
	   */
	}
	
	class Ballpen extends Pen{ //볼펜 Pen에서 상속받기
	    private String color; //볼펜의 색
	    public String getColor(){return color;}
	    public void setColor(String color){this.color = color;}
	   /*
	     private int amount; //남은 량
	     public int getAmount(){return amount;}
		 public void setAmount(int amount){this.amount = amount;}
	   */
	}

	class FountainPen extends Ballpen{//만년필 Ballpen에서 상속받기
	    public void refill(int n){setAmount(n);}
	   /*
	     private int amount; 
	     public int getAmount(){return amount;}
	     public void setAmount(int amount){this.amount = amount;}
	     private String color; //볼펜의 색
	     public String getColor(){return color;}
	     public void setColor(String color){this.color = color;}
	   */
	}
	/*
	 * 
	//실행했을 때 출력되는 내용
	class A{
	    public A(){System.out.println("A");}
	    public A(int x){System.out.println("A: " + x);}
	}

	class B extends A{
	    public B(){super(100);}
	    public B(int x){System.out.println("B: "+x);}
	}

	public class Example {
	    public static void main(String[] args){
	        B b = new B(11);
	        b.main();
	    }
	}
	
	 결과값
	 A
	 B : 11
	 
	*/













public class PenMain {

}
