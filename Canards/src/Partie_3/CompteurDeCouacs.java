package Partie_3;

public class CompteurDeCouacs implements Cancaneur {
	private Cancaneur cancaneur;
	private static int nombreDeCouacs;
	
	public CompteurDeCouacs(Cancaneur _cancaneur) {
		this.cancaneur = _cancaneur;
	}
	
	public void cancaner() {
		cancaneur.cancaner();
		nombreDeCouacs++;
	}
	
	public static int getCouacs() {
		return nombreDeCouacs;
	}
	
}
