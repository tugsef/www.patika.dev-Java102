package insuranceSystem.account;

public class InvalidAuthenticationException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public InvalidAuthenticationException() {
		super();
		// TODO Auto-generated constructor stub
	}


	public InvalidAuthenticationException(String message) {
		
		System.out.println(message);
		
	}

	
   
	


	@Override
	public void printStackTrace() {
		System.out.println();
		System.err.println("    Email veya Parola Hatalı ....");
	}
	
	
	
}
