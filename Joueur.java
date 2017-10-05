package TP2;
import java.util.*;

public class Joueur {
	String nom;
	VuePlateau vueduPla;
	
	public Joueur(String nom,int vueduPla) {
		this.nom = nom;
		this.vueduPla = new VuePlateau();
		this.vueduPla.cote = vueduPla;
	}
	
	public int choisirCase() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n<0 || n>5) {
			System.out.println("Entre 0~~5!");
			n = sc.nextInt();
		}
		if(vueduPla.cote==1) {
			n = n + 7;
		}
		return n;
	}
	
	public int demanderCoup(Plateau p) {
		int n;
		vueduPla.afficherPlateau(p);
		System.out.println("Vous vouler vider quel case?");
		n = choisirCase();
		while(p.pla[n]==0) {
			rejeterCoup();
			n = choisirCase();
		}
		System.out.println("********************************************************");
		vueduPla.viderCase(p, n);
		return n;
	}
	
	public void rejeterCoup() {
		System.out.println("La case est vide, choisissez à nouveau!");
	}
}
