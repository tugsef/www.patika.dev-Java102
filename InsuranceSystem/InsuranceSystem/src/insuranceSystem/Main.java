package insuranceSystem;

import insuranceSystem.account.InvalidAuthenticationException;

public class Main {

	public static void main(String[] args)  {
		
		Display display = new Display();
		
		
	while(true) {
		try {
			display.enter();
		} catch (InvalidAuthenticationException e) {
			e.printStackTrace();
			
		}
			// TODO Auto-generated catch block
		
	}
		
		
	}
	
}
