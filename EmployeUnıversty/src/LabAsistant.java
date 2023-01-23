
public class LabAsistant extends Asistant{
	
	public LabAsistant(String name , String phoneNumber , String email , String degree , String epsido , String officeClock) {
		super(name,phoneNumber,email,degree,epsido,officeClock);
	}
	
	public void labEnter() {
		System.out.println(this.getName() + " asistan lab dersinde..");
	}
}
