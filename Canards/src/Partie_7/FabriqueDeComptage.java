package Partie_7;

public class FabriqueDeComptage extends FabriqueDeCanardAbstraite {

	@Override
	public Cancaneur creerColvert() {
		return new CompteurDeCouacs(new Colvert());
	}

	@Override
	public Cancaneur creerMandarin() {
		return new CompteurDeCouacs(new Mandarin());
	}

	@Override
	public Cancaneur creerAppelant() {
		return new CompteurDeCouacs(new Appelant());
	}

	@Override
	public Cancaneur creerCanardEnPlastique() {
		return new CompteurDeCouacs(new CanardEnPlastique());
	}

	@Override
	public Cancaneur creerOie() {
		return new CompteurDeCouacs(new AdaptateurDOie(new Oie()));
	}

}
