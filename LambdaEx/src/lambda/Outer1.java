package lambda;

public class Outer1 {
	private int speed = 10;

	class MemberInner1 {

		public void move() {
			System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);

		}
	}

	public void getMarine() {
		MemberInner1 inner = new MemberInner1();
		inner.move();
	}

}
