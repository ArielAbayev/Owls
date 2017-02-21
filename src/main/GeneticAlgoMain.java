package main;

import java.util.ArrayList;

public class GeneticAlgoMain {

	private static int POPULATION_SIZE = 50;
	
	public static void main(String[] args) {
		
		Population pop = new Population(POPULATION_SIZE);
		ArrayList<Person> pesonList = new ArrayList<Person>();
		
		while(true) {
			pop.calcFitness();
			Population newPop = pop.generateNewPop();
			newPop.mutate();
			pop = newPop;
		}
		

	}

}
