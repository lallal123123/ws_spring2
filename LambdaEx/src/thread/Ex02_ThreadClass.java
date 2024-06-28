package thread;

class MyThread2 extends Thread{	//Thread를 쓰면 메인 흐름과 상관없이 흘러감
	
	@Override
	public void run() {
		int sum= 0;
		for(int i = 0 ; i < 10 ; i++) {
			sum = sum + i;
		}
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " +sum);
	}
}


public class Ex02_ThreadClass {
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		t.start();		//start()메서드가 run()을 호출 할것임 (상속받은 Thread에 가보면 있음)
		System.out.println("main : " + Thread.currentThread().getName());
		
		
		
	}
}
