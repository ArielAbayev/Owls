package main;

public class Individual {

	private static double MUTATION_RATE = 0.01;
	
	private InsetsTable insetsTable_individual ;
	
	private int fitness;
	
	public Individual() {
		
		insetsTable_individual = new InsetsTable();
		
	}
	
	public void calcFitness() {
		// TODO Auto-generated method stub
		
	}

	public void mutate() {
		
		for (int i = 0; i < insetsTable_individual.tableLength ; i++) {
			for(Duty duty : this.insetsTable_individual.insetsTable[i]) {
				
				if(Math.random() < MUTATION_RATE) {
			//		duty.name = chooseRandomName();
				}
				
			}
		}
		
	}

}
