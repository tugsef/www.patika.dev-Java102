
public class Lecturer extends Academicion {
	
	private String lessons;
	
	public Lecturer(String name , String phoneNumber , String email , String degree , String epsido , String lessons) {
		super(name,phoneNumber,email,degree,epsido);
		this.lessons = lessons;
	}
	
	public String getLessons() {
		return this.lessons;
	}
	
	public void setLessons(String lessons) {
		this.lessons = lessons;
	}
	
	public void meeting() {
		System.out.println(getDegree() + " " +  getName() + " toplantıya katıldı...");
	}
	
	public void testExam() {
		System.out.println(getName() + " sınavı başlattı..");
	}
}
