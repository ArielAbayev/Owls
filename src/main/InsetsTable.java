package main;

import java.util.ArrayList;

public class InsetsTable {

	public ArrayList<ArrayList<Duty>> insetsTable;
	public static final int tableLength = 7;
	
	public InsetsTable()  {
		
		insetsTable = new ArrayList<ArrayList<Duty>>(tableLength);
		
		for(int i=0; i< tableLength; i++){
			insetsTable.set(i, new ArrayList<Duty>());
		}
	}
	
	public InsetsTable(ArrayList<ArrayList<Duty>> dutyListArr) {
		insetsTable = dutyListArr;
	}

	@SuppressWarnings("unchecked")
	public InsetsTable copy() {
		// TODO Auto-generated method stub
		return new InsetsTable((ArrayList<ArrayList<Duty>>) insetsTable.clone());
	}
	
}
