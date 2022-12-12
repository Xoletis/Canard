package Partie_7;

public class VisitorCompteurNoeudFeuille implements Visitor {

	private int nombreDeNoeud = 0;
	private int nombreDeFeuille = 0;
	
	public int getNombreDeNoeud() {
		return nombreDeNoeud;
	}

	public int getNombreDeFeuille() {
		return nombreDeFeuille;
	}

	@Override
	public void visit(Troupe t) {
		nombreDeNoeud++;
	}

	@Override
	public void visit(Colvert c) {
		nombreDeFeuille++;
	}

	@Override
	public void visit(Mandarin c) {
		nombreDeFeuille++;
	}

	@Override
	public void visit(Appelant c) {
		nombreDeFeuille++;
	}

	@Override
	public void visit(CanardEnPlastique c) {
		nombreDeFeuille++;
	}

	@Override
	public void visit(AdaptateurDOie c) {
		nombreDeFeuille++;
	}

	@Override
	public void visit(CompteurDeCouacs c) {
		nombreDeNoeud++;
	}

	@Override
	public void visit(Visitable c) {
		System.out.println("classe pas encore gérée");
	}

}
