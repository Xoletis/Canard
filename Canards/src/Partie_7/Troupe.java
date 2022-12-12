package Partie_7;

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


	@Override
	public void enregistrerObservateur(Observateur observateur) {
		for(Cancaneur cancaneur : troupe) {
			cancaneur.enregistrerObservateur(observateur);
		}
	}


	@Override
	public void notifierObservateurs() {
		return;
	}


	@Override
	public void accept(Visitor v) {
		v.visit(this);
		for(Cancaneur cancaneur : troupe) {
			cancaneur.accept(v);
		}
	}
}
