package TP2;

public class Information {
	int vitalite;
	int force;
	int agilite;
	
	public Information(int vita,int forc,int agili){
		this.vitalite = vita;
		this.force = forc;
		this.agilite = agili;
		
	}
	
	public Information(Information x){
		this.agilite = x.agilite;
		this.force = x.force;
		this.vitalite = x.vitalite;
	}
	
	
	public String toString(){
		return this.agilite + " " + this.force + " " + this.vitalite +" ";
	}
	
	public int getVitalite(){
		return this.vitalite;
	}
	
	public int getForce(){
		return this.force;
	}
	
	public int getAgilite(){
		return this.agilite;
	}

}
