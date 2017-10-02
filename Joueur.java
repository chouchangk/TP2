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
	
	public int demanderCoup(Plateau p) {
		Scanner sc = new Scanner(System.in);
		int n;
		vueduPla.afficherPlateau(p);
		System.out.println("Vous vouler vider quel case?");
		n = sc.nextInt();
		if(vueduPla.cote==1) {
			n = n + 7;
		}
		System.out.println("********************************************************");
		if(p.pla[n]==0) {
			rejeterCoup();
		}
		vueduPla.viderCase(p, n);
		//vueduPla.afficherPlateau(p);
		return n;
	}
	
	public void rejeterCoup() {
		System.out.println("La case est vide, choisissez à nouveau!");
	}
}
