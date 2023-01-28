import java.util.Random;

public class Mine  extends Dangerious {

	
	
	public static Monsters[] creatSnake() {
		Random random = new Random();
		int number = random.nextInt(3,7);
		
			
				
				
				
		Monsters snake = new Snake(4, number, 10, 4);
		Monsters snake2 = new Snake(4, number, 10, 4);
		Monsters snake3 = new Snake(4, number, 10, 4);
		Monsters snake4 = new Snake(4, number, 10, 4);
		Monsters snake5 = new Snake(4, number, 10, 4);
		
		
		
		
		
		
		int sayi = random.nextInt(5);
		if(sayi==0) {
			Monsters[] monsters = new Snake[1];
			monsters[0] = snake;
			return monsters;
		}
		if(sayi==1) {
			Monsters[] monsters2 = new Snake[2];
			monsters2[0] = snake;
			monsters2[1] = snake2;
			return monsters2;
		}
		if(sayi==2) {
			Monsters[] monsters3 = new Snake[3];
			monsters3[0] = snake;
			monsters3[1] = snake2;
			monsters3[2] = snake3;
			return monsters3;
		}
		if(sayi==3) {
			Monsters[] monsters3 = new Snake[4];
			monsters3[0] = snake;
			monsters3[1] = snake2;
			monsters3[2] = snake3;
			monsters3[3] = snake4;
			return monsters3;
		}
		if(sayi==4) {
			Monsters[] monsters3 = new Snake[5];
			monsters3[0] = snake;
			monsters3[1] = snake2;
			monsters3[2] = snake3;
			monsters3[3] = snake4;
			monsters3[4] = snake5;
			return monsters3;
		}
		
		
		
		return null;
	}
	
	@Override
	public void war(Character character, Monsters[] monsters, Awards awards) {
		
		Random random = new Random();
		boolean go = true;
		int array = monsters.length;
		int count =0;
		
		
		
		
		
		while(count!=array) {
			for (Monsters monsters2 : monsters) {
			
				
			
				System.out.println("-------------------------");
				System.out.println("Karşılaşılan Yılan Sayısı : " + array);
				System.out.println("Savaşan Yılan İd : " + (count+1));
				System.out.println("-------------------------");
				Character.sleep(2000);
				
				System.out.println("-------------------------");
				System.out.println("Karakter Vuruyorr...");
				System.out.println("-------------------------");
				monsters2.setHealth(monsters2.getHealth()-character.getDamage());
				System.out.println("Yılan kalan canı..." + monsters2.getHealth());
				
				go = true;
	
				while(go) {
					int select = random.nextInt(2);
					
					if(select==0) {
						
						System.out.println("-------------------------");
						System.out.println("Karakter Vuruyorr...");
						System.out.println("-------------------------");
						
						monsters2.setHealth(monsters2.getHealth()-character.getDamage());
						
						System.out.println("-------------------------");
						System.out.println("Yılan kalan canı..." + monsters2.getHealth());
						System.out.println("-------------------------");
						
						if(monsters2.getHealth()<=0) {
							System.out.println("-------------------------");
							System.out.println("Yılan Öldü");
							System.out.println("-------------------------");
							
							int priza = random.nextInt(2);
							if(priza == 0) {
								System.out.println("--------------------------");
								System.out.println("Ölen Yılandan Kazancınız yok");
								System.out.println("--------------------------");
							}
							if(priza == 1) {
								int rnk = random.nextInt(5);
								if(rnk ==0) {
									System.out.println("---------------------------------");
									System.out.println("Tebrikler Silah Kazandınız....");
									System.out.println("---------------------------------");
									
									Gun gun = new Gun(1, 2, 25);
									character.setDamage(character.getDamage()+gun.getDamage());
									System.out.println("------------------------------------");
									System.out.println(character);
									System.out.println("------------------------------------");
								}else if(rnk==1) {
									System.out.println("---------------------------------");
									System.out.println("Tebrikler Tüfek Kazandınız....");
									System.out.println("---------------------------------");
									
									Riffle riffle = new Riffle(3, 7, 45);
									
									character.setDamage(character.getDamage()+riffle.getDamage());
									
									System.out.println("------------------------------------");
									System.out.println(character);
									System.out.println("------------------------------------");
									
								} else if(rnk==2) {
									System.out.println("---------------------------------");
									System.out.println("Tebrikler Kılıç Kazandınız....");
									System.out.println("---------------------------------");
									
									Sword sword = new Sword(2, 3, 35);
									
									character.setDamage(character.getDamage()+sword.getDamage());
									
									System.out.println("------------------------------------");
									System.out.println(character);
									System.out.println("------------------------------------");
									
								
								
								
							}
								else if(rnk==3) {
									System.out.println("Zırh Kazandınız Zırhınızı seçiniz..");
									Armor.selectArmor(character, awards);
									
									
								
								
								
							}else if(rnk==4) {
								int rant = random.nextInt(3);
								if(rant==0) {
									System.out.println("---------------------------------");
									System.out.println("Tebrikler 10 para Kazandınız....");
									System.out.println("---------------------------------");
									
									character.setMoney(character.getMoney()+10);
								}
								else if(rant==1) {
									System.out.println("---------------------------------");
									System.out.println("Tebrikler 5 para Kazandınız....");
									System.out.println("---------------------------------");
									
									character.setMoney(character.getMoney()+5);
								}
								else if(rant==2) {
									System.out.println("---------------------------------");
									System.out.println("Tebrikler 1 para Kazandınız....");
									System.out.println("---------------------------------");
									
									character.setMoney(character.getMoney()+10);
								}
								
								
							
							
							
						}
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
				
				
				
				
			}
				count++;
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("Güncel Karakter Durumunuz ");
		System.out.println("-------------------------------");
		System.out.println(character);
		System.out.println("-------------------------------------------------------");
		
		Character.sleep(3000);
		
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Tebrikler Maden Bölümünü Başarı ile Bitirdiniz....");
		awards.setFood(true);
		System.out.println("-------------------------------------------------------");
		
		
		
		if(awards.isFireFood() == true && awards.isFood()==true && awards.isWater()==true&&awards.isMain()==true) {
			System.out.println("-------------------------------------------------------");
			System.out.println("Tebrikler Oyunu Başarı ile Tanımladınız....");
			System.out.println("-------------------------------------------------------");
			System.out.println("Oyun Bitti Başarılar....");
			System.exit(0);
		}
		
		SafeHouse.selectArea(character, awards);
		
		
	
	}
	

}}
