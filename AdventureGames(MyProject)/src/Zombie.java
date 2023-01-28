
public class Zombie extends Monsters{

	public Zombie(int id, int damage, int health, int money) {
		super(id, damage, health, money);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String message = "Zombie\n\n"
				+ "Sağlık : " + this.getHealth() ;
		return message;
	}

}
