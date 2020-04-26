package projet1;

import java.util.Scanner;

public class classe1 { //normalement une classe commence toujours avec une Majuscule

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	
	//test
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//contenu de la classe
		System.out.print("\tHello world");
	
		System.out.println("\rtest");
		System.out.print("autre test\n");
		
		/*
		byte temperature;
		temperature=25;
		short vitesse;
		vitesse=32767;
		int temp_soleil;
		temp_soleil=15600000;
		long anneelumiere;
		anneelumiere=989512922999999L;
		float pi;
		pi=3.141592653f; //avec un '.' et pas une ','
		*/
		
		double division;
		division=0.33333333333333333333333d;
		/*
		char caractere;
		caractere='A';
		boolean question;
		question = true; */
		String phrase;
		phrase= "bla bla bla test";
		
		System.out.println(phrase + division +  "\n");
		
		int nbre1 = 3, nbre2 = 2;
		float resultat = (float)(nbre1) / (float)(nbre2);
		System.out.println("Le résultat est = " + resultat);
		
		//Conversion :
		int a=154;
		float b=(float)a;
		System.out.println(b);
		
		float a1 = 3.54f;
		int b1 = (int)a1;
		float c1=(float)b1;
		System.out.println("si a1 vaut: " + a1 + " alors b1 vaut: " + b1 + " et c1 vaut: " + c1);
		
		int nombre0 = 24;
		String cara0 = new String();
		cara0= String.valueOf(nombre0);
		System.out.println("cara= "+cara0);
		
		int nombre1 = Integer.valueOf(cara0).intValue();
		System.out.println("nombre1: " + nombre1);
		
		Scanner valeur0 = new Scanner(System.in);
		System.out.println("entrez quelque chose: ");
		String mot0 = valeur0.nextLine();
		System.out.println("mot: "+ mot0);
		
		Scanner valeur1 = new Scanner(System.in);
		System.out.println("saisir un caractere: ");
		String mot1 = valeur1.nextLine();
		char carac = mot1.charAt(0);
		System.out.println("le caractere est: "+ carac);
		
		Scanner valeur2 = new Scanner(System.in);
		System.out.println("saisir qq chose: ");
		int mot2 = valeur2.nextInt();
		System.out.println("valeur de int: "+ mot2);
		
		
	
	}
	
public class Toto{}

}
