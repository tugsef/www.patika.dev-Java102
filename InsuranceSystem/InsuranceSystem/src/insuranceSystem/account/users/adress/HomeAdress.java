package insuranceSystem.account.users.adress;

public class HomeAdress extends AdressManager{

	
	

	public HomeAdress(String adressName, String country, String city, String zipcod) {
		super(adressName, country, city, zipcod);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String fmt = "%1$-65s %2$-20s %3$-20s %4$-20s%n";
		return String.format(fmt,getAdressName(),getCountry(),getCity(),getZipcod())  ;
	}
	
	
	
}
