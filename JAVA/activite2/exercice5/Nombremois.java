/**
Activité 2
Exercice 5 - Nombre de jours dans un mois
Écrire un algorithme qui donne le nombre de jours dans un mois. 
Le mois est lu sous forme d’un entier (1 pour janvier...). 
On considère dans cet exercice que le mois de février comprend toujours 28 jours.

Date Mardi 08 Decembre
Auteur Iris Cournima

**/

import java.util.Scanner;
public class Nombremois{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // lecture de Systeme.in
		int month = 0;
		int dayInMonth = 0;


		System.out.println("Bienvenue dans nôtre super mega genial programme : Nombre de jours dans un mois !! *wink* *wink*");

		System.out.println("Pour bien commencer donnez moi le numéro d'un mois de 1 à 12");
		month = reader.nextInt();

		if (month == 2) {
			System.out.println("Il y a 28 jours!");
		}else if (month == 1) {
			System.out.println("Il y a 31 jours!");
		}else{
			dayInMonth = calculJour(month,dayInMonth);
			System.out.println("Il y a "+dayInMonth+" jours!");
		}
		
		
	}

	public static int calculJour(int month, int dayInMonth){
		if (month %2 == 0) {
			dayInMonth = 31;
		}else{
			dayInMonth = 30;
		}
		return dayInMonth;
	}
}