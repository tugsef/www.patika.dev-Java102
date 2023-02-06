package shoppingStore.patikaStore.categories;

import java.util.LinkedList;
import java.util.List;

public class Category extends AbstractCotagories{
	
	private int id;
	private String name;
	
	private static List<Category> categoryList = new LinkedList<Category>();
	
	private static int count = 0;
	
	public Category(String name) {
		super();
		this.id = count+1;
		this.name = name;
		count++;
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public static List<Category> getCategoryList() {
		return categoryList;
	}



	public static void setCategoryList(List<Category> categoryList) {
		Category.categoryList = categoryList;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void showInfo() {
		
	}



	@Override
	public String toString() {
		String fmt = "%1$4s";
		return String.format(fmt, this.name);
	}
	
	
}
