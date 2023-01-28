import java.util.Scanner;

public class SafeHouse extends Safe{
	
	
	public SafeHouse() {
		System.out.println("-------------------------------------------");
		System.out.println("Güvenli Bölgeye Hoşgeldiniz...");
		System.out.println("-------------------------------------------");
	}
	public static void selectAgain(Character character) {
		System.out.println("-------------------------------------------");
		String message = "Oyunu Kaybettiniz..\n" 
				        +"-------------------------------------------\n"
						+ "1.Başten Başlamak için \n"
				        + "2.Güvenli Eve Dönüş Canın Yenilenmesi :"
						+ "\n3.Çıkış";	
		System.out.println("-------------------------------------------");
		System.out.println(message);
		Scanner input = new Scanner(System.in);
		
		
		int select= input.nextInt();
		if(select == 1 ) {
			Character.start();
		}
		if(select == 2) {
			if (character instanceof Samurai) {
				Character samurai = new Samurai(1, 21, 5, 15);
				System.out.println(samurai);
				Awards awards = new Awards(false, false, false,false);
				selectArea(samurai,awards);
			}
			if (character instanceof Archer) {
				Character archer = new Archer(2,18,4,20);
				System.out.println(archer);
				Awards awards = new Awards(false, false, false,false);
				selectArea(archer,awards);
			}
			if (character instanceof Knight) {
				Character knight = new Knight(3,24,8,5);
				System.out.println(knight);
				Awards awards = new Awards(false, false, false,false);
				selectArea(knight,awards);
			}
			
		}
		if(select == 3) {
			System.out.println("Oyundan Çıkılıyor.......");
			System.exit(0);
		}
	}
	public static void selectArea(Character character , Awards awards) {
		Scanner input = new Scanner(System.in);
		System.out.println("-------------------------");
		String message = "Lütfen Savaş Alanı Seçiniz...\n"+
							"-------------------------"+
							"\n1.Mağara"+
							"\n2.Orman" + 
							"\n3.Nehir"+
							"\n4.Maden"+
							"\n5.Mağaza"+							
							"\n6.Çıkış";
		System.out.println(message);
		System.out.println("-------------------------------------------");
		int select = input.nextInt();
		
		if(select == 1) {
			
			if(awards.isFood()==true) {
				System.out.println("Mağrayı Başarılı Bir Şekilde Geçtiniz Tekrara Oynayamazsınız...");
				selectArea(character, awards);
			}else  {
				Dangerious cave = new Cave();
				Monsters[] monsters = Cave.creatZombie();
				cave.war(character, monsters,awards);
			}
			
			
		}
		if(select == 2) {
			if(awards.isFireFood()==true) {
				System.out.println("Orman Başarılı bir şekilde geçtin tekrar oynayamazsın");
				selectArea(character, awards);
			} else {
				Dangerious forest = new Forest();
				Monsters[] monsters = Forest.creatVampire();
				forest.war(character, monsters, awards);
			}
			
		}
		if(select == 3) {
			if(awards.isWater()==true) {
				System.out.println("Orman Başarılı bir şekilde geçtin tekrar oynayamazsın");
				selectArea(character, awards);
			} else {
				Dangerious river = new River();
				Monsters[] monsters = River.createBear();
				river.war(character, monsters, awards);
			}
		}
		if(select == 5) {
			String message1 = "Teçhizat Seçin :"+
						"\n---------------"+
					"\n1.Silah"+
					"\n2.Zırh" ;
			
			System.out.println("------------------------------");
			System.out.println(message1);
			System.out.println("------------------------------");
			
			int selectt = input.nextInt();
			if (selectt == 1) {
				Weponary.selectWeponary(character,awards);
			}
			if(selectt==2) {
				Armor.selectArmor(character, awards);
			}
					
		}
		
		if(select ==4 ) {
			if(awards.isFireFood()==true) {
				System.out.println("Madeni Başarılı bir şekilde geçtin tekrar oynayamazsın");
				selectArea(character, awards);
			} else {
				Dangerious mine = new Mine();
				Monsters[] monsters = Mine.creatSnake();
				mine.war(character, monsters, awards);
			}
			
		}
	}

}
