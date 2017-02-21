package main;

import java.util.ArrayList;

public class Person {
	
	private String name;
	static int ID = 0;
	ArrayList<Duty> demands;
	
	public Person(String name){
		
		this.setName(name);
		ID ++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public void addDemand(Duty duty) {
		demands.add(duty);

	}

}
