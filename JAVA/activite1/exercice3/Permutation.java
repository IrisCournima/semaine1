/**
Activité 1 
	Exercice 3 - Permutation
Écrire une séquence d’instructions qui réalise la permutation du contenu de deux variables.

Date : lundi 07 decembre 
Auteur: Iris Cournima



**/

import java.util.Scanner;
public class Permutation{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // lecture de Systeme.in
		System.out.println("Bienvenue dans le super programme de calcul de premutation de variables");


		String vartemp;
		System.out.println("Pour commencer donnez moi la première variable");
		String var1 = reader.nextLine();
		System.out.println("Merci maintenant la seconde");
		String var2 = reader.nextLine();
		
		System.out.println("Avant permutation var1= " + var1 + "var2 = " + var2);

		vartemp = var1;
		var1= var2;
		var2= vartemp;
		System.out.println("Après permutation var1= " + var1 + "var2 = " + var2);
	}
}