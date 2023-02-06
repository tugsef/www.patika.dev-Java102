package shoppingStore.patikaStore;

import shoppingStore.ShoppingStore;

public interface PatikaStore extends ShoppingStore{

	void add();
	void delete(int x);
	void showInfo();
	
}
