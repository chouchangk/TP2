package TP2;

public class Abapa {
	
	public static void main(String[] args) {
		Jeu jeu = new Jeu("Alice", "Bob");
		while (!jeu.fini()) {
			jeu.jouerTour();
		}
		jeu.afficherGagnant();
	}

}
