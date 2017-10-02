package TP2;
import java.util.Scanner;

public class Ex01{

    public static String change(String a){
	String b = new String();
	for(int i=0;i<a.length();i++){
	    
	    if(a.charAt(i)==('a')){
		b=b+ 'e';
	    }else if(a.charAt(i) == 'e'){
		b=b+ 'i';
	    }else if(a.charAt(i) == 'i'){
		b=b+ 'o';
	    }else if(a.charAt(i) == 'o'){
		b = b+'u';
	    }else if(a.charAt(i) == 'y'){
		b = b+'a';
	    }else{
		b=b+a.charAt(i);
	    }}
	return b;
    }
    
    public static void main(String[] args){
 
	System.out.println(change(args[0]));
	
    }
	
}
