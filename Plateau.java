package TP2;

import java.util.*;
public class Plateau {
	static int[] pla = new int[14]; 
	VuePlateau vue = new VuePlateau();
	
	public Plateau() {
		for(int i=0;i<14;i++) {
			pla[i] = 4;
		}
		pla[13] = 0;
		pla[6] = 0;
	}
	public Plateau(VuePlateau vue) {
		this();
		this.vue.cote = 0;
	}
	
	public int grainesCase(int c) {
		return pla[c];
	}

	public static void main(String[] args) {
		Plateau t = new Plateau();
		t.vue.afficherPlateau(t);
	}
}
