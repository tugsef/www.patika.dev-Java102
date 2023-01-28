
public class Vampire extends Monsters {

	public Vampire(int id, int damage, int health, int money) {
		super(id, damage, health, money);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String message = "Vampire\n\n"
				+ "Sağlık : " + this.getHealth() ;
		return message;
	}
	

}
