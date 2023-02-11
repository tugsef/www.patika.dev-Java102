package insuranceSystem.account;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import insuranceSystem.account.insurance.AbstractInsurance;
import insuranceSystem.account.insurance.CarInsurance;
import insuranceSystem.account.insurance.HealthInsurance;
import insuranceSystem.account.insurance.Insurances;
import insuranceSystem.account.insurance.ResidenceInsurance;
import insuranceSystem.account.insurance.TravelInsurance;
import insuranceSystem.account.users.Users;
import insuranceSystem.account.users.adress.Addresses;
import insuranceSystem.account.users.adress.AdressManager;

public abstract class AbstractAccount implements Account {
	
	private int id;
	private AuthenticantionStattus log ;
	private Users user;
	private ArrayList<Insurances> insurances;
	
	private static int count = 0;
	
	Scanner scanner = new Scanner(System.in);
	


	public AbstractAccount() {
		
		this.log = AuthenticantionStattus.Fail;
		this.id = count+1;
		count++;
	
		
		
		
	}
	

	public AbstractAccount(Users user, ArrayList<Insurances> insurances) {
		super();
		this.id = count+1;
		this.log = AuthenticantionStattus.SUCCESS;
		this.user = user;
		this.insurances = insurances;
		count++;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AuthenticantionStattus getLog() {
		return log;
	}

	public void setLog(AuthenticantionStattus log) {
		this.log = log;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public ArrayList<Insurances> getInsurances() {
		return insurances;
	}

	public void setInsurances(ArrayList<Insurances> insurances) {
		this.insurances = insurances;
	}

	@Override
	public int hashCode() {
		return Objects.hash(count, id, insurances, log, user);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractAccount other = (AbstractAccount) obj;
		return count == other.count && id == other.id && Objects.equals(insurances, other.insurances)
				&& log == other.log && Objects.equals(user, other.user);
	}


	public final void showInfo() {
		System.out.println("            ************************************ Hesap Bilgileri ************************************");
		System.out.println("\n   Aktiflik Durumu : " + getLog());
		
		System.out.println("\n   Müşteri Hesap No : " + this.id + "\n\n");
		
		System.out.println("  -----Müşteri Bilgileri-----\n");
		String fmt = "%1$-20s %2$-20s %3$-45s %4$-20s %5$-20s%n";
		System.out.print(String.format(fmt,"Adı","Soyadı","Email Adresi","Meslek","Sisteme Son Giriş Tarihi") ); 
		System.out.print(String.format(fmt, "---","------","----- ------","------","------------------------"));
		
		System.out.println(this.user.toString());
		
		String fmt1 = "%1$-65s %2$-20s %3$-20s %4$-20s%n";
		System.out.println("\n   -----Adres Bilgileri-----\n");
		
		System.out.print(String.format(fmt1,"Adress","Ülke","İlçe","Posta Kodu"));  
		System.out.print(String.format(fmt1, "---------------","----","----","----------"));
		
		
		for (Addresses addresses2 : this.user.getAdresses()) {
			System.out.println(addresses2.toString());
		}
		
		System.out.println("\n   ------ Sigortalar-------\n");
		String fmt3 = "%1$-35s %2$-20s %3$-20s %4$-20s%n";
		System.out.print(String.format(fmt3,"Sigorta Türü","Fiyat","Başlangıç","Bitiş") );
		System.out.print(String.format(fmt3, "------------","-----","---------","-----"));
		
      for (Insurances insurances2 : this.insurances) {
			
			System.out.println(insurances2.toString());
			
		}
		
      System.out.println("            ************************************ Hesap Bilgileri ************************************");
		
	}
	
	public void menu(AbstractAccount account) {
		System.out.println("\n\n*********************************************************\n");
		String message = "   Yapmak İstediğiniz İşlemi Seçiniz\n"
					   + "   _________________________________\n"
					   +"\n   1.Genel Durum"
					   +"\n   2.Adres Ekle  "
					   +"\n   3.Adres Sil"
					   +"\n   4.Poliçe Ekle"
					  
					   +"\n   5.Çıkış yap";
		System.out.println(message);
		System.out.println("\n\n*********************************************************\n");
		int select = scanner.nextInt();
		
		
		switch (select) {
		case 1:
			account.showInfo();
			menu(account);
			break;
		case 2 :
			Addresses newAddresses = AdressManager.addAdress();
			account.getUser().getAdresses().add(newAddresses);
			menu(account);
				
			
			break;
		case 3 :
			AdressManager.deleteAdress(account);
			menu(account);
			break;
		case 4 :
			AbstractInsurance insurance = null;
			
		String message1 = "   Yapmak İstedğiniz Poliçeyi Seçiniz "
						+"   \n   __________________________________\n"
						+"    \n   1.Araba Sigortası "
						+"    \n   2.Ev Sigortası"
						+"    \n   3.Sağlık Sigortası "
						+"	  \n   4.Seyahat Sigortası	";
		System.out.println(message1);
		int select1 = scanner.nextInt();
		
			if(select1==1) {
				insurance = new CarInsurance();
				insurance.setName("Araba Sigortası");
			    insurance=insurance.addInsurance(insurance);
				account.getInsurances().add(insurance);
				menu(account);
			}
			
			if(select1==2) {
				insurance = new ResidenceInsurance();
				insurance.setName("Ev Sigortası");
				insurance.addInsurance(insurance);
				account.getInsurances().add(insurance);
				menu(account);
			}
			
			if(select1==3) {
				insurance = new HealthInsurance();
				insurance.setName("Sağlık Sigortası");
				insurance.addInsurance(insurance);
				account.getInsurances().add(insurance);
				menu(account);
			}
			
			if(select1==4) {
				insurance = new TravelInsurance();
				insurance.setName("Seyahat Sigortası : ");
				insurance.addInsurance(insurance);
				account.getInsurances().add(insurance);
				menu(account);
			}
			break;
		case 5 :
			System.out.println("Program Sonlandırılıyor...");
			System.exit(0);
			break;
		default:
			break;
		}
		
		
		
	}
	

	
}
