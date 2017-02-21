package main;

import java.util.ArrayList;

public class InsetsTable {

	public ArrayList<Duty> insetsTable[];
	public final int tableLength = 7;
	
	public InsetsTable() {
	
		for(int i=0; i< tableLength; i++){
			insetsTable[i] = new ArrayList<Duty>();
		}
	}
	
	
	
}
