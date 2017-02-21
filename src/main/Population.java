package main;

public class Population {
	
	private Individual[] individuals;
	
	public Population(int size) {
		individuals = new Individual[size];
	}
	
	public void calcFitness() {
		for(Individual ind : individuals) {
			ind.calcFitness();
		}
	}
	
	public Population generateNewPop() {
		
		return null;
	}
	
	public void mutate() {
		for(Individual ind : individuals) {
			ind.mutate();
		}
	}

}
