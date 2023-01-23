
public class Asistant extends Academicion{
	
	private String officeClock;
	
	public Asistant(String name , String phoneNumber , String email , String degree , String epsido , String officeClock){
		super(name,phoneNumber,email,degree,epsido);
		this.officeClock = officeClock;
	}
	
	public String getOfficeClock() {
		return this.officeClock;
	}
	
	public void setOfficeClock(String officeClock) {
		this.officeClock = officeClock;
	}
	
	public void quizTest() {
		System.out.println(this.getName() + " quizi başlattı");
	}
	
	
}
