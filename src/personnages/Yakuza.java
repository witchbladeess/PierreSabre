package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String name, String favDrink, int argent, String clan) {
		super(name, favDrink, argent);
		this.clan = clan;
		this.reputation = 0;
	}

	public void extorquer(Commercant victime) {
		int montant = victime.seFaireExtorquer();
		gagnerArgent(montant); 
		reputation++; 
		parler("J'ai piqué les " + montant + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi ! Hi !");
	}

}
