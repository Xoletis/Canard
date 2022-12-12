package Partie_5;

public class SimulateurDeCanards {
	
	public static void main(String[] args) {
		SimulateurDeCanards simulateur = new SimulateurDeCanards();
		FabriqueDeCanardAbstraite fabriqueDeCanards = new FabriqueDeComptage();
		simulateur.simuler(fabriqueDeCanards);
	}
	
	public void simuler(FabriqueDeCanardAbstraite fabriqueDeCanards) {
		Cancaneur colvert =  fabriqueDeCanards.creerColvert();
		Cancaneur mandarin = fabriqueDeCanards.creerMandarin();
		Cancaneur appelant = fabriqueDeCanards.creerAppelant();
		Cancaneur canardEnPlastique = fabriqueDeCanards.creerCanardEnPlastique();
		Cancaneur oie = fabriqueDeCanards.creerOie();
		
		System.out.println("Simulateur de Canards");
		
		simuler(colvert);
		simuler(mandarin);
		simuler(appelant);
		simuler(canardEnPlastique);
		simuler(oie);
		
		Troupe troupeDeCanards = new Troupe();
		troupeDeCanards.add(mandarin);
		troupeDeCanards.add(appelant);
		
		Troupe troupeDeColverts = new Troupe();
		Cancaneur colvert2 = new Colvert();
		Cancaneur colvert3 = new Colvert();
		troupeDeColverts.add(colvert2);
		troupeDeColverts.add(colvert3);
		
		troupeDeCanards.add(troupeDeColverts);
		System.out.println("\nSimulateur de canards : Toute la troupe");
		simuler(troupeDeCanards);
		System.out.println("\nSimulateur de canards : Troupe de colverts");
		simuler(troupeDeColverts);
	}
	
	public void simuler(Cancaneur canard) {
		canard.cancaner();
	}
	
}