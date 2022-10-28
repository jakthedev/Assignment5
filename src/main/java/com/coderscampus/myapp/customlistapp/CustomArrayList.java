package com.coderscampus.myapp.customlistapp; 

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	// When I add more than 1-
	Object[] items = new Object[10];
	private int currentSize = 0; 
	
// this will be excatly number in list 
	// becuase arrays are index base dont need loop thur to add, can add to the end of the list
	
	@Override
	public boolean add(T item) {

		while (currentSize <= items.length) {
			
			for(int j = 0; j < items.length; j++)
			{
			    if(items[j] == null)
			    {
			    	items[j] = item;
			    	currentSize++;
			        return true;
			    }
			}

			if (currentSize >= items.length) {

				Object[] newItemsArray = Arrays.copyOf(items, items.length*2); 
				int half = (newItemsArray.length / 2) - 1;
				System.arraycopy(newItemsArray, half, items, items.length, newItemsArray.length); 
				
				for(int i = 0; i < newItemsArray.length; i++)
				{
				    if(newItemsArray[i] == null)
				    {
				    	newItemsArray[i] = items;
				        break;
				    }
				}
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
