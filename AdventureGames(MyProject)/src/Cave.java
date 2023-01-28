
import java.util.Random;

public class Cave extends Dangerious{
	private Object lock = new Object();
	public static Monsters[] creatZombie() {
		Random random = new Random();
		Monsters zombie = new Zombie(1, 3, 10, 4);
		Monsters zombie1 = new Zombie(1, 3, 10, 4);
		Monsters zombie2 = new Zombie(1, 3, 10, 4);
		
		
		
		
		int sayi = random.nextInt(3);
		if(sayi==0) {
			Monsters[] monsters = new Zombie[1];
			monsters[0] = zombie;
			return monsters;
		}
		if(sayi==1) {
			Monsters[] monsters2 = new Zombie[2];
			monsters2[0] = zombie;
			monsters2[1] = zombie1;
			return monsters2;
		}
		if(sayi==2) {
			Monsters[] monsters3 = new Zombie[3];
			monsters3[0] = zombie;
			monsters3[1] = zombie1;
			monsters3[2] = zombie2;
			return monsters3;
		}
		
		
		return null;
	}
	
	
	
	public void war(Character character, Monsters[] monsters , Awards awards) {
		Random random = new Random();
		boolean go = true;
		int array = monsters.length;
		int count =0;
		
		
		
		synchronized (lock) {
			
		
		
		while(count!=array) {
			for (Monsters monsters2 : monsters) {
			
				
			
				System.out.println("-------------------------");
				System.out.println("Karşılaşılan Zombi Sayısı : " + array);
				System.out.println("Savaşan Vampir İd : " + (count+1));
				System.out.println("-------------------------");
				Character.sleep(2000);
				
				System.out.println("-------------------------");
				System.out.println("Karakter Vuruyorr...");
				System.out.println("-------------------------");
				monsters2.setHealth(monsters2.getHealth()-character.getDamage());
				System.out.println("Vampirin kalan canı..." + monsters2.getHealth());
				
				go = true;
	
				while(go) {
					int select = random.nextInt(2);
					
					if(select==0) {
						
						System.out.println("-------------------------");
						System.out.println("Karakter Vuruyorr...");
						System.out.println("-------------------------");
						
						monsters2.setHealth(monsters2.getHealth()-character.getDamage());
						
						System.out.println("-------------------------");
						System.out.println("Zombi kalan canı..." + monsters2.getHealth());
						System.out.println("-------------------------");
						
						if(monsters2.getHealth()<=0) {
							System.out.println("-------------------------");
							System.out.println("Zombi Öldü");
							System.out.println("-------------------------");
							character.setMoney(character.getMoney()+monsters2.getMoney());
							go = false;
						}
						
						
						
					}
					else if(select == 1) {
						System.out.println("-------------------------");
						System.out.println("Zombi Vuruyorr...");
						System.out.println("-------------------------");
						
						character.setHealth(character.getHealth()-(monsters2.getDamage()-character.getArmor().getBlackDamage()));
						
						System.out.println("-------------------------");
						System.out.println("Karekterin sağlık durumu : " + character.getHealth());
						System.out.println("-------------------------");
						
						if(character.getHealth() <= 0) {
							System.out.println("-------------------------");
							System.out.println("Karakter Öldü");
							System.out.println("-------------------------");
							SafeHouse.selectAgain(character);
							
						}
						
						
						
						
					}
					
					
					
					
				}
					
//				}
				
				
				
				count++;
			}
			
		}
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("Güncel Karakter Durumunuz ");
		System.out.println("-------------------------------");
		System.out.println(character);
		System.out.println("-------------------------------------------------------");
		
		Character.sleep(3000);
		
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Tebrikler Mağara Bölümünü Başarı ile Bitirdiniz....");
		System.out.println("Ödül : Yemek");
		awards.setFood(true);
		System.out.println("-------------------------------------------------------");
		
		
		
		if(awards.isFireFood() == true && awards.isFood() == true && awards.isWater() == true && awards.isMain()==true) {
			System.out.println("-------------------------------------------------------");
			System.out.println("Tebrikler Oyunu Başarı ile Tanımladınız....");
			System.out.println("-------------------------------------------------------");
			System.out.println("Oyun Bitti Başarılar....");
			System.exit(0);
		}
		
		SafeHouse.selectArea(character, awards);
		
		
	
	}

		
	}


