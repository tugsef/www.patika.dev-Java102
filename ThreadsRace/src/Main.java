import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


	 

	    public static void main(String[] args) {
	    
	     ThreadRace race = new ThreadRace();
	     
	     race.addMainArray();
	     
	     
	     
	     race.simpleList(4);
	     
	     ExecutorService executor = Executors.newFixedThreadPool(1);
  
	     for (int i = 0; i < 4; i++) {
			executor.submit(new ThreadRace(i));
     }
	     
	     executor.shutdown();
	
	    	     
	     
	     
	    
	     
	    	
	    	
	    }
}
