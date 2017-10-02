package TP2;

public class VuePlateau {
	int cote; //haut est nomé 1; 
	          //base est nomé 0;
	
	public void afficherPlateau(Plateau p) {
		//if(p.vue.cote == 0) {
			System.out.print("\t");
			for(int i=12;i>=7;i--) {
				System.out.print(p.grainesCase(i)+"\t");
			}
			System.out.println();
			System.out.print(p.pla[13]+"\t\t\t\t\t\t\t"+p.pla[6]);
			System.out.println();
			System.out.print("\t");
			for(int j=0;j<=5;j++) {
				System.out.print(p.pla[j]+"\t");
			}
			System.out.println();
			/*
		}else {
			System.out.print("\t");
			for(int j=0;j<=5;j++) {
				System.out.print(p.pla[j]+"\t");
			}
			System.out.println();
			System.out.print(p.pla[6]+"\t\t\t\t\t\t\t"+p.pla[13]);
			System.out.println();
			System.out.print("\t");
			for(int i=12;i>=7;i--) {
				System.out.print(p.pla[i]+"\t");
			}
			System.out.println();
			}
			*/
	}
	
	public boolean viderCase(Plateau p,int num) {
		boolean f =false;
		int n = p.pla[num];
		p.pla[num] = 0;
		while (n>0) {
			num++;
			if(num>13) {
				num = num - 14;
			}
			p.pla[num] = p.pla[num] + 1;
			n--;
			f = true;
		}
		return f;
	}
	
	public boolean peutJouer(Plateau p) {
		boolean f = false;
		for(int i=0;i<6;i++) {
			if(p.pla[i] != 0) {
				return f = true;
			}
		}
		return f;
	}
	
	public static void main(String[] args) {
		Plateau t = new Plateau();
		t.vue.afficherPlateau(t);
		t.vue.viderCase(t, 9);
		t.vue.afficherPlateau(t);
	}

}
