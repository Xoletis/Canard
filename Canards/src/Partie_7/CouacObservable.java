package Partie_7;

public interface CouacObservable {
	public void enregistrerObservateur(Observateur observateur);
	public void notifierObservateurs();
}
