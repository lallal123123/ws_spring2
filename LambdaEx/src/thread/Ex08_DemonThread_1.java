package thread;

class MyThread5 extends Thread{
	
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon() ? "데몬쓰레드" : "일반쓰레드"));
		for(int i = 0 ; i < 6 ; i++) {
			System.out.println(getName() + " : " + i + "초");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex08_DemonThread_1 {
//일반 쓰레드
	
	public static void main(String[] args) {
		
		Thread thread1 = new MyThread5();
		thread1.setDaemon(false);	//일반쓰레드 설정, true : 데몬쓰레드 설정
		thread1.setName("thread1");
		thread1.start();
		
		//3초 후 main 쓰레드 종료
		try {
			Thread.sleep(3000);
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("main Thread 종료.....");
	}
	
}
