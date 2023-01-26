

public class Samurai extends Character {
	
	public Samurai(int id, int health, int damage, int money) {
		super(id, health, damage, money);
		
		
	}
	
	public Samurai(int id, int health, int damage, int money , Armor armor) {
		super(id, health, damage, money,armor);
		
		
	}
	
	
	
	
	@Override
	public String toString() {
		System.out.println("--------------------------");
		String message = "Samurai\n"
				+ "--------------------------\n"
				+ "Sağlık : " + this.getHealth() 
				+ "\nHasar : "  + this.getDamage()
		        + "\nPara : " + this.getMoney();
		return message;
	}
	
	
	
}
