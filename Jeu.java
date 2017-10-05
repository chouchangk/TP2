package TP2;


public class Jeu {
	Plateau pla1 = new Plateau();
	Joueur j1 = new Joueur("joueur111",0);
	Joueur j2 = new Joueur("joueur222",1);
	
	public Jeu(String joueur111,String joueur222) {
		this.j1.nom = joueur111;
		this.j2.nom = joueur222;
	}
	
	public boolean fini() {
		if((pla1.pla[6]>=25) || (pla1.pla[13]>=25)){
			return true;
		}else {
			return false;
		}
	}
	
	public void jouerTour() {
		System.out.println(j1.nom + "" + " commence !" );
		j1.demanderCoup(pla1);
		System.out.println(j2.nom + "" + " commence !" );
		j2.demanderCoup(pla1);
		
	}
	
	public void afficherGagnant() {
		if(pla1.pla[6]>pla1.pla[13]) {
			System.out.println(j1.nom+""+" est victeur! ");
		}else {
			System.out.println(j2.nom+""+" est victeur! ");
		}
	}
}
