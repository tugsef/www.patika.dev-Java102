
public class Computing extends Officer {
	
	private String mission;
	
	public Computing(String name , String phoneNumber , String email , String depertman , String shift , String mission) {
		super(name,phoneNumber,email,depertman,shift);
		this.mission = mission;
	}
	
	public String getMission() {
		return this.mission;
	}
	
	public void setMission(String mission) {
		this.mission = mission;
	}
	
	public void networkSetup() {
		System.out.println(this.getName() + " kişi tarafından gerçekleştirildi...");
	}

	@Override
	public String toString() {
		
		return "İsim : " + this.getName() + "\nTelefon Numarası : " + this.getPhoneNumber() + "\nMail Adresi : " + this.getEmail() + "\nDepertman : " + this.getDepertman() + "\nMesai başlangıç-bitiş :  " + this.getShify() + "\nGörevi : " + getMission() + "\n"; 
	}
	
	
}	
