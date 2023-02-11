
public class InvalidAuthenticationException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAuthenticationException(String message) {
		super(message);
	}
	
	
	@Override
	public void printStackTrace() {
		System.out.println("Email veya Şifre hatalı...");
	}
	
	

}
