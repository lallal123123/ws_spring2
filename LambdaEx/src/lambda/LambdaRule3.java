package lambda;

@FunctionalInterface
interface Unit10{		//@FunctionalInterface 있는 인터페이스에 메서드가 2개있으면 에러뜸
	String move();
	//void attack();
}

public class LambdaRule3 {
	
	public static void main(String[] args) {
		
		Unit10 unit = () ->{return "인간형 유닛 이동";}; 	//인터페이스에서 매개변수가 없을때 ()로 놔둠
				
		System.out.println(unit.move());		
	}
}
