/**
Activité 2

Exercice 7 - Valider une date
Écrire un algorithme qui valide une date donnée par trois entiers : l’année, le mois et le jour.

utilisation de SimpleDateFormat   formatting (date -> text), parsing (text -> date), and normalization.


Date Mardi 08 Decembre
Auteur Iris Cournima

**/

import java.util.Scanner;
import java.util.*;


public class ValideAnnee{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // lecture de Systeme.in
		String date ;
		


		System.out.println("Bienvenue dans nôtre super mega genial programme : Valider une date!! *wink* *wink*");

		System.out.println("Pour bien commencer donnez moi une date terrestre (les dates stellaires ne sont pas valides pour ce programme)");
		date = reader.nextLine();


		if (date == null) {
			System.out.println("Vous n'avez pas entré de date!");
		}else{
			SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
			sdf.setLenient(false); //date mise à non correcte par defaut

			try{
				Date dateValide = sdf.parse(date);
				System.out.println("ok");

			}catch(ParseException erreur){
				erreur.printStacktrace();
			}
		}


	}
}