package insuranceSystem.account;

public enum AuthenticantionStattus {
	SUCCESS(true),
	Fail(false);
	
	boolean login;
	
	private AuthenticantionStattus(boolean login) {
		this.login = login;
	}

	public boolean isLogin() {
		return login;
	}

	
	
	
	
}
