package Partie_5;

import java.util.ArrayList;
import java.util.List;

public class Troupe implements Cancaneur {
	
	private List<Cancaneur> troupe;
	
	public Troupe() {
		this.troupe = new ArrayList<>();
	}
	
	
	public void add(Cancaneur cancaneur) {
		troupe.add(cancaneur);
	}


	@Override
	public void cancaner() {
		for(Cancaneur cancaneur : troupe) {
			cancaneur.cancaner();
		}
	}
}
