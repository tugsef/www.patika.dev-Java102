
public class Officer extends Employee{
	
	private String depertman;
	private String shift;
	
	public Officer(String name , String phoneNumber , String email , String depertman , String shift) {
		super(name,phoneNumber,email);
		this.depertman = depertman;
		this.shift = shift;
	}
	
	public String getDepertman() {
		return this.depertman;
	}
	
	public String getShify() {
		return this.shift;
	}
	
	public void setDepertman(String depertman) {
		this.depertman =depertman;
	}
	
	public void setShift(String shift) {
		this.shift = shift;
	}
	
	public void work() {
		System.out.println(this.getName() + " çalışıyor..");
	}
}
