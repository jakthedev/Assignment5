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
		players.add(2, "jak24");
		
		players.add("jak11");
		players.add("jak12"); 
		players.add("jak13");
		players.add("jak14");
		players.add("jak15");
		players.add("jak16");
		players.add("jak17");
		players.add("jak18");
		players.add("jak19");
		players.add("jak20");
		players.add("jak21"); 
		players.add("jak22");
		players.add("jak23");
		
		System.out.println(players.getSize());
		players.remove(5);
		System.out.println(players.getSize());
		players.add(2, "jak25");
		players.add(22, "jak24");
		
		for (int i = 0; i < players.getSize(); i++) {
		System.out.println(players.get(i));
		}
	}

}
