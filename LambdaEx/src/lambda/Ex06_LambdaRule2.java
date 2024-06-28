package lambda;

interface Unit9{
	int calc(int a,int b);	//반환타입이 있는 추상메서드
}

public class Ex06_LambdaRule2 {

	public static void main(String[] args) {
		Unit9 unit;
		
		unit = (a,b) ->   { return a +b;};	//return문 만 있을때는 {}와 return 모두 지울수 있다.
		
		int num = unit.calc(10, 20);
		System.out.println(num);
		
		unit = (a,b) -> a*b;
		System.out.println(unit.calc(10,20));
	}
}
