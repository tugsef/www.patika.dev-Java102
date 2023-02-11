package insuranceSystem;

import java.util.Scanner;

import insuranceSystem.account.AbstractAccount;
import insuranceSystem.account.InvalidAuthenticationException;



public class Display {
	private static Scanner scanner = new Scanner(System.in);
	public void enter() throws InvalidAuthenticationException  {
		
		
		
		System.out.println("  \n\n                     *********Sigorta Sistemi*********\n");
		System.out.print("    Lütfen Email Adresinizi Giriniz : ");
		String email = scanner.nextLine();
		
		System.out.print("    Lütfen Parala Giriniz : ");
		String password = scanner.nextLine();
		
		AccountManager accountManager = new AccountManager();
		accountManager.deneme();
		
			
		
    AbstractAccount account =  accountManager.login(email, password);
		if(account == null) {
			throw new InvalidAuthenticationException();
		}else {
			
			account.menu(account);
		}
		
	
		}
	
}
