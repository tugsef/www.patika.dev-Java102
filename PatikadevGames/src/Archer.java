
public class Archer extends Character {

	public Archer(int id, int health, int damage, int money) {
		super(id, health, damage, money);
		
	}
	public Archer(int id, int health, int damage, int money , Armor armor) {
		super(id, health, damage, money,armor);
		
	}

	@Override
	public String toString() {
		String message = "Archer\n\n"
				+ "--------------------------\n"
				+ "Sağlık : " + this.getHealth() 
				+ "\nHasar : "  + this.getDamage()
		        + "\nPara : " + this.getMoney();
		return message;
	}

	
	

}
