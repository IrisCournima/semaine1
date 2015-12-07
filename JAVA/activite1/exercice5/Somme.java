/**
Activité 1 
Exercice 5 - Somme des chiffres
Écrire un algorithme qui calcule la somme des chiffres d’un nombre entier de 3 chiffres. 
Réflexion : l’algorithme est-il aussi valide pour les entiers inférieurs à 100 ?
Date : lundi 07 decembre 
Auteur: Iris Cournima



**/

import java.util.Scanner;
public class Somme{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // lecture de Systeme.in
		
		int somme = 0;

		System.out.println("Bienvenue dans le super programme de calcul de la somme des chiffres d’un nombre entier de 3 chiffres");
		System.out.println("Donnez moi un nombre entier à trois chiffres");
		int nombre = reader.nextInt();
		
		if (nombre < 100) {
			System.out.println("J'ai dit trois chiffres!");
		}else if (nombre > 999) {
			System.out.println("J'ai dit trois chiffres!");
		}else{
				
				while(nombre >0){
					somme += nombre %10;
					nombre = nombre/10;
				}
				System.out.println("Somme " + somme);
		}


	}
}