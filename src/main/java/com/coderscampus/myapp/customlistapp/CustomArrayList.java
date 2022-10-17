package com.coderscampus.myapp.customlistapp;

public class CustomArrayList<T> implements CustomList<T> { 
	// When I add more than 1-
	Object[] items = new Object[10];

	@Override
	public boolean add(T item) { 
		for (int i = 0; i < items.length; i++) {
		if (i == items.length - 1) {
			Object[] newItemsArray = new Object[2*items.length];
			newItemsArray = (Object[]) item; 
			return true;
		}else {
			items = (Object[]) item; 
			return true;
		}
		}
		return false;
	}

	@Override
	public int getSize() { 
		int totalItems = 0;
		if (items.length == 0) {
			return 0;
		} else {
		for (int i = 0; i < items.length; i++) {
			totalItems = (Integer) items[i]; 
			return totalItems;
	}
		}
		return totalItems;
		}

	@Override
	public T get(int index) {
		String userChoice;
		for (int i = 0; i < items.length; i++) { 
			for (Object item : items) {
			
			if (i == index) {
				userChoice = item.toString();
				return (T) userChoice;
			}
			}
		}
		return null; 
	}
	
}
