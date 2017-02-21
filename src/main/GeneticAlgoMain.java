package main;


public class main {

	private static int POPULATION_SIZE = 10;
	
	
	public static void main(String[] args) {
		
		
		Population pop = new Population(POPULATION_SIZE);
		
		while(true) {
			pop.calcFitness();
			
			Population newPop = pop.generateNewPop();
			
			newPop.mutate();
			
			pop = newPop;
		}
		

	}

}
