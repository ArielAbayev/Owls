package main;

import java.util.ArrayList;

public class testCases {
	public static Person p1 =new Person("Ariel", 0);
	public static Person p2 =new Person("Paz", 0);
	public static Person p3 =new Person("Benda", 0);
	public static Person p4 =new Person("Hershko", 0);
	public static Person p5 =new Person("Dor", 0);
	public static Person p6 =new Person("Fibecht", 0);
	
	public static Duty du1 = new Duty(null, 1, 4, 1);
	public static Duty du2 = new Duty(null, 4, 7, 1);
	public static Duty du3 = new Duty(null, 6, 9, 1);
	public static Duty du4 = new Duty(null, 1, 3, 1);
	public static Duty du5 = new Duty(null, 4, 5, 1);
	public static Duty du6 = new Duty(null, 5, 8, 1);
	public static Duty du7 = new Duty(null, 4, 8, 1);
	public static Duty du8 = new Duty(null, 12, 16, 1);
	public static Duty du9 = new Duty(null, 8, 10, 1);
	public static Duty du10 = new Duty(null, 1, 2, 1);
	public static Duty du11 = new Duty(null, 2, 6, 1);
	public static Duty du12 = new Duty(null, 7, 8, 1);
	
	public static InsetsTable insets = new InsetsTable();
	
	//public static Individual indi = new Individual(insets);
	public static ArrayList<Person> pe = new ArrayList<Person>();
	
	public static Population pop;
	
	public static void run(){
//		System.out.println(du.getDutyDay());
//		System.out.println(du.getDutyStart());
//		System.out.println(du.getDutyEnd());
//		System.out.println(du.getDutyType());
		
		
		pe.add(p1);
		pe.add(p2);
		pe.add(p3);
		pe.add(p4);
		pe.add(p5);
		pe.add(p6);

		
		insets.insetsTable.get(0).add(du1);
		insets.insetsTable.get(0).add(du2);
		insets.insetsTable.get(0).add(du3);
		insets.insetsTable.get(2).add(du4);
		insets.insetsTable.get(2).add(du5);
		insets.insetsTable.get(2).add(du6);
		insets.insetsTable.get(3).add(du7);
		insets.insetsTable.get(4).add(du8);
		insets.insetsTable.get(5).add(du9);
		insets.insetsTable.get(6).add(du10);
		insets.insetsTable.get(6).add(du11);
		insets.insetsTable.get(6).add(du12);
		
		pop = new Population(1, insets, pe);
		
		for(int i=0 ; i<pop.individuals.length; i++){
//			System.out.println(insets.insetsTable.get(i));
			for(int j = 0; j < 7; j++) {
				for(Duty d : pop.individuals[i].insetsTable_individual.insetsTable.get(j)) {
					System.out.println(d.getPerson().getName());
				}
			}
			
		}
		
		pop.calcFitness(pe);
		
		for(int i=0 ; i<pop.individuals.length; i++){
//			System.out.println(insets.insetsTable.get(i));
			System.out.println(pop.individuals[i].fitness);
			
		}
		
		
	}
	
}
