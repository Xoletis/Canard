package Partie_6;

public class Mandarin implements Cancaneur {
	private Observable observable;
	
	public Mandarin() {
		this.observable = new Observable(this);
	}
	
	@Override
	public void cancaner() {
		System.out.println("Coincoin");
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
