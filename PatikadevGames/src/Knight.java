
public class Knight extends Character {

	public Knight(int id, int health, int damage, int money) {
		super(id, health, damage, money);
		
	}
	public Knight(int id, int health, int damage, int money,Armor  armor) {
		super(id, health, damage, money,armor);
		
	}
	@Override
	public String toString() {
		System.out.println("--------------------------");
		String message = "Knight\n"
				+ "--------------------------\n"
				+ "Sağlık : " + this.getHealth() 
				+ "\nHasar : "  + this.getDamage()
		        + "\nPara : " + this.getMoney();
		return message;
	}
}
