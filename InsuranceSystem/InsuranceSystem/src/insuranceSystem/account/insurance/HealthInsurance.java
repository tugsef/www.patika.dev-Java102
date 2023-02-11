package insuranceSystem.account.insurance;

import java.util.Scanner;

public class HealthInsurance  extends AbstractInsurance{
 private static Scanner scanner = new Scanner(System.in);
	
	
	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HealthInsurance(AbstractInsurance insurance) {
		super();
		// TODO Auto-generated constructor stub
	}

	public HealthInsurance(String name, double price, String fistDate, String finishDate) {
		super(name, price, fistDate, finishDate);
		// TODO Auto-generated constructor stub
	}

	@Override
public	double calculate() {
		return 1500;
		
	}

	

	@Override
public	AbstractInsurance addInsurance(AbstractInsurance insurance) {
		
		System.out.println("    Yönetmelik ve mevzuata hakim olunmadığından verilen fiyatlar "+
				"   \nuygulama test kapsamında deneme amaçlı verilmiştir.");
		
		System.out.print("    Sağlık sorununuz var mı? (Evet/Hayır) ");
		String volume = scanner.nextLine();
		scanner.next();
		
		System.out.print("    Başlangıç Tarihi : ");
		String firstDate = scanner.nextLine();
		
		System.out.print("    Bitiş Tarihi : ");
		String finishDate = scanner.nextLine();
		
		insurance.setPrice(calculate());
		insurance.setFistDate(firstDate);
		insurance.setFinishDate(finishDate);
		

		System.out.println("    İşlem Bilgileri : ");
		String fmt3 = "%1$-35s %2$-20s %3$-20s %4$-20s%n";
		
		System.out.print(String.format(fmt3,"Sigorta Türü","Fiyat","Başlangıç","Bitiş") );
		System.out.print(String.format(fmt3, "------------","-----","---------","-----"));
		System.out.println(insurance.toString());
		return insurance;
	}

}
