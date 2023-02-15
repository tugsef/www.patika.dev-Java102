
public class Main {

	public static void main(String[] args) {
		
		ThreadRace race = new ThreadRace();
		race.addMainArray();
		race.simpleList(4);
		
		Thread thrace1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				race.threadRace(0);
				
			}
		});
		
		Thread thrace2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				race.threadRace(1);
				
			}
		});


		Thread thrace3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				race.threadRace(2);
				
			}
		});
		Thread thrace4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				race.threadRace(3);
				
			}
		});
		thrace1.start();
		thrace2.start();
		thrace3.start();
		thrace4.start();
		
		try {
			thrace1.join();
			thrace2.join();
			thrace3.join();
			thrace4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      race.info();
	}

}
