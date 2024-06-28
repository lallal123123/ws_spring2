package thread5;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture {

   public static void main(String[] args) throws InterruptedException, ExecutionException {
      Callable<Integer> task1 = () -> {	//리턴을 할수있는 스레드
         Thread.sleep(2000);
         return 2 + 3;
      };
      
      Callable<Integer> task2 = () -> {
         Thread.sleep(10);
         return 2 * 3;
      };
      
      ExecutorService pool = Executors.newFixedThreadPool(2);
      Future<Integer> future1 = pool.submit(task1);	//future는 스레드에서 리턴값을 값을 받아줌
      Future<Integer> future2 = pool.submit(task2);
      
      System.out.println("이 내용이 먼저 출력됩니다.");
      
      Integer r1 = future1.get();		//future.get을 할때 겟 할 내용이 아직 처릭가 안되었다면 블록시켜서 기다림
      System.out.println("result : " + r1);
      
      Integer r2 = future2.get();
      System.out.println("result : " + r2);
      
      pool.shutdown();
      
   }

}
