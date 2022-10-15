package com.coderscampus.myapp.customlistapp;

public class CustomArrayList<T> implements CustomList<T> { 
	// When I add more than 1-
	Object[] items = new Object[10];

	@Override
	public boolean add(T item) {
		if (T.equals(T)) {
			
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
			totalItems = (int) items[i]; 
			return totalItems;
	}
		}
		return totalItems;
		}

	@Override
	public T get(int index) {
		for (int i = 0; i < items.length; i++) {
			if (i == index) {
				return T;
			}
		}
		return null; 
	} 
}
