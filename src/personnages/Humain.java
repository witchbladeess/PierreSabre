package personnages;

public class Humain {
	private String name;
	private String favDrink;
	private int money;

	public Humain(String name, String favDrink, int money) {
		this.name = name;
		this.favDrink = favDrink;
		this.money = money;
	}

	public String getNom() {
		return name;
	}

	public int getArgent() {
		return money;
	}

	public void parler(String texte) {
		System.out.println("(" + name + ") - " + texte);
	}

	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + name + " et j'aime boire du " + favDrink + "!");
		
		

	}

	public void gagnerArgent(int gain) {
		money += gain;
	}

	public void perdreArgent(int perte) {
		money -= perte;
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + favDrink + " ! GLOUPS !");
	}

	public void acheter(String product, int price) {
        if (money >= price) {
        	parler("J'ai " + money + " sous en poche. Je vais pouvoir m'offrir un " + product + " à " + price + " sous.");
            money -= price;

        } else {
            parler("Je n'ai plus que " + money + " sous en poche. Je ne peux même pas m'offrir un "  + product + " à " + price + " sous.");
        }
    }

	
	
}
