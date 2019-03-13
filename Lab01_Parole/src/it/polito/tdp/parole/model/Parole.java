package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.List;

public class Parole {
	List <String> parole = new ArrayList<String>();
	

		
	public Parole() {
		
	}
	
	public long addParola(String p) {
		long start=System.nanoTime();
		parole.add(p);
		return System.nanoTime()-start;
	}
	
	public List<String> getElenco() {
		
		return parole;
	}
	
	public long reset() {
		long start=System.nanoTime();
		parole.clear();
		return System.nanoTime()-start;
	}
	
	public long removeParola(String p) {
		
		long start=System.nanoTime();
		if (parole.contains(p))
			{
			int cancella=	parole.indexOf(p);
			parole.remove(cancella);
				}
	return System.nanoTime()-start;
	}

}
