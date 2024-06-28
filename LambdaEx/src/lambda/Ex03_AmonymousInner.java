package lambda;

interface Unit3 {
	void move();
}

class HumanCamp3 {
	private int speed = 10;
	public Unit3 getMarine() {
//		class Marine3 implements Unit3 {
//			@Override
//			public void move() {
//				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
//			}
//		}
		
		//익명내부 클래스
		return new Unit3() {	//원래 인터페이스는 객체로 선언 못함, 가능하게 하기 위해 {}안에 객체의 내용을 넣어줌,클래스를 만들어서 선언하는 절차를 생략하기위해

			@Override
			public void move() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
}

public class Ex03_AmonymousInner {

	public static void main(String[] args) {
		HumanCamp3 hc = new HumanCamp3();
		Unit3 unit = hc.getMarine();
		unit.move();
	}
}
