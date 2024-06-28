package thread2;

public class MyData {
	int data = 3;
	
	public void plusData() {
		
		synchronized(this){		//this는 객체 자체를 말함 - > 키의 역할
			int mydata = data;// 데이터 가져오기
			try {
				Thread.sleep(2000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			data = mydata +1;
			
		
		}
	}
}
