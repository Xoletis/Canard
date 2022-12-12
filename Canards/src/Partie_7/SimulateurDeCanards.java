package Partie_7;

public class SimulateurDeCanards {
	
	public static void main(String[] args) {
		SimulateurDeCanards simulateur = new SimulateurDeCanards();
		FabriqueDeCanardAbstraite fabriqueDeCanards = new FabriqueDeComptage();
		
		simulateur.simuler(fabriqueDeCanards);
	}
	
	public void simuler(FabriqueDeCanardAbstraite fabriqueDeCanards) {
		Cancaneur colvert = fabriqueDeCanards.creerColvert();
		Cancaneur mandarin = fabriqueDeCanards.creerMandarin();
		Cancaneur canardOie = new AdaptateurDOie(new Oie());
		
		Troupe sousTroupe = new Troupe();
		fabriqueDeCanards = new FabriqueDeCanards();
		sousTroupe.add(fabriqueDeCanards.creerColvert());
		sousTroupe.add(fabriqueDeCanards.creerMandarin());
		sousTroupe.add(fabriqueDeCanards.creerColvert());
		
		Troupe maTroupe = new Troupe();
		maTroupe.add(colvert);
		maTroupe.add(mandarin);
		maTroupe.add(canardOie);
		maTroupe.add(sousTroupe);
		
		Visitor unVisiteur = new VisitorCompteurNoeudFeuille();
		maTroupe.accept(unVisiteur);
		System.out.println("Nb de noeds = "
				+ ((VisitorCompteurNoeudFeuille) unVisiteur).getNombreDeNoeud());
		System.out.println("Nb de feuilles = "
				+ ((VisitorCompteurNoeudFeuille) unVisiteur).getNombreDeFeuille());
	}
	
	public void simuler(Cancaneur canard) {
		canard.cancaner();
	}
	
}