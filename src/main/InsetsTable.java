package main;

import java.util.ArrayList;

public class InsetsTable {

	public ArrayList<ArrayList<Duty>> insetsTable;
	public static final int tableLength = 7;
	
	public InsetsTable()  {
		
		insetsTable = new ArrayList<ArrayList<Duty>>();
		
		for(int i=0; i< tableLength; i++){
			insetsTable.add(new ArrayList<Duty>());
		}
	}
	
	public InsetsTable(ArrayList<ArrayList<Duty>> dutyListArr) {
		insetsTable = dutyListArr;
	}

	@SuppressWarnings("unchecked")
	public InsetsTable copy() {
		return new InsetsTable((ArrayList<ArrayList<Duty>>) insetsTable.clone());
	}
	
	public String toString() {
		String str = "";
		
		for(int d = 0; d < tableLength; d++) {
			str += "Day";
			for (Duty duty : insetsTable.get(d)) {
				str += "Duty " + duty.getDutyStart() + "-" + duty.getDutyEnd() + " done by " + duty.getPerson().getName() + "\n";
			}
		}
		
		
		return str;
	}
	
}
