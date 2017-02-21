package main;

import java.util.HashMap;
import java.util.Map;

public class Duty {

	private Person person;
	private int dutyStart;
	private int dutyEnd;
	private int dutyType;
	
	public Duty(Person person, int dutyStart, int dutyEnd, int dutyType) {
		this.person = null;
		setDutyEnd(dutyEnd);
		setDutyStart(dutyStart);
		setDutyType(dutyType);
	}
	
	public void setDutyEnd(int dutyEnd) {
		this.dutyEnd = dutyEnd;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public void setDutyStart(int dutyStart) {
		this.dutyStart = dutyStart;
	}
	
	public int getDutyEnd() {
		return dutyEnd;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public int getDutyStart() {
		return dutyStart;
	}
	
	public void setDutyType(int dutyType) {
		this.dutyType = dutyType;
	}
	
	public int getDutyType() {
		return dutyType;
	}

	
}
