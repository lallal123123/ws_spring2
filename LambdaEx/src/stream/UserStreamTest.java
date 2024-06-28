package stream;

import java.util.ArrayList;
import java.util.List;

public class UserStreamTest {

	public static void main(String[] args) {

		User u1 = new User("James",23);
		User u2 = new User("Ann",34);
		User u3 = new User("Benjamin",42);
		
		List<User> users = new ArrayList<>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		
		users.stream().map(n -> n.getName()).forEach(s -> System.out.println(s));
		
		
		
		
	}

}
