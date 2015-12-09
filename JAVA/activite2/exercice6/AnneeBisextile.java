/**
Activité 2
Exercice 6 - Année bissextile
Écrire un algorithme qui vérifie si une année est bissextile. 
Pour rappel, les années bissextiles sont les années multiples de 4. 
Font exception, les multiples de 100 (sauf les multiples de 400 qui sont bien bissextiles). Ainsi :
- 2010 n’est pas bissextile
- 2012 est bissextile
- 2100 n’est pas bissextile
- 2400 est bissextile

Date Mardi 08 Decembre
Auteur Iris Cournima

**/

import java.util.Scanner;
public class AnneeBisextile{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // lecture de Systeme.in
		int annee = 0;
		


		System.out.println("Bienvenue dans nôtre super mega genial programme : Année bissextile !! *wink* *wink*");

		System.out.println("Pour bien commencer donnez moi le numéro d'une année terrestre (les dates stellaires ne sont jamais bissextiles)");
		annee = reader.nextInt();


		if (annee %4 == 0) {
			if (annee %100 ==0) {
				if (annee %400 ==0) {
					System.out.println("Année bissextile");
				}else{
					System.out.println("Année non bissextile");
				}
				
			}else{
				System.out.println("Année bissextile");
			}
		}else{
			System.out.println("Année non bissextile");
		}



	}
}