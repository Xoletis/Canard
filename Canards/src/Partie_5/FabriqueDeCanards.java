package Partie_5;

public class FabriqueDeCanards extends FabriqueDeCanardAbstraite {

	@Override
	public Cancaneur creerColvert() {
		return new Colvert();
	}

	@Override
	public Cancaneur creerMandarin() {
		return new Mandarin();
	}

	@Override
	public Cancaneur creerAppelant() {
		return new Appelant();
	}

	@Override
	public Cancaneur creerCanardEnPlastique() {
		return new CanardEnPlastique();
	}

	@Override
	public Cancaneur creerOie() {
		return new AdaptateurDOie(new Oie());
	}
}