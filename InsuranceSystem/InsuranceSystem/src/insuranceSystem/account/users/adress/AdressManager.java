package insuranceSystem.account.users.adress;

import java.util.Scanner;

import insuranceSystem.account.AbstractAccount;



public abstract class AdressManager implements Addresses{
		
	private String adressName;
	private String country;
	private String city;
	private String zipcod;
	
	private static Scanner scanner = new Scanner(System.in);
	
	
	public AdressManager(String adressName, String country, String city, String zipcod) {
		super();
		this.adressName = adressName;
		this.country = country;
		this.city = city;
		this.zipcod = zipcod;
	}


	public static Addresses addAdress(){
		
		Addresses selectAdress = null;
			
			
			System.out.print("Adres Giriniz : ");
			String adressName = scanner.nextLine();
			
			System.out.print("Ülke Giriniz : ");
			String country = scanner.nextLine();
			
			System.out.print("İl Seçiniz");
			String city = scanner.nextLine();
			
			System.out.print("Postacodu : ");
			String zipcode = scanner.nextLine();
			
			System.out.println("Lütfen Türü");
			System.out.println("1.Ev Adresi");
			System.out.println("2.İş Adresi");
			
			
			int select = scanner.nextInt();
			
			if(select == 1) {
				String address = "Ev Adresi : " + adressName;
				 selectAdress = new HomeAdress(address, country, city, zipcode);
				return selectAdress;
	}
			if(select==2) {
				String adress = "İş Adresi : " + adressName;
				selectAdress = new BusinessAdress(adress, country, city, zipcode);
				return selectAdress;
			}
		
			
			return null;
	}
	
	
	public  static  void deleteAdress(AbstractAccount account) {
		String fmt1 = "%1$-65s %2$-20s %3$-20s %4$-20s%n";
		System.out.print(String.format(fmt1,"Adress","Ülke","İlçe","Posta Kodu"));  
		System.out.print(String.format(fmt1, "---------------","----","----","----------"));
		for (int j = 0; j <account.getUser().getAdresses().size(); j++) {
			System.out.println(j+1 + ". " +account.getUser().getAdresses().get(j));   

		
	
			
	}
		System.out.println("Silmek İstediğiniz Adresi Seçiniz....");
		int select = scanner.nextInt();
		
		System.out.println("Başarılı Silindi...");
		System.out.println(account.getUser().getAdresses().remove(select-1));
		
		
		
	}
	
	

	
	
	public String getAdressName() {
		return adressName;
	}
	public void setAdressName(String adressName) {
		this.adressName = adressName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcod() {
		return zipcod;
	}
	public void setZipcod(String zipcod) {
		this.zipcod = zipcod;
	}
	
		
}
