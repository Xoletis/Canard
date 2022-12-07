package Partie_2;

public class AdaptateurDOie implements Cancaneur {
	private Oie oie;
	
	public AdaptateurDOie(Oie _oie) {
		oie = _oie;
	}

	public void cancaner() {
		oie.cacarder();
	}
	
}
