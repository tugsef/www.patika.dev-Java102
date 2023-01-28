import java.util.Scanner;

abstract class Weponary implements Equipment{
	private int id;
	
	private int damage;
	private int money;
	public Weponary() {}
	public Weponary(int id, int damage, int money) {
		super();
		this.id = id;
		
		this.damage = damage;
		this.money = money;
	}
	
	public static Character selectWeponary(Character character , Awards awards) {
	
		Scanner input = new Scanner(System.in);
		String message = "Silah Seçiniz : "+
						"\n1.Tabanca"+
						"\n2.Kılıç"+
						"\n3.Tüfek"+
						"\n4.Bir önceki menüye dön";
		System.out.println(message);
		int select = input.nextInt();
		
		if(select == 1 ) {
			Gun gun = new Gun(1, 2, 25);
			if(character.getMoney() < gun.getMoney() ) {
				System.out.println("Bu ürünü almanız için paranız yetersiz...");
				selectWeponary(character,awards);
			}else if (character.getMoney() > gun.getMoney() ) {
				character.setDamage(character.getDamage()+gun.getDamage());
				character.setMoney(character.getMoney()-gun.getMoney());
				System.out.println("------------------------------------");
				System.out.println(character);
				System.out.println("------------------------------------");
				selectWeponary(character,awards);
				return character;
				
			} 
			
		}
		if(select == 2) {
			Sword sword = new Sword(2, 3, 35);
			if(character.getMoney() < sword.getMoney()) {
				System.out.println("Kılıç almak için paranız yetersiz...");
				selectWeponary(character,awards);
			} else {
				character.setDamage(character.getDamage()+sword.getDamage());
				character.setMoney(character.getMoney()-sword.getMoney());
				System.out.println("------------------------------------");
				System.out.println(character);
				System.out.println("------------------------------------");
				selectWeponary(character,awards);
			}
			
		}
		if(select == 3) {
			Riffle riffle = new Riffle(3, 7, 45);
			if(character.getMoney() < riffle.getMoney()) {
				System.out.println("Tüfek almanız için paranız yatersiz...");
				selectWeponary(character,awards);
			}else {
				character.setDamage(character.getDamage()+riffle.getDamage());
				character.setMoney(character.getMoney()-riffle.getMoney());
				System.out.println("------------------------------------");
				System.out.println(character);
				System.out.println("------------------------------------");
				selectWeponary(character,awards);
				return character;
			}
		}
		if(select == 4) {
			System.out.println("Savaş Alanı Menüsüne Dönüyorsunuz...");
			SafeHouse.selectArea(character,awards);
		}
		return null;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
		
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
