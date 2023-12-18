package Lambda;

public class ThreadDemo {

	 public static void main(String[] args) {
		
//		 Runnable thread1=()->{
//		 for (int i = 0; i <=10; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		 }
//		};
//		Thread t =  new Thread(thread1);
//		t.setName("Monti");
//		t.start();
		
		Runnable t2 =()->{
			try {
				for (int i = 0; i <=10; i++) {
					System.out.println(i*2);
					Thread.sleep(2000);
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		};
		Thread t22 = new Thread(t2);
		t22.start();
	}
}
