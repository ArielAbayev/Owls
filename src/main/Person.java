package main;

public class Person {
	
	private String name;
	static int ID = 0;
	private int personID =0;
	private int absentOnDay;
	private int dutiesLastMonth = 0;
	
	public Person(String name,int dutiesLastMonth){
		
		this.setName(name);
		this.dutiesLastMonth = dutiesLastMonth;
		absentOnDay = 0;
		ID ++;
		personID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getPersonID() {
		return personID;
	}
	public void setPersonID(int iD) {
		personID = iD;
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
