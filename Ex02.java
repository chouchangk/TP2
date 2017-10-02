package TP2;
import java.util.*;

public class Ex02{
    static int nmb = 0;

    public static int question(){
        
        Scanner sc = new Scanner(System.in);
	
	int a = (int)(1+9*Math.random());
	int b = (int)(1+9*Math.random());
        System.out.println(a);
	System.out.println(b);
	boolean pasfini=true;
        while(pasfini){
	    System.out.println("C'est quoi le resultat ?");
	    if(sc.nextInt() == a*b){
		pasfini=false;
	    }
	    nmb++;
	}
	
	return nmb;
    }

    public static void evaluation(int n){
	int nmb = 0;
	
        for(int i =0;i<n;i++){
	    nmb=nmb+question()-1;
	    System.out.println(nmb);
	}
	System.out.println("Vous avez obtenu " + (520-nmb)); 
    }

    public static void main(String[] args){

	evaluation(args[0]);
	
    }
    

}
