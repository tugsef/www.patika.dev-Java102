
public enum loginTest {

	SUCCESS(true),
	FAIL(false);
	
	private boolean login;
	
	loginTest(boolean login){
		this.login = login;
	}
	
	public boolean getLogin() {
		return login;
	}
	
	
}
