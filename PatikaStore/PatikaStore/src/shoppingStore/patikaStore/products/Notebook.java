package shoppingStore.patikaStore.products;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import shoppingStore.patikaStore.PatikaStore;
import shoppingStore.patikaStore.brands.Brand;
import shoppingStore.patikaStore.brands.Brands;
import shoppingStore.patikaStore.categories.Category;
import shoppingStore.patikaStore.inventory.Inventory;

public class Notebook extends AbstractProducts{
	
	private int id;
	private String memory;
	private String screenSize;
	private String batteyPower;
	private String ram;
	private String color;
	
	private static List<Notebook> notebookList = new LinkedList<>();
	
	private static int count = 0;
	
	private Scanner scanner = new Scanner(System.in);
	
	public Notebook() {
		super();
	}



	public Notebook(String name, Brands brand, double price, int discountRate, int amount, String memory,
			String screenSize, String batteyPower, String ram, String color) {
		super(name, brand, price, discountRate, amount);
		this.id = count+1;
		this.memory = memory;
		this.screenSize = screenSize;
		this.batteyPower = batteyPower;
		this.ram = ram;
		this.color = color;
		count++;
	}

	

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getBatteyPower() {
		return batteyPower;
	}

	public void setBatteyPower(String batteyPower) {
		this.batteyPower = batteyPower;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}



	public static List<Notebook> getNotebookList() {
		return notebookList;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public static void setNotebookList(List<Notebook> notebookList) {
		Notebook.notebookList = notebookList;
	}

	





	@Override
	public void delete(int id) {
		for (Notebook notebook : notebookList) {
			if(notebook.getId() == id) {
				System.out.println("Silindi : " + notebook);
				notebookList.remove(notebook);
			}
		}
	}



	@Override
	public void add() {
		Brand brand = null; 
		
		System.out.print("Ürünün Adı : ");
		String name = scanner.nextLine();
		System.out.print("---------------------------------------\n");
		
		
		for (int i = 0; i <Brand.getBrandList().size(); i++) {
			
			System.out.println(Brand.getBrandList().get(i).getId() + " - " + Brand.getBrandList().get(i).getName());
		}
		
		System.out.print("\nMarkanızı Seçiniz : ");
		int brandselect  = scanner.nextInt();
		scanner.nextLine();
		
		
		
		for (int i = 0; i <Brand.getBrandList().size(); i++) {
			if(Brand.getBrandList().get(i).getId() == brandselect) {
				brand = Brand.getBrandList().get(i);
			}
		}
		System.out.println("---------------------------------------");
		
		System.out.print("Fiyat : ");
		double price = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("---------------------------------------");
		
		System.out.print("İndirim Oranı : ");
		int discountRate = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("---------------------------------------");
		
		System.out.print("Stok Miktarı : ");
		int amount = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("---------------------------------------");
		
		/*private String memory;
		private String screenSize;
		private String batteyPower;
		private String ram;
		private String color;*/
		
		System.out.print("Hafıza Kapasitesi : ");
		String memory = scanner.nextLine();
		
		System.out.println("---------------------------------------");
		
		System.out.print("Ekran Boyutu : ");
		String screenSize = scanner.nextLine();
		
		System.out.println("---------------------------------------");
		
		System.out.print("Batarya Kapasitesi : ");
		String battery = scanner.nextLine();
		
		System.out.println("---------------------------------------");
		
		System.out.print("Ram : ");
		String ram = scanner.nextLine();
		
		System.out.println("---------------------------------------");
		
		System.out.print("Color : ");
		String color = scanner.nextLine();
		
		Notebook notebook2 = new Notebook(name, brand, price, discountRate, amount, memory, screenSize, battery, ram, color);
		
	    notebookList.add(notebook2);
	    Inventory.getInventory().add(new Inventory(Category.getCategoryList().get(0),notebook2));
		
		
	}



	@Override
	public void showInfo() {
		List<Notebook> p = Notebook.getNotebookList();
		
		System.out.println("---------------------NOTEBOOK LİSTESİ\n\n");
		String fmt = "%1$4s %2$20s %3$13s %4$13s %5$13s %6$13s %7$13s %8$13s %9$18s %10$13s %11$13s%n";
		System.out.println(String.format(fmt,"İd","Ürün Adı","Marka","Fiyat","İndirim","Stok Miktarı","Hafıza","Ekran","Batarya","RAM","Renk"));
		System.out.println(String.format(fmt, "--","--------","-----","-----","-------","------------","------","-----","-------","---","----"));
		
		for (PatikaStore patikaStore : p) {
			System.out.println(patikaStore);
		}
		
		System.out.println(String.format(fmt, "--","--------","-----","-----","-------","------------","------","-----","-------","---","----"));
		System.out.println("\n---------------------NOTEBOOK LİSTESİ\n\n");
	}



	@Override
	public String toString() {
		
		String fmt = "%1$4s %2$20s %3$13s %4$13s %5$13s %6$13s %7$13s %8$13s %9$18s %10$13s %11$13s%n";
		return String.format(fmt, String.valueOf(this.getId()),this.getName(),this.getBrand().toString(),
							String.valueOf(this.getPrice()),String.valueOf(this.getDiscountRate()),
							String.valueOf(this.getAmount()),this.memory,this.screenSize,this.batteyPower,this.ram,this.color)  ;
	}
	
	
	
	
	
}
