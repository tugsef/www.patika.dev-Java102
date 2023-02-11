package insuranceSystem.account.users;

import java.util.ArrayList;

import insuranceSystem.account.users.adress.Addresses;

public class Users {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String job;
	private ArrayList<Addresses> adresses;
	private String dataOfEntry;
	
	
	
	
	public Users() {
		super();
	}


	public Users(String firstName, String lastName, String email, String password, String job,
			ArrayList<Addresses> adresses, String dataOfEntry) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.job = job;
		this.adresses = adresses;
		this.dataOfEntry = dataOfEntry;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public ArrayList<Addresses> getAdresses() {
		return adresses;
	}
	public void setAdresses(ArrayList<Addresses> adresses) {
		this.adresses = adresses;
	}
	public String getDataOfEntry() {
		return dataOfEntry;
	}
	public void setDataOfEntry(String dataOfEntry) {
		this.dataOfEntry = dataOfEntry;
	}
	@Override
	public String toString() {
		String fmt = "%1$-20s %2$-20s %3$-45s %4$-20s %5$-20s%n";
		return String.format(fmt,getFirstName(),getLastName(),getEmail(),getJob(),getDataOfEntry())  ;
	}
	
	
	
	
}
