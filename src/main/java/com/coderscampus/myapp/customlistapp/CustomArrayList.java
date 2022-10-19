package com.coderscampus.myapp.customlistapp; 

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	// When I add more than 1-
	Object[] items = new Object[10];
	private int i = 0;

	@Override
	public boolean add(T item) {

		while (i <= items.length) {

			if (i >= items.length) {

				Object[] newItemsArray = new Object[2 * items.length];
				int half = (newItemsArray.length / 2) - 1;
				
				for (int j = 0; j < items.length; j++) {
					
					// whats in items need to be in new array
					if (newItemsArray != null) {
						
						// which means something is there
						newItemsArray[j] = items[j];
					}
					if (j == half) {
						j++;
						newItemsArray[j] = item;
						items[j]  = Arrays.copyOf(newItemsArray, 20);
					}
				}
				return true;
			} else {
				if (items[i] == null) {
					items[i] = item;
					this.i = i + 1;
				}
				return true;
			}
		}
		return true;
	}

	@Override
	public int getSize() {
		int elementCounter = 0;
		int i = 0;

		while (i < items.length) {
			if (items[i] != null) {
				elementCounter++;
				i++;
			}
		}
		return elementCounter;
	}

	@Override
	public T get(int index) {
		T foundItem;
		for (int i = 0; i < items.length; i++) {

			if (i == index) {
				foundItem = (T) items[i];
				return foundItem;
			}
		}
		return null;
	}

}
