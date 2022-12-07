package Partie_3;

public class SimulateurDeCanards {
	
	public static void main(String[] args) {
		SimulateurDeCanards simulateur = new SimulateurDeCanards();
		simulateur.simuler();
	}
	
	public void simuler() {
		Cancaneur colvert =  new CompteurDeCouacs(new Colvert());
		Cancaneur mandarin = new CompteurDeCouacs(new Mandarin());
		Cancaneur appelant = new CompteurDeCouacs(new Appelant());
		Cancaneur canardEnPlastique = new CompteurDeCouacs(new CanardEnPlastique());
		Cancaneur oie = new CompteurDeCouacs(new AdaptateurDOie(new Oie()));
		
		System.out.println("\n Simulateur de Canards");
		
		simuler(colvert);
		simuler(mandarin);
		simuler(appelant);
		simuler(canardEnPlastique);
		simuler(oie);
		System.out.println(CompteurDeCouacs.getCouacs());
	}
	
	public void simuler(Cancaneur canard) {
		canard.cancaner();
	}
	
}
