package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);

		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
	

		Commercant marco = new Commercant("Marco", 15);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	


		Yakuza yakuza = new Yakuza("Yaku Le Noir", "whisky", 30, "Le Clan des M�chants");
		yakuza.direBonjour();
		yakuza.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		yakuza.parler("Marco, si tu tiens � la vie donne moi ta bourse !");
		yakuza.extorquer(marco);

	

	}

}
