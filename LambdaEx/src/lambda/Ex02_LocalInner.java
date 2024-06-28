package lambda;

class HumanCamp2 {
	private int speed = 10;

	public void getMarine() {
		class Marine2{
			public void move() {
				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
			}
		}
		
		Marine2 inner = new Marine2();
		inner.move();
	}
}

public class Ex02_LocalInner {	//하나의 클래스에만 public을 붙임(클래스 명과 같은 클래스에)
	public static void main(String[] args) {
		HumanCamp2 hc = new HumanCamp2();
		hc.getMarine();
	}
}

