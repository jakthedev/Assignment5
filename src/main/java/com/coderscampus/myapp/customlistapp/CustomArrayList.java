package com.coderscampus.myapp.customlistapp; 

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	// When I add more than 1-
	Object[] items = new Object[10];
	private int currentSize = 0;
// this will be excatly number in list 
	// becuase arrays are index base dont need loop thur to add, can add to the end of the list 
	@Override
	public boolean add(T item) {

		while (i <= items.length) {

			if (i >= items.length) {

				Object[] newItemsArray = Arrays.copyOf(items, items.length*2); //new Object[2 * items.length];
				int half = (newItemsArray.length / 2) - 1;
				// dont need to use loop 
				for (int j = 0; j < items.length; j++) {
					
					// whats in items need to be in new array
					if (newItemsArray != null) {
						
						// which means something is there
						newItemsArray[j] = items[j];
					}
					if (j == half) {
						j++;
						newItemsArray[j] = item;
//						items[j]  = Arrays.copyOf(newItemsArray, 20);
						items[j]  = Arrays.
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
