package main;

import java.util.ArrayList;

public class Person {
	
	private String name;
	static int ID = 0;
	private int absentOnDay;
	private int dutiesLastMonth = 0;
	
	public Person(String name,int dutiesLastMonth){
		
		this.setName(name);
		this.dutiesLastMonth = dutiesLastMonth;
		ID ++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static int getID() {
		return ID;
	}
	public static void setID(int iD) {
		ID = iD;
	}

	public int getAbsentOnDay() {
		return absentOnDay;
	}
	
	public int getDutiesLastMonth() {
		return dutiesLastMonth;
	}
	
	public void setAbsentOnDay(int absentOnDay) {
		this.absentOnDay = absentOnDay;
	}
	
	public void setDutiesLastMonth(int dutiesLastMonth) {
		this.dutiesLastMonth = dutiesLastMonth;
	}

}
