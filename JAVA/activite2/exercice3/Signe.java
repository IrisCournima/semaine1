/**
Activité 2
Exercice 3 - Le signe d'un nombre
Écrire un algorithme qui affiche un message
 indiquant si un entier est strictement négatif, nul ou strictement positif.

Date Mardi 08 Decembre
Auteur Iris Cournima

**/

import java.util.Scanner;
public class Signe{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // lecture de Systeme.in
		
				System.out.println("Bienvenue dans nôtre super mega genial programme : Signe !! *wink* *wink*");

		System.out.println("Pour bien commencer donnez moi un  entier n'importe lequel positif ou négatif");
		long var1 = reader.nextLong();
		if (var1>0) {
			System.out.println("C'est un eniter positif!");
		}else{
			System.out.println("C'est un entier négatif");
		}
		
		
	}

	static long calculPlusGrand(){
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