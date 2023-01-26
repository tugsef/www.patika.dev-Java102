
public class Snake extends Monsters {

	public Snake(int id, int damage, int health, int money) {
		super(id, damage, health, money);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String message = "Snake\n\n"
				+ "Sağlık : " + this.getHealth() ;
		return message;
	}
	
	

}
