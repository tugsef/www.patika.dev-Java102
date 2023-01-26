import java.util.Random;



public class Forest extends Dangerious {

	public static Monsters[] creatVampire() {
		Random random = new Random();
		Monsters vampire = new Vampire(2, 4, 14, 4);
		Monsters vampire2 = new Vampire(2, 4, 14, 4);
		Monsters vampire3 = new Vampire(2, 4, 14, 4);
		
		
		
		
		int sayi = random.nextInt(3);
		
		if(sayi==0) {
			Monsters[] monsters = new Vampire[1];
			monsters[0] = vampire;
			return monsters;
		}
		if(sayi==1) {
			Monsters[] monsters2 = new Vampire[2];
			monsters2[0] = vampire;
			monsters2[1] = vampire2;
			return monsters2;
		}
		if(sayi==2) {
			Monsters[] monsters3 = new Vampire[3];
			monsters3[0] = vampire;
			monsters3[1] = vampire2;
			monsters3[2] = vampire3;
			return monsters3;
		}
		
		
		return null;
	}
	
	
	
	
	
	
	
	
	@Override
	public void war(Character character, Monsters[] monsters , Awards awards) {
		Random random = new Random();
		boolean go = true;
		int array = monsters.length;
		int count =0;
		
		while(count!=array) {
			for (Monsters monsters2 : monsters) {
			
				
			
				System.out.println("-------------------------");
				System.out.println("Karşılaşılan Vampir Sayısı : " + array);
				System.out.println("Savaşan Vampir İd : " + (count+1));
				System.out.println("-------------------------");
				Character.sleep(2000);
				
				System.out.println("-------------------------");
				System.out.println("Samuray Vuruyorr...");
				System.out.println("-------------------------");
				monsters2.setHealth(monsters2.getHealth()-character.getDamage());
				System.out.println("Vampirin kalan canı..." + monsters2.getHealth());
				
				go = true;
	//			synchronized (lock) {
				while(go) {
					int select = random.nextInt(2);
					
					if(select==0) {
						
						System.out.println("-------------------------");
						System.out.println("Samuray Vuruyorr...");
						System.out.println("-------------------------");
						
						monsters2.setHealth(monsters2.getHealth()-character.getDamage());
						
						System.out.println("-------------------------");
						System.out.println("Vampirin kalan canı..." + monsters2.getHealth());
						System.out.println("-------------------------");
						
						if(monsters2.getHealth()<=0) {
							System.out.println("-------------------------");
							System.out.println("Vampir Öldü");
							System.out.println("-------------------------");
							character.setMoney(character.getMoney()+monsters2.getMoney());
							go = false;
						}
						
						
						
					}
					else if(select == 1) {
						System.out.println("-------------------------");
						System.out.println("Vampir Vuruyorr...");
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
		System.out.println("Tebrikler Orman Bölümünü Başarı ile Bitirdiniz....");
		System.out.println("Ödül : Odun");
		awards.setFireFood(true);
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

