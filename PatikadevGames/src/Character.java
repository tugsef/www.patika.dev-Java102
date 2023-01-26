import java.util.Scanner;

abstract class Character implements IGame {
	
	private int id;
	private int health;
	private int damage;
	private int money;
	private Armor armor;
	
public Character(int id, int health, int damage, int money) {
		super();
		this.id = id;
		this.health = health;
		this.damage = damage;
		this.money = money;
	}


public Armor getArmor() {
	return armor;
}


public void setArmor(Armor armor) {
	this.armor = armor;
}


public Character(int id, int health, int damage, int money, Armor armor) {
	super();
	this.id = id;
	this.health = health;
	this.damage = damage;
	this.money = money;
	this.armor = armor;
}


public static void sleep(int time) {
	try {
		Thread.sleep(time);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

//	public  Character selectCharakter() {
//		Scanner input = new Scanner(System.in);
//		
//		String message = "Karakter Seçiniz : "
//				+ "\n1.Samurai"
//				+ "\n2.Archer"
//				+ "\nKnight";
//		System.out.println(message);
//		int select = input.nextInt();
//		if(select == 1) {
//			System.out.println("Samurayi Hazır Mısın...");
//			Character samurai = new Samurai();
//			return samurai;
//		} 
//		if(select == 2) {
//			System.out.println("Samurayi Hazır Mısın...");
//			Character archer = new Archer();
//			return archer;
//		} 
//		if(select == 3) {
//			System.out.println("Knight Hazır Mısın...");
//			Character knight = new Knight();
//			return knight;
//		} 
//			
//			return null;
//	}
	
	public  static void start() {
		System.out.println("-------------------------");
		System.out.println("Loading...");
		System.out.println("-------------------------");
		sleep(2000);
		
		Scanner input = new Scanner(System.in);
		System.out.println("-------------------------------------------");
		System.out.println("--------------------------");
			String message = "Karakter Seçiniz : \n"
					+ "--------------------------"
					+ "\n1.Samurai"
					+ "\n2.Archer"
					+ "\n3.Knight"
					+"\n4.Çıkış";
			System.out.println(message);
			
			
			System.out.println("-------------------------------------------");
		int select = input.nextInt();
		
		
		if(select == 1) {
			System.out.println("-------------------------------------------");
			System.out.println("Samurayi Hazır Mısın...");
			System.out.println("-------------------------------------------");
			Armor armor = new NullArmor(0, 0, 0);
			Character samurai = new Samurai(1, 21, 5, 15,armor);
			sleep(2000);
			
			System.out.println("-------------------------------------------");
			System.out.println(samurai);
			System.out.println("-------------------------------------------");
			
			sleep(2000);
			SafeHouse safeHouse = new SafeHouse();
			sleep(2000);
			Awards awards = new Awards(false, false, false,false);
			safeHouse.selectArea(samurai,awards);
			
		} 
		
		if(select == 2) {
			
			System.out.println("-------------------------------------------");
			System.out.println("Archer Hazır Mısın...");
			System.out.println("-------------------------------------------");
			
			Armor armor = new NullArmor(0, 0, 0);
			Character archer = new Archer(2,18,4,20,armor);
			sleep(2000);			
			
			System.out.println("-------------------------------------------");
			System.out.println(archer);
			System.out.println("-------------------------------------------");
			
			sleep(2000);
			SafeHouse safeHouse = new SafeHouse();
			sleep(2000);
			Awards awards = new Awards(false, false, false,false);
			safeHouse.selectArea(archer,awards);
			
		} 
		
		if(select == 3) {
			System.out.println("-------------------------------------------");
			System.out.println("Knight Hazır Mısın...");
			System.out.println("-------------------------------------------");
			
			Armor armor = new NullArmor(0, 0, 0);
			Character knight = new Knight(3,24,8,5,armor);
			sleep(2000);
			
			System.out.println("-------------------------------------------");
			System.out.println(knight);
			System.out.println("-------------------------------------------");
			
			System.out.println("-------------------------------------------");
			SafeHouse safeHouse = new SafeHouse();
			sleep(2000);
			Awards awards = new Awards(false, false, false,false);
			safeHouse.selectArea(knight,awards);
			
			
			
		} 
		if(select==4) {
			System.exit(0);
		}	
			
	}
		

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health < 0) {
			System.out.println("Sağlık Sıfırdan Küçük olamaz");
			this.health =0;
		} else {
			this.health = health;
		}
		
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		if(damage < 0) {
			System.out.println("Sıfırdan Küçük olamaz");
		} else {
			this.damage = damage;
		}
		
	}
	public int getMoney() {
		
		return money;
	}
	public void setMoney(int money) {
		if(money < 0) {
			System.out.println("Sıfırdan Küçük olamaz");
			this.money =0;
		} else {
			this.money = money;
		}
		
	}
	
	
	
	
	
	
}
