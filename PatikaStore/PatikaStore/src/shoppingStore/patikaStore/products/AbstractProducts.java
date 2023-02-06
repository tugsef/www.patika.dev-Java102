package shoppingStore.patikaStore.products;

import shoppingStore.patikaStore.brands.Brands;

abstract class AbstractProducts implements Products {
	
	
	private String name;
	private Brands brand;
	private double price;
	private int discountRate;
	private int amount;
	
	
	
	
	
	public AbstractProducts() {
		super();
	}

	public AbstractProducts(String name, Brands brand, double price, int discountRate, int amount) {
		super();
		
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.discountRate = discountRate;
		this.amount = amount;
	}

	@Override
	public void add() {
		
	}

	@Override
	public void delete(int x) {
		
		
	}

	@Override
	public void showInfo() {
		
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Brands getBrand() {
		return brand;
	}

	public void setBrand(Brands brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
