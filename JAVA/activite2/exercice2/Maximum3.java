/**
Activité 2
Exercice 2 - Maximum de 3 nombres
Écrire un algorithme qui, étant donné trois nombres quelconques, 
recherche et affiche le plus grand des trois.

Date Mardi 08 Decembre
Auteur Iris Cournima

**/

import java.util.Scanner;
public class Maximum3{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // lecture de Systeme.in
		System.out.println("Bienvenue dans nôtre super mega genial programme : Maximum de 3 nombres !! *wink* *wink*");

		System.out.println("Pour bien commencer donnez moi un chiffre n'importe lequel");
		long var1 = reader.nextLong();
		System.out.println("Ok et maintenant un autre!");
		long var2 = reader.nextLong();
		System.out.println("Super un petit dernier (ou un grand)");
		long var3 = reader.nextLong();
		

		if (var1 == var2) {
			if (var1 == var3) {
				System.out.println("Super le plus grand est .....aucun en fait ils sont égaux" );
			}else if (var1>var3) {
				System.out.println("Super le plus grand est :" + var1);
			}else{
				System.out.println("Super le plus grand est :" + var3);
			}
		}else if(var1 == var3){
			if (var1 == var2) {
				System.out.println("Super le plus grand est .....aucun en fait ils sont égaux" );
			}else if (var1>var2) {
				System.out.println("Super le plus grand est :" + var1);
			}else{
				System.out.println("Super le plus grand est :" + var2);
			}
		}else if(var3 == var2){
			if (var3 == var1) {
				System.out.println("Super le plus grand est .....aucun en fait ils sont égaux" );
			}else if (var3>var1) {
				System.out.println("Super le plus grand est :" + var3);
			}else{
				System.out.println("Super le plus grand est :" + var1);
			}
		}

		else{

			if ((var1>var2)&&(var1>var3)) {
			System.out.println("Super le plus grand est :" + var1);
			}else if ((var2>var1)&&(var2>var3)) {
				System.out.println("Super le plus grand est :" + var2);
			}else if ((var3>var2)&&(var3>var1)) {
				System.out.println("Super le plus grand est :" + var3);
			}

		}


		
		
	}
}