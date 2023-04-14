package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.coderscampus.myapp.customlistapp.CustomArrayList;
import com.coderscampus.myapp.customlistapp.CustomList;

public class CustomArrayListTest {
	
	// Test-Driven Development Methodology 
	// Step 1 - Writing a failing test  
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
	
//	@Test 
//	void should_return_array_size() {
//		//Arrange 
//		CustomList<Integer> sut = new CustomArrayList<>();
//		//Act 
//		for(int i = 0; i < 10; i++) {
//			sut.add(i);
//			}
//		//Assert
//		assertEquals(11, sut.getSize());
//	}
	
	@Test 
	void should_add_11_items_to_list() {
		
		CustomList<Integer> sut = new CustomArrayList<>(); 
		
		for(int i = 0; i < 11; i++) {
		sut.add(i);
		}
		
//		for(int i = 0; i < 10; i++) {
//		
//			int expectedResults = sut.get(i);
//			assertEquals(i+1, expectedResults);
//		}
		
		assertEquals(11, sut.getSize());
		
		
	}
	
	@Test 
	void should_remove_item_from_list() {
		
		CustomList<Integer> sut = new CustomArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			sut.add(i);
			System.out.println(i);
			}
		
		sut.remove(1);
		
//		for(int i = 0; i < sut.getSize(); i++) {
//			
//			System.out.println(i);
//			}
		
		assertEquals(10, sut.getSize());
	}

	

}

















