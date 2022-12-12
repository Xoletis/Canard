package Partie_6;

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
	
}
