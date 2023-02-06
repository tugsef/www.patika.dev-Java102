package shoppingStore;

import java.util.List;
import java.util.Scanner;

import shoppingStore.patikaStore.brands.Brand;
import shoppingStore.patikaStore.categories.Category;
import shoppingStore.patikaStore.inventory.Inventory;
import shoppingStore.patikaStore.products.MobilePhone;
import shoppingStore.patikaStore.products.Notebook;

public class DisplayScreen implements ShoppingStore	 {

private  static Scanner scanner = new Scanner(System.in);

private List<Brand> brandList = Brand.getBrandList();
private List<Inventory> inventoryList = Inventory.getInventory();
private List<Notebook> notbooklist = Notebook.getNotebookList();
private Inventory inventory = new Inventory();
private Brand brand = new Brand();
private List<MobilePhone> mPhoneList = MobilePhone.getMobilePhoneList();
	public DisplayScreen() {
		
		Brand brand = new Brand("Samsung");
		Brand brand2 = new Brand("Lenovo");
		Brand brand3 = new Brand("Apple");
		Brand brand4 = new Brand("Huawei");
		Brand brand5 = new Brand("Casper");
		Brand brand6 = new Brand("Asus");
		Brand brand7 = new Brand("HP");
		Brand brand8 = new Brand("Xiaomi");
		Brand brand9 = new Brand("Monster");
		
		Category notebookCategory = new Category("Notebook");
		Category phoneBatary = new Category("Cep Telefonu");
		
		
		
		
		
		
		Brand.getBrandList().add(brand);
		Brand.getBrandList().add(brand2);
		Brand.getBrandList().add(brand3);
		Brand.getBrandList().add(brand4);
		Brand.getBrandList().add(brand5);
		Brand.getBrandList().add(brand6);
		Brand.getBrandList().add(brand7);
		Brand.getBrandList().add(brand8);
		Brand.getBrandList().add(brand9);
		
		Category.getCategoryList().add(new Category("Notebook"));
		Category.getCategoryList().add(new Category("Cep Tefonu"));
		
		MobilePhone mPhone = new MobilePhone("Galaxy S22 Ultra", brand, 33498, 12, 20,  "256 GB", "Super AMOLED","4000-4500 mAh", "12 MP","Bordo");
		MobilePhone mPhone2 = new MobilePhone("Iphone Se 3.nesil",brand3,2099,2,10,"256 GB","4.5-5 in","1000-2000 mAh","5-10 MP","Siyah");
		
		Notebook notebook = new Notebook("X543ma-gq1015", brand6, 4099, 15, 16, "64 GB", "HD+", "4000-4500 mAh", "4 GB", "Beyaz");
		Notebook notebook2 = new Notebook("Matebook I3", brand4, 17499,12, 52, "256 GB", "6.5-7 in", "5000-6000 mAh", "8 GB", "Mavi");
		
		notbooklist.add(notebook);
		notbooklist.add(notebook2);
		
		
		
		mPhoneList.add(mPhone);
		mPhoneList.add(mPhone2);
		inventoryList.add(new Inventory(notebookCategory, notebook));
		inventoryList.add(new Inventory(notebookCategory,notebook2));
		inventoryList.add(new Inventory(phoneBatary, mPhone));
		inventoryList.add(new Inventory(phoneBatary, mPhone2));
		
		
		
	}
	public void mobilePhonetransactions() {
		
		boolean login = true;
		MobilePhone mPhone = new MobilePhone();
		
		
		
		String message = "************* Cep Telefonu İşlemleri *************\n\n"
					
					   +"1 - Ürün Görüntüle\n"
					   +"2 - Ürün Ekle\n"
					   +"3 - Ürün Sil\n"
					   +"4 - Ana Menü\n\n"
					   + "************* Cep Telefonu İşlemleri *************\n\n";
		
		while(login) {
			System.out.println(message);
			
			int select = scanner.nextInt();
			scanner.nextLine();
			
			switch (select) {
			case 1:
				
				mPhone.showInfo();
				break;
			case 2:
				 mPhone.add();
				break;	
			case 3:
				System.out.println("Silmek İstediğiniz Ürünün Id : ");
				int id = scanner.nextInt();
				mPhone.delete(id);
				break;
			case 4 :
				start();
				break;
			default:
				System.out.println("Hatalı Giriş Yaptınız ...");
				break;
			}
		}	
			
		
		
		
	}
	public void notebooktransactions() {
		boolean login = true;
		Notebook notebook = new Notebook();
		
		
		
		String message = "************* Notebook İşlemleri *************\n\n"
					
					   +"1 - Ürün Görüntüle\n"
					   +"2 - Ürün Ekle\n"
					   +"3 - Ürün Sil\n"
					   +"4 - Ana Menü\n\n"
					   + "************* Notebook İşlemleri *************\n\n";
		
		while(login) {
			System.out.println(message);
			
			int select = scanner.nextInt();
			scanner.nextLine();
			
			switch (select) {
			case 1:
				
				notebook.showInfo();
				break;
			case 2:
				 notebook.add();
				break;	
			case 3:
				System.out.println("Silmek İstediğiniz Ürünün Id : ");
				int id = scanner.nextInt();
				notebook.delete(id);
				break;
			case 4 :
				start();
				break;
			default:
				System.out.println("Hatalı Giriş Yaptınız ...");
				break;
			}
			
			
			
			
		}
		
		
		
		
		
	}
	public void search(){
		Brand search = null;
		System.out.println("Aranacak İd ");
		int id = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i <Brand.getBrandList().size(); i++) {
			
			System.out.println(Brand.getBrandList().get(i).getId() + " - " + Brand.getBrandList().get(i).getName());
		}
		System.out.print("Aranacak Marka : ");
		int brandselect = scanner.nextInt();
		
		for (Brand brand : brandList) {
			if(brand.getId() == brandselect) {
				search = brand;
				break;
			}
		}
		
		
		System.out.println("---------------------------Arama Sonuçları\n\n");
		String fmt = "%1$4s %2$17s %3$4s %4$20s %5$13s %6$13s %7$13s %8$13s %9$13s %10$13s %11$18s %12$13s %13$13s%n";
		System.out.println(String.format(fmt,"StoreId","Kategori","İd","Ürün Adı","Marka","Fiyat","İndirim","Stok Miktarı","Hafıza","Ekran","Batarya","RAM/Kamera","Renk"));
		System.out.println(String.format(fmt,"-------", "--------","--","--------","-----","-----","-------","------------","------","-----","-------","----------","----"));	
		
		for (Inventory inventory : inventoryList) {
			if(inventory.getId()==id) {
				System.out.println(inventory);
				break;
			}
		}
		
		
		for ( MobilePhone nPhone : mPhoneList) {
			if(nPhone.getBrand().equals(search)) {
				for (Inventory inventory : inventoryList) {
					if(inventory.getProduct().equals(nPhone)) {
						System.out.println(inventory);
						break;
					}
				}
				
				
			}
			
		}
		
		for ( Notebook notebook : notbooklist) {
			if(notebook.getBrand().equals(search)) {
				for (Inventory inventory : inventoryList) {
					if(inventory.getProduct().equals(notebook)) {
						System.out.println(inventory);
						break;
					}
				}
				
				
			}
			
			
			
		}
		

		System.out.println(String.format(fmt, "-------", "--------","--","--------","-----","-----","-------","------------","------","-----","-------","----------","----"));
		System.out.println("\n---------------------------Arama Sonuçlarıi\n");
		
		
	}
	
	public void start() {
		
		
		 boolean login = true;
		
		 String message = "********** Patika Ürün Yönetim Paneli **********\n\n"
				 		+"          <><><><> İşlem Seçiniz<><><><>\n\n"
				 
				 		+ "             1 - Bütün Ürünleri Göster\n"
				 		+ "             2 - Notebook İşlemleri\n"
				 		+ "             3 - Cep Telefonu\n"
		 				+ "             4 - Marka Listele\n"
				 		+ "				5 - Arama Yap\n "
				 		+ "             0 - Çıkış Yap\n\n"
		 				+ "********** Patika Ürün Yönetim Paneli ***********\n\n";
		 				
		 
		 
		 while(login) {
			 
			 System.out.println(message);
			 
			 
			 int select = scanner.nextInt();
			 scanner.nextLine();
			 
			 
			switch (select) {
			case 1:
				
				inventory.showInfo();
				
				break;

			case 2 :
				notebooktransactions();
				
				
				break;
			case 3 :
				
				mobilePhonetransactions();
				
				break;
			case 4 :
				
				brand.showInfo();
				
				break;
			case 5 :
				search();
				break;
			case 0 :
				System.out.println("Uygulamadan Çıkılıyor....");
				login = false;
				break;
			default:
					System.out.println("Hatalı Giriş ...");
					break;
			}
			
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		 }
		
		
		
		
	}
	
	
	
	
	
	
}
