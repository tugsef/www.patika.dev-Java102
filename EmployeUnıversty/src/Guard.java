
public class Guard extends Officer{
	
	private String document;
	
	public Guard(String name , String phoneNumber , String email , String depertman , String shift , String document) {
		super(name,phoneNumber,email,depertman,shift);
		this.document = document;
	}
	
	public String getDocument() {
		return this.document;
	}
	
	public void setDocument(String document) {
		this.document = document;
	}
	
	public void guartyDuty() {
		System.out.println(this.getName() + " " + this.getDocument() 
		+ " Nöbetin yaklaşıyor");
	}

}
