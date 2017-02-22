package main;

import java.util.ArrayList;

public class Population {
	
	public Individual[] individuals;
	public ArrayList<Person> personList;
	public InsetsTable emptyInsetsTable;
	public int size;
	
	public Population(int size, InsetsTable _empty_insetsTable, ArrayList<Person> pers) {
		individuals = new Individual[size];
		this.size = size;
		emptyInsetsTable = _empty_insetsTable;
		personList = pers;

		for (int i = 0; i < size; i++) {
			InsetsTable new_insetsTable = new InsetsTable((ArrayList<ArrayList<Duty>>) _empty_insetsTable.insetsTable.clone());
			
			System.out.println(new_insetsTable.insetsTable.get(0).get(0).getPerson());
			System.out.println(_empty_insetsTable.insetsTable.get(0).get(0).getPerson());

			for (int j = 0; j < InsetsTable.tableLength; j++) {
				for (Duty duty : new_insetsTable.insetsTable.get(j)) {
					duty.setPerson(randomPerson());
					System.out.println(duty.getPerson().getName());
				}
			}
			individuals[i] = new Individual(new_insetsTable);
		}
	}
	
	public void calcFitness(ArrayList<Person> personsList) {
		for(Individual ind : individuals) {
			ind.calcFitness(personsList);
		}
	}
	   
    private Person randomPerson() {
        int rnd = (int)(Math.random() * personList.size());
        return personList.get(rnd);
    }
	
	
	
	private Individual chooseParent() {
		
		Individual parent;
		
		int sumOfFitness = 0;
		
		double[] normalize_fitnesses = new double[individuals.length];
		
		for (int i = 0; i < individuals.length; i++) {
			sumOfFitness += individuals[i].getFitness();
		}
		
		normalize_fitnesses[0] = individuals[0].getFitness() / sumOfFitness;
		
		for (int i = 1; i < individuals.length; i++) {
			normalize_fitnesses[i] = normalize_fitnesses[i-1] + individuals[i].getFitness() / sumOfFitness;
		}
		
		ArrayList<Individual> matingpool = new ArrayList<Individual>();
		
		for (int i = 1; i < individuals.length; i++) {
			int n = (int)(individuals[i].getFitness() * 100);
			for (int j = 0; j < n; j++) {
				matingpool.add(individuals[i]);
			}
		}
		
		int index = (int)(Math.random() * matingpool.size());
		parent = matingpool.get(index);
		
		return parent;
}
	
	@SuppressWarnings("unchecked")
	public Population generateNewPop() {
		
		Individual parent1, parent2, child;
		InsetsTable parent1_insetsTable, parent2_insetsTable, child_insetsTable;
		
		Population newPop = new Population(size, emptyInsetsTable, personList);
		
		for (int i = 0; i < individuals.length; i++) {
			
			parent1 = chooseParent();
			parent2 = chooseParent();
			
			parent1_insetsTable = parent1.getInsetsTable();
			parent2_insetsTable = parent2.getInsetsTable();
			
			ArrayList<ArrayList<Duty>> dutyListArr = new ArrayList<ArrayList<Duty>>(InsetsTable.tableLength);
					
			for (int d = 0; d < InsetsTable.tableLength; d++) {
				
				if (d % 2 == 0) {
					dutyListArr.set(d, (ArrayList<Duty>) parent1_insetsTable.insetsTable.get(d).clone());
				}
				else {
					dutyListArr.set(d, (ArrayList<Duty>) parent2_insetsTable.insetsTable.get(d).clone());
				}
			}
			
			child_insetsTable = new InsetsTable(dutyListArr);
			
			child = new Individual(child_insetsTable);
			
			newPop.individuals[i] = child;
		}
		
		return newPop;
	}
	
	public void mutate(ArrayList<Person> personsList) {
		for(Individual ind : individuals) {
			ind.mutate(personsList);
		}
	}
	
	

}
