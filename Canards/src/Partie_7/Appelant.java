package Partie_7;

public class Appelant implements Cancaneur {
	private Observable observable;
	
	public Appelant() {
		this.observable = new Observable(this);
	}
	
	@Override
	public void cancaner() {
		System.out.println("Couincouin");
		notifierObservateurs();
	}

	@Override
	public void enregistrerObservateur(Observateur observateur) {
		observable.enregistrerObservateur(observateur);
		
	}

	@Override
	public void notifierObservateurs() {
		observable.notifierObservateurs();
	}
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
}
