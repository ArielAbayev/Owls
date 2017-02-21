package main;

public class Individual implements Comparable<Individual>{

	private static double MUTATION_RATE = 0.01;
	
	private InsetsTable insetsTable_individual ;
	
	private int fitness;
	
	public Individual(InsetsTable insetsTable) {
		
		insetsTable_individual = insetsTable;
		
	}
	
	public void calcFitness() {
		
		
	}

	public void mutate() {
		
		for (int i = 0; i < insetsTable_individual.tableLength ; i++) {
			for(Duty duty : this.insetsTable_individual.insetsTable.get(i)) {
				
				if(Math.random() < MUTATION_RATE) {
			//		duty.name = chooseRandomName();
				}
				
			}
		}
		
	}
	
	public InsetsTable getInsetsTable() {
		return insetsTable_individual;
	}

	public int getFitness() {
		return fitness;
	}
	
	@Override
	public int compareTo(Individual other) {
		return this.fitness - other.fitness;
	}

}
