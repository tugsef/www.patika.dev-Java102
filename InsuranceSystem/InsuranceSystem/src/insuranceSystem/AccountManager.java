package insuranceSystem;

import java.util.ArrayList;
import java.util.TreeSet;

import insuranceSystem.account.AbstractAccount;
import insuranceSystem.account.AuthenticantionStattus;
import insuranceSystem.account.Individual;
import insuranceSystem.account.insurance.AbstractInsurance;
import insuranceSystem.account.insurance.Insurances;
import insuranceSystem.account.insurance.TravelInsurance;
import insuranceSystem.account.users.Users;
import insuranceSystem.account.users.adress.Addresses;
import insuranceSystem.account.users.adress.HomeAdress;

public class AccountManager {
	
	private TreeSet<AbstractAccount> accounts  = new TreeSet<>(new OrderId());
	
	public AccountManager() {
		super();
	}
	
	public  void deneme() {
		AbstractAccount account = new Individual();
		
		
		
		Users user = new Users();
		user.setFirstName("Sefa");
		user.setLastName("Demirtaş");
		user.setEmail("sefa.demirtas91@gmail.com");
		user.setPassword("12345");
		user.setJob("Java Developer4444444444444");
		user.setDataOfEntry("10.02.2023");
		
		
		Addresses home = new HomeAdress("Ev Aderesim: Mah. 215.sok", "Türkiye", "İzmir", "35510");
		
		ArrayList<Addresses> address = new ArrayList<>();
		address.add(home);
		user.setAdresses(address);
		
		AbstractInsurance insurances = new TravelInsurance();
		
		insurances.setName("Seyahat Sigortası");
		insurances.setFistDate("10.02.2023");
		insurances.setFinishDate("11.02.2024");
		double price =  insurances.calculate();
		insurances.setPrice(price);
		ArrayList<Insurances> insurances2 = new ArrayList<>();
		insurances2.add(insurances);
		
		account.setInsurances(insurances2);;;
		

		account.setUser(user);
		getAccounts().add(account);
		
		
		
	}
	
	
	
	
	public AbstractAccount login(String email,String password)  {
		
		Users user = new Users();
		user.setEmail(email);
		user.setPassword(password);
	
		for (AbstractAccount abstractAccount : accounts) {
			if(abstractAccount.getUser().getEmail().equalsIgnoreCase(email) && abstractAccount.getUser().getPassword().equalsIgnoreCase(password)) {
				abstractAccount.setLog(AuthenticantionStattus.SUCCESS);
				return abstractAccount;
				
				
			}
			
		
		}
		
		return null;
		
//		Iterator<AbstractAccount> treeSet = accounts.iterator();
//		
//		while (treeSet.hasNext()) {
//		
//			if(treeSet.next().getUser().getEmail() == email && treeSet.next().getUser().getPassword()==password) {
//				treeSet.next().showInfo();
//			} 
//		}
		
		
		
		
		
	}

	




	public AccountManager(TreeSet<AbstractAccount> accounts) {
		super();
		this.accounts = accounts;
	}

	public TreeSet<AbstractAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(TreeSet<AbstractAccount> accounts) {
		this.accounts = accounts;
	}

	
	
	
}
