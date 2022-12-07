package Partie_2;

public class SimulateurDeCanards {
	
	public static void main(String[] args) {
		SimulateurDeCanards simulateur = new SimulateurDeCanards();
		simulateur.simuler();
	}
	
	public void simuler() {
		Cancaneur colvert = new Colvert();
		Cancaneur mandarin = new Mandarin();
		Cancaneur appelant = new Appelant();
		Cancaneur canardEnPlastique = new CanardEnPlastique();
		Cancaneur oie = new AdaptateurDOie(new Oie());
		
		System.out.println("\n Simulateur de Canards");
		
		simuler(colvert);
		simuler(mandarin);
		simuler(appelant);
		simuler(canardEnPlastique);
		simuler(oie);
	}
	
	public void simuler(Cancaneur canard) {
		canard.cancaner();
	}
	
}