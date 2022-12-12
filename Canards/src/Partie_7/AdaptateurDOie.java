package Partie_7;

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
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
}
