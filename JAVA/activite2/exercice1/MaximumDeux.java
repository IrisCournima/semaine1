/**
Activité 2
Exercice 1 - Maximum de 2 nombres
Écrire un algorithme qui, étant donné deux nombres quelconques, 
recherche et affiche le plus grand des deux. Attention !
 On ne veut pas savoir si c’est le premier ou le deuxième qui est le plus grand 
 mais bien quelle est cette plus grande valeur. Le problème est donc bien défini 
 même si les deux nombres sont identiques.

Date Mardi 08 Decembre
Auteur Iris Cournima

**/

import java.util.Scanner;
public class MaximumDeux{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // lecture de Systeme.in
		System.out.println("Bienvenue dans nôtre super mega genial programme : Maximum de 2 nombres !! *wink* *wink*");

		System.out.println("Pour bien commencer donnez moi un chiffre n'importe lequel");
		long var1 = reader.nextLong();
		System.out.println("Ok et maintenant un autre!");
		long var2 = reader.nextLong();
		

		if (var1>var2) {
			System.out.println("Super le plus grand est :" + var1);
		}else if (var2>var1) {
			System.out.println("Super le plus grand est :" + var2);
		}else{
			System.out.println("Super le plus grand est .....aucun en fait ils sont égaux" );
		}
		
		
		


	}
}