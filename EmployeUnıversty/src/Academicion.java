
public class Academicion extends Employee{
	
	private String degree;
	private String epsido;
	
	public Academicion(String name , String phoneName , String email , String degree , String epsido) {
		super(name,phoneName,email);
		this.degree = degree;
		this.epsido = epsido;
	}
	
	public String getDegree() {
		return this.degree;
	}
	
	public String getEpsido() {
		return this.epsido;
	}
	
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public void setEpsido(String epsido) {
		this.epsido = epsido;
	}
	
	public void lessonsEnter() {
		System.out.println(this.getName() + " Derse giriş yaptı");
	}
	
}
