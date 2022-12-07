package Partie_4;

public class SimulateurDeCanards {
	
	public static void main(String[] args) {
		SimulateurDeCanards simulateur = new SimulateurDeCanards();
		FabriqueDeComptage fabriqueDeCanards = new FabriqueDeComptage();
		simulateur.simuler(fabriqueDeCanards);
	}
	
	public void simuler(FabriqueDeCanardAbstraite fabriqueDeCanards) {
		Cancaneur colvert =  fabriqueDeCanards.creerColvert();
		Cancaneur mandarin = fabriqueDeCanards.creerMandarin();
		Cancaneur appelant = fabriqueDeCanards.creerAppelant();
		Cancaneur canardEnPlastique = fabriqueDeCanards.creerCanardEnPlastique();
		Cancaneur oie = fabriqueDeCanards.creerOie();
		
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
