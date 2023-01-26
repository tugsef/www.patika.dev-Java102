import java.util.Random;

public class River extends Dangerious{

	public static Monsters[] createBear() {
		Random random = new Random();
		Monsters bear = new Bear(3, 7, 20, 12);
		Monsters bear2 = new Bear(3, 7, 20, 12);
		Monsters bear3 = new Bear(3, 7, 20, 12);
		
		
		
		
		int sayi = random.nextInt(3);
		if(sayi==0) {
			Monsters[] monsters = new Bear[1];
			monsters[0] = bear;
			return monsters;
		}
		if(sayi==1) {
			Monsters[] monsters2 = new Bear[2];
			monsters2[0] = bear;
			monsters2[1] = bear2;
			return monsters2;
		}
		if(sayi==2) {
			Monsters[] monsters3 = new Bear[3];
			monsters3[0] = bear;
			monsters3[1] = bear2;
			monsters3[2] = bear3;
			return monsters3;
		}
		
		
		return null;
	}
	@Override
	public void war(Character character, Monsters[] monsters,Awards awards) {
		Random random = new Random();
		boolean go = true;
		int array = monsters.length;
		int count =0;
		
		while(count!=array) {
			for (Monsters monsters2 : monsters) {
			
				
			
				System.out.println("-------------------------");
				System.out.println("Karşılaşılan Ayı Sayısı : " + array);
				System.out.println("Savaşan Vampir İd : " + (count+1));
				System.out.println("-------------------------");
				Character.sleep(2000);
				
				System.out.println("-------------------------");
				System.out.println("Karakter Vuruyorr...");
				System.out.println("-------------------------");
				monsters2.setHealth(monsters2.getHealth()-character.getDamage());
				System.out.println("Karakter kalan can :." + monsters2.getHealth());
				
				go = true;
	
				while(go) {
					int select = random.nextInt(2);
					
					if(select==0) {
						
						System.out.println("-------------------------");
						System.out.println("Karakter Vuruyorr...");
						System.out.println("-------------------------");
						
						monsters2.setHealth(monsters2.getHealth()-character.getDamage());
						
						System.out.println("-------------------------");
						System.out.println("Karakter kalan canı : " + monsters2.getHealth());
						System.out.println("-------------------------");
						
						if(monsters2.getHealth()<=0) {
							System.out.println("-------------------------");
							System.out.println("Karakter Öldü");
							System.out.println("-------------------------");
							character.setMoney(character.getMoney()+monsters2.getMoney());
							go = false;
						}
						
						
						
					}
					else if(select == 1) {
						System.out.println("-------------------------");
						System.out.println("Ayı Vuruyorr...");
						System.out.println("-------------------------");
						
						character.setHealth(character.getHealth()-monsters2.getDamage());
						
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
		System.out.println("-------------------------------------------------------");
		System.out.println("Güncel Karakter Durumunuz .....");
		System.out.println("-------------------------------");
		System.out.println(character);
		System.out.println("-------------------------------------------------------");
		
		Character.sleep(3000);
		
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Tebrikler Nehir Bölümünü Başarı ile Bitirdiniz....");
		System.out.println("Ödül : Su");
		awards.setWater(true);
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




