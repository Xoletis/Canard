package Partie_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements CouacObservable {

	private List<Observateur> observateurs = new ArrayList<Observateur>();
	private CouacObservable canard;
	
	public Observable(CouacObservable _canard) {
		this.canard = _canard;
	}
	
	@Override
	public void enregistrerObservateur(Observateur observateur) {
		observateurs.add(observateur);
		
	}

	@Override
	public void notifierObservateurs() {
		Iterator<Observateur> iterateur = observateurs.iterator();
		while(iterateur.hasNext()) {
			iterateur.next().actualiser(canard);
		}
	}
	
}
