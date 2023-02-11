package insuranceSystem.account.insurance;

public abstract class AbstractInsurance implements Insurances {
	
	private String name;
	private double price;
	private String fistDate;
	private String finishDate;
	
	public abstract double calculate();
	public abstract AbstractInsurance addInsurance(AbstractInsurance insurance);

	public AbstractInsurance() {
		super();
	}
	public AbstractInsurance(String name, double price, String fistDate, String finishDate) {
		super();
		this.name = name;
		this.price = price;
		this.fistDate = fistDate;
		this.finishDate = finishDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFistDate() {
		return fistDate;
	}

	public void setFistDate(String fistDate) {
		this.fistDate = fistDate;
	}

	public String getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(String finishDate) {
		this.finishDate = finishDate;
	}
	@Override
	public String toString() {
		String fmt = "%1$-35s %2$-20s %3$-20s %4$-20s%n";
		return String.format(fmt,getName(),getPrice(),getFistDate(),getFinishDate())  ;
	}

	
	
	
	
	
}
