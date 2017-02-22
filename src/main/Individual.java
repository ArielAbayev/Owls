package main;

import java.util.ArrayList;

public class Individual{

	public static double MUTATION_RATE = 0.01;
	
	public InsetsTable insetsTable_individual ;
	
	public double fitness = 0;
	
	public Individual(InsetsTable insetsTable) {
		
		insetsTable_individual = insetsTable;
		
	}

	
	public void calcFitness(ArrayList<Person> personsList) {

		int personsCounters[] = new int[10]; // change to numOfPersons
		
		for(Person p : personsList){
			personsCounters[p.getPersonID()] = p.getDutiesLastMonth();
		}
		
		for (int i = 0; i < InsetsTable.tableLength ; i++) {
			for(Duty duty : this.insetsTable_individual.insetsTable.get(i)) {
								
				personsCounters[duty.getPerson().getPersonID()]++;
				
				
				for (Duty other : this.insetsTable_individual.insetsTable.get(i)) {
					if (duty != other && duty.getPerson() == other.getPerson()) {
						
						fitness += 500;
					}
				}
				
			}
		}
		
		int max = personsCounters[0];
		int min = personsCounters[0];
		
		for(int i=1; i < 10 ; i++){
			
			if(personsCounters[i] > max){
				
				max = personsCounters[i];
			}

			if(personsCounters[i]<min){
				
				min = personsCounters[i];
			}
		}
		
		fitness += (max - min) * 100;
		
	}


	public void mutate(ArrayList<Person> personsList) {
		
		for (int i = 0; i < InsetsTable.tableLength ; i++) {
			for(Duty duty : this.insetsTable_individual.insetsTable.get(i)) {
				
				if(Math.random() < MUTATION_RATE) {
					duty.setPerson(randomPerson(duty, personsList));
				}
				
			}
		}
		
	}
	
	public InsetsTable getInsetsTable() {
		return insetsTable_individual;
	}

	public double getFitness() {
		return fitness;
	}

	public Person randomPerson(Duty dutyChosen, ArrayList<Person> personsList){
		
		for(Person p : personsList){
			if(p.getPersonID() != dutyChosen.getPerson().getPersonID()){
				dutyChosen.setPerson(p);
				break;
			}
		}
		
		return dutyChosen.getPerson();
		
	}

}
