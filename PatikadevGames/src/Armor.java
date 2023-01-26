import java.util.Scanner;

abstract class Armor implements Equipment {
	private int id;
	private int blackDamage;
	private int money;
	private Character character;
	
	public Armor(int id , int blackDamage , int money) {
		this.id=id;
		this.blackDamage = blackDamage;
		this.money = money;
		
	}
	
	
	
	public static Character selectArmor(Character character , Awards awards) {
		Scanner input = new Scanner(System.in);
		String message = "Zırh Seçiniz : "+
						"---------------"+
						"\n1.Hafih Seviye"+
						"\n2.Orta Seviye"+
						"\n3.Yüksek Seviye"+
						"\n4.Bir önceki menüye dön";
		System.out.println(message);
		int select = input.nextInt();
		
		if(select == 1 ) {
			
			if(character instanceof Samurai) {
				
				System.out.println("---------------------------------------");
				System.out.println("Düşük Seviye Kalkan eklendi samurai....");
				System.out.println("---------------------------------------");
				
				Armor weak = new Weak(1, 1, 15);
				Character character2 = new Samurai(character.getId(),character.getHealth(),character.getDamage(),character.getMoney(),weak);
				SafeHouse.selectArea(character2,awards);
				return character2;
			}
			
			if(character instanceof Knight) {
				Armor weak = new Weak(1, 1, 15);
				Character character2 = new Knight(character.getId(),character.getHealth(),character.getDamage(),character.getMoney(),weak);
				SafeHouse.selectArea(character2,awards);
				return character2;
			}
			 
			if (character instanceof Archer) {
				Armor weak = new Weak(1, 1, 15);
				Character character2 = new Archer(character.getId(),character.getHealth(),character.getDamage(),character.getMoney(),weak);
				SafeHouse.selectArea(character2,awards);
				return character2;
			}
			
			
		}
		if(select == 2) {
				if(character instanceof Samurai) {
				
				System.out.println("---------------------------------------");
				System.out.println("Orta Seviye Kalkan eklendi samurai....");
				System.out.println("---------------------------------------");
				
				Armor weak = new Weak(2, 3, 25);
				Character character2 = new Samurai(character.getId(),character.getHealth(),character.getDamage(),character.getMoney(),weak);
				SafeHouse.selectArea(character2,awards);
				return character2;
			}
			
			if(character instanceof Knight) {
				Armor weak = new Weak(2, 3, 25);
				Character character2 = new Knight(character.getId(),character.getHealth(),character.getDamage(),character.getMoney(),weak);
				SafeHouse.selectArea(character2,awards);
				return character2;
			}
			 
			if (character instanceof Archer) {
				Armor weak = new Weak(2, 3, 25);
				Character character2 = new Archer(character.getId(),character.getHealth(),character.getDamage(),character.getMoney(),weak);
				SafeHouse.selectArea(character2,awards);
				return character2;
			}
			
		}
		if(select == 3) {
				if(character instanceof Samurai) {
				
				System.out.println("---------------------------------------");
				System.out.println("Yüksek Seviye Kalkan eklendi samurai....");
				System.out.println("---------------------------------------");
				
				Armor weak = new Weak(3, 5, 40);
				Character character2 = new Samurai(character.getId(),character.getHealth(),character.getDamage(),character.getMoney(),weak);
				SafeHouse.selectArea(character2,awards);
				return character2;
			}
			
			if(character instanceof Knight) {
				Armor weak = new Weak(3, 5, 40);
				Character character2 = new Knight(character.getId(),character.getHealth(),character.getDamage(),character.getMoney(),weak);
				SafeHouse.selectArea(character2,awards);
				return character2;
			}
			 
			if (character instanceof Archer) {
				Armor weak = new Weak(3, 5, 40);
				Character character2 = new Archer(character.getId(),character.getHealth(),character.getDamage(),character.getMoney(),weak);
				SafeHouse.selectArea(character2,awards);
				return character2;
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


	public int getBlackDamage() {
		return blackDamage;
	}


	public void setBlackDamage(int blackDamage) {
		this.blackDamage = blackDamage;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
}
