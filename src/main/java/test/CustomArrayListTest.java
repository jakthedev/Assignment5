package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.coderscampus.myapp.customlistapp.CustomArrayList;
import com.coderscampus.myapp.customlistapp.CustomList;

public class CustomArrayListTest {
	
	// Test-Driven Development Methodology 
	// Step 1 - Writing a failing test  
	//fersfrververve
	// Step 2 - Write the business logic to make the test pass 
	// Step 3 - Refactor code 
	
	@Test
	void should_add_one_item_to_list() {
		
		CustomList<Integer> sut = new CustomArrayList<>(); 
		
		sut.add(10);  
		int expectedResults = sut.get(0);
		int expectedSize = sut.getSize(); 
		
		assertEquals(10, expectedResults);
		assertEquals(1, expectedSize);
		
	}
	
	@Test 
	void should_add_11_items_to_list() {
		
		CustomList<Integer> sut = new CustomArrayList<>(); 
		
		for(int i = 0; i < 11; i++) {
		sut.add(i);
		}
		
		assertEquals(11, sut.getSize());
	}
	
	@Test 
	void should_remove_item_from_list() {
		
		CustomList<Integer> sut = new CustomArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			sut.add(i);
			//System.out.println(i);
			}
		
		sut.remove(1);
		sut.remove(2);
		sut.remove(3);
		sut.remove(4);
		sut.remove(5);
		sut.remove(1);
		sut.remove(2);
		sut.remove(3);
		sut.remove(4);
		
		for(int i = 0; i < sut.getSize(); i++) {
			
			System.out.println(i);
			}
		
		assertEquals(3, sut.getSize());
	}
	
	@Test 
	void should_add_item_to_list_at() {
		
		CustomList<Integer> sut = new CustomArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			sut.add(i);
			//System.out.println(i);
			}
		
		sut.add(4, 90);
		sut.add(5, 100);
		sut.add(6, 110);
		sut.add(7, 120);
		sut.add(8, 130);
		sut.add(9, 140);
		sut.add(10, 150); 
		sut.add(11, 160); 
		sut.add(12, 170); 
		sut.add(13, 180); 
		sut.add(14, 190);
		sut.add(15, 200);
		
		for(int i = 0; i < sut.getSize(); i++) {
			System.out.println(i);
			}
		
		assertEquals(16, sut.getSize());
	

}
}

















