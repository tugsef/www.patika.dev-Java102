package shoppingStore.patikaStore.brands;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Brand extends AbstractBrands implements Comparable<Brand>{
	
	private int id;
	private String name;
	
	private static List<Brand> brandList = new LinkedList<>();
	
	private static int count = 0;
	
	public Brand(String name) {
		super();
		
		this.id = count+1;
		this.name = name;
		count++;
		
		
	}

	public Brand() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static List<Brand> getBrandList() {
		return brandList;
	}

	public static void setBrandList(List<Brand> brandList) {
		Brand.brandList = brandList;
	}

	@Override
	public String toString() {
		return this.getName();
	}

	@Override
	public int compareTo(Brand o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}

	@Override
	public void showInfo() {
		Collections.sort(brandList);
		System.out.println("------------- Markalar\n");
		
		for (Brand brand : brandList) {
			System.out.println(" - " + brand.getName());
		}
		System.out.println("\n------------- Markalar\n\n");
	}

	
	
	
}
