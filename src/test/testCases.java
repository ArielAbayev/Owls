package test;

import main.Duty;
import main.Individual;
import main.InsetsTable;
import main.Person;

public class testCases {
	public Person p =new Person("Ariel", 2);
	public Duty du = new Duty(p, 1, 4, 1);
	public InsetsTable insets = new InsetsTable();
	public Individual indi = new Individual(insets);
	
	public void run(){
		System.out.println(p);
	}
	
}
