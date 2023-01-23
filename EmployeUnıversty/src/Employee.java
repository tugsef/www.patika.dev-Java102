
public class Employee {
	
	private String name;
	private String phoneNumber;
	private String email;
	
	public Employee(String name, String phoneNumber , String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber =phoneNumber;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void enter() {
		System.out.println(getName() + " universiteye giriş yaptı.");
	}
	
	public void exit() {
		System.out.println(getName() + " Universiteden çıkış yaptı.");
	}
	
	public void dinningHall() {
		System.out.println(getName() + " Yemekhaneye giriş yaptı.");
	}
	
	
	
	
}
