package main;

import java.util.ArrayList;

public class GeneticAlgoMain {

	private static int POPULATION_SIZE = 50;
	Object personsList[][];
	public int numOfPersons = 10;
	
	public static void main(String[] args) {
		
		Population pop = new Population(POPULATION_SIZE);
		
	//	createStaticTable();
		
		
		while(true) {
			pop.calcFitness();
			Population newPop = pop.generateNewPop();
			newPop.mutate();
			pop = newPop;
		}
		

	}

	/*public static void createStaticTable(){
		
		Object personsList[][] = { { 1, "Almog", 1, 0}, { 2, "Stav", 0, 1}, { 3, "Dan", 0, 1}
		, { 4, "Dor", 2, 1}, { 5, "Ran", 0, 1}, { 6, "Ariel", 0, 1}};
	}
	*/
	public void generatePersons(){
		
		ArrayList<Person> personsList = null;
		Person p;
		for(int i=0; i< numOfPersons; i++){
			p = new Person("Almog");
			personsList.add(p);
		//	p.addDemand();
		}
	}
	
	
	
}
