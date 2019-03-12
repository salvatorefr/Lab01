package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.List;

public class Parole {
	List <String> parole = new ArrayList<String>();


		
	public Parole() {
		
	}
	
	public void addParola(String p) {
		
		parole.add(p);
	}
	
	public List<String> getElenco() {
		
		return parole;
	}
	
	public void reset() {
		parole.clear();
	}

}
