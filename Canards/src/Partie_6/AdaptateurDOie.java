package Partie_6;

public class AdaptateurDOie implements Cancaneur {
	private Oie oie;
	
	public AdaptateurDOie(Oie _oie) {
		oie = _oie;
	}

	public void cancaner() {
		oie.cacarder();
	}
	
	@Override
	public void enregistrerObservateur(Observateur observateur) {
		
		
	}

	@Override
	public void notifierObservateurs() {
		
		
	}
	
}
