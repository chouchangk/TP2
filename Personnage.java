package TP2;

import java.util.*;

public class Personnage {
	public String nom;
	public Information constitution;
	public Information etat;
	
	public Personnage(String nom){
		this.nom = nom;
	}
	
	public String toString(){
		return this.nom+ "" + " est vainqueur";
	}
	
	public boolean estVivant(int a){
		if(a>0){
			return true;
		}else{
			return false;
		}
	}
	
	public void rebirth(){
		this.etat = new Information(100,10,10);
	}
	
	public void attaque(Personnage x){
		int domage = max(1,this.etat.force - x.etat.force);
		if(x.etat.agilite>this.etat.agilite){
			domage = (int)(0.5*domage);
			x.etat.agilite = (int)(0.6*x.etat.agilite);
		}
		x.etat.vitalite = x.etat.vitalite - domage; 
	}

	private int max(int i, int j) {
		// TODO Auto-generated method stub
		if(i>j){
			return i;
		}else{
			return j;
		}
	}
	/*ic int lutteIte(Personnage x){
		while(x.estVivant(x.etat.vitalite)){
			this.attaque(x);
		}
		return x.etat.vitalite;
	}
	*/
	public int lutteIte(Personnage x){
		while(estVivant(this.etat.vitalite) && estVivant(x.etat.vitalite) ){
			this.attaque(x);
			x.attaque(this);
		}
		
		return x.etat.vitalite;
	}
	
	public int lutteRec(Personnage x) {
		if(estVivant(this.etat.vitalite) && estVivant(x.etat.vitalite)){
			this.attaque(x);
			x.attaque(this);
			return this.lutteRec(x);
		} else{
			return x.etat.vitalite;
		}
	}
	
	public static void main(String[] args){
		Personnage p1 = new Personnage("abb");
		Personnage p2 = new Personnage("abc");
		p1.etat = new Information(10,20,14);
		
		p2.etat = new Information(11,15,12);
		
		System.out.println(p1.lutteRec(p2));
		//p1.lutteIte(p2);
		
		//System.out.println(p1.toString());
	}
	
	
	

}
 