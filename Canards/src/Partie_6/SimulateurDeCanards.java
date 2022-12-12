package Partie_6;

public class SimulateurDeCanards {
	
	public static void main(String[] args) {
		SimulateurDeCanards simulateur = new SimulateurDeCanards();
		FabriqueDeCanardAbstraite fabriqueDeCanards = new FabriqueDeCanards();
		
		simulateur.simuler(fabriqueDeCanards);
	}
	
	public void simuler(FabriqueDeCanardAbstraite fabriqueDeCanards) {
		Cancaneur colvert =  fabriqueDeCanards.creerColvert();
		
		Cancanologue leCancanologue = new Cancanologue();
		
		colvert.enregistrerObservateur(leCancanologue);
		
		Cancaneur colvert2 = fabriqueDeCanards.creerColvert();
		Cancaneur madarin = fabriqueDeCanards.creerMandarin();
		
		Troupe troupe = new Troupe();
		troupe.add(colvert2);
		troupe.add(madarin);
		
		troupe.enregistrerObservateur(leCancanologue);
		
		System.out.println("Simulateur de Canards");
		
		simuler(colvert);
		simuler(troupe);
	}
	
	public void simuler(Cancaneur canard) {
		canard.cancaner();
	}
	
}