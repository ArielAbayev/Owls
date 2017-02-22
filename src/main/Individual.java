package main;

import java.util.ArrayList;

public class Individual{

	private static double MUTATION_RATE = 0.01;
	
	private InsetsTable insetsTable_individual ;
	
	private double fitness = 0;
	
	public Individual(InsetsTable insetsTable) {
		
		insetsTable_individual = insetsTable;
		
	}

	
	public void calcFitness(ArrayList<Person> personsList) {

		int personsCounters[] = new int[10]; // change to numOfPersons
		int max = personsCounters[0];
		int min = personsCounters[0];
		
		for(Person p : personsList){
			personsCounters[p.ID] = p.getDutiesLastMonth();
		}
		
		for (int i = 0; i < insetsTable_individual.tableLength ; i++) {
			for(Duty duty : this.insetsTable_individual.insetsTable.get(i)) {
				
				if(duty.getDutyDay() == duty.getPerson().getAbsentOnDay()){
					
					fitness += 1000.0;
				} 
				
				personsCounters[duty.getPerson().ID] ++;
				
				
			}
		}

		for(int i=1; i < 10 ; i++){
			
			if(personsCounters[i] > max){
				
				max= personsCounters[i];
			}else if(personsCounters[i]<min){
				
				min = personsCounters[i];
			}
		}
		
		fitness += max - min;
		
	}


	public void mutate(ArrayList<Person> personsList) {
		
		for (int i = 0; i < insetsTable_individual.tableLength ; i++) {
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
			if(p.ID != dutyChosen.getPerson().ID){
				dutyChosen.setPerson(p);
				break;
			}
		}
		
		return dutyChosen.getPerson();
		
	}

}
