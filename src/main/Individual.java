package main;

public class Individual {

	private static double MUTATION_RATE = 0.01;
	
	private InsetsTable InsetsTable ;
	
	private int fitness;
	
	public Individual() {
		
		InsetsTable = new InsetsTable();
		
	}
	
	public void calcFitness() {
		// TODO Auto-generated method stub
		
	}

	public void mutate() {
		
		for (int i = 0; i < this.InsetsTable.length(); i++) {
			for(Duty duty : this.InsetsTable.day(i)) {
				
				if(Math.random() < MUTATION_RATE) {
					duty.name = chooseRandomName();
				}
				
			}
		}
		
	}

}
