package insuranceSystem.account.insurance;

import java.util.Scanner;

public class CarInsurance extends AbstractInsurance{
	Scanner scanner = new Scanner(System.in);
	
	
	
	
	public CarInsurance() {
		super();
	}

	public CarInsurance(String name, double price, String fistDate, String finishDate) {
		super(name, price, fistDate, finishDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		return 1000;
		
	}

	

	@Override
	public AbstractInsurance addInsurance(AbstractInsurance insurance) {
		
		System.out.println("    Yönetmelik ve mevzuata hakim olunmadığından verilen fiyatlar "+
							"   \nuygulama test kapsamında deneme amaçlı verilmiştir.");
		
		System.out.print("\n\n    Motor Hacmi : ");
		String volume = scanner.nextLine();
		
		
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
