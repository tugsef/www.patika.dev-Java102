public class Main {


	 

	    public static void main(String[] args) {
	    
	     ThreadRace race = new ThreadRace();
	     
	     race.addMainArray();
	     
	     
	     
	     race.simpleList(4);
	     
	     Thread thread1 = new Thread(new ThreadRace(0));
	     Thread thread2 = new Thread(new ThreadRace(1));
	     Thread thread3 = new Thread(new ThreadRace(2));
	     Thread thread4 = new Thread(new ThreadRace(3));
	     
	     thread1.start();
	     thread2.start();
	     thread3.start();
	     thread4.start();
	     
	     
	     
	     try {
			thread1.join();
			thread1.join();
			thread1.join();
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	   
	     
//	     
//     ExecutorService executor = Executors.newFixedThreadPool(2);
//	              
//	     for (int i = 1; i < 4; i++) {
//			executor.submit(new ThreadRace(i));
//     }
//	     try {
//	    	 Thread.sleep(2000);
//	    	 executor.submit(new ThreadRace(0));
//	    	 
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	     executor.shutdown();
//	
	    	     
	     
	     
	    
	     
	    	
	    	
	    }
}
