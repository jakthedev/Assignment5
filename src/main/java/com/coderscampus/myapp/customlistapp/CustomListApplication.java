package com.coderscampus.myapp.customlistapp; 

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomArrayList<String> players = new CustomArrayList<String>(); 
		
		players.add("jak"); 
		players.add("jak2");
		players.add("jak3");
		players.add("jak4");
		players.add("jak5");
		players.add("jak6");
		players.add("jak7");
		players.add("jak8");
		players.add("jak9");
		players.add("jak10"); 
		players.add("jak11");  
		
		System.out.println(players.getSize());
		
		for (int i = 0; i < players.getSize(); i++) {
		System.out.println(players.get(i));
		}
		 

	}

}
