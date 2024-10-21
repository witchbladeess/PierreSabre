package personnages;

public class Commercant extends Humain {
	public Commercant(String name) {
        super(name, "thé", 20); 
    }

	public int seFaireExtorquer() {
        int montant = getArgent();
        perdreArgent(montant); 
        parler("J’ai tout perdu! Le monde est vraiment trop injuste...");
        return montant;
    }

    public void recevoir(int money) {
        gagnerArgent(money); 
        parler(money + " sous! Je te remercie généreux donateur!");
    }
}
