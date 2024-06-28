package lambda;

interface Unit6{	//람다에 이용하기 위한 인터페이스는 메서드가 하나만 있어야함(2개 이상이면 어떤걸 쓸지 몰라서 안됨)
	void move(String s);
}

public class Ex04_Lambda {

	public static void main(String[] args) {
		
		Unit6 unit = (String s) -> {	//구현체(인터페이스를 implements한 클래스를 객체로 선언한것)를 클래스로 굳이 만들지 않고 바로 사용하기 위해 람다를 사용
			System.out.println(s);  
			
		};
		unit.move("anonymous : Unit 6.....");
	}
}
