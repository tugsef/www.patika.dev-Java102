package insuranceSystem.account.insurance;

import java.util.Scanner;

public class TravelInsurance extends AbstractInsurance{
private Scanner  scanner = new Scanner(System.in);
	
	public TravelInsurance() {
		super();
	}
	
	public TravelInsurance(String name, double price, String fistDate, String finishDate) {
		super(name, price, fistDate, finishDate);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public double calculate() {
		return 150;
		
	}

	

	@Override
	public AbstractInsurance addInsurance(AbstractInsurance insurance) {
		System.out.println("    Yönetmelik ve mevzuata hakim olunmadığından verilen fiyatlar "+
				"   \nuygulama test kapsamında deneme amaçlı verilmiştir.");
		
		System.out.println("    Seyahat edilecek yer mesafesi ");
		String volume = scanner.nextLine();
		scanner.next();
		
		System.out.println("    Başlangıç Tarihi : ");
		String firstDate = scanner.nextLine();
		
		System.out.println("    Bitiş Tarihi : ");
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
