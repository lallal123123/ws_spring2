package thread;

class MyThread3 implements Runnable{//클래스로 스레드를 상속받으면 다른 클래스를 상속 받지 못해서 인터페이스로 구현함(상속은 하나만 가능해서)

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}


public class Ex03_RunnableInterface {
	public static void main(String[] args) {
		Thread t = new Thread(new MyThread3());	//MyThread3이 Runnable의 구현체이기때문에 start()로 사용하려면 Thread()로 선언해야함
		t.start();
		System.out.println("main : " + Thread.currentThread().getName());
	}

}
