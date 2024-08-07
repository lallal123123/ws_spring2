package stream;

import java.util.Arrays;
import java.util.List;

public class ReduceTest {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동","전우치","손오공");	//배열을 바로 리스트로 바꿔주는 메서드 
		
		String name1 = list1.stream().reduce("이순신",(s1,s2) -> s1.length() >= s2.length() ? s1 : s2);//이순신은 비교할 초기값을 설정해준거임
		
		System.out.println(name1);
		
		List<String> list2= Arrays.asList("홍길동","멀린","해리포터");
		
		String name2 = list2.stream()
				.reduce("이순신",(s1,s2) -> s1.length() >= s2.length() ? s1 : s2);
		System.out.println(name2);
		
		
	}

}
