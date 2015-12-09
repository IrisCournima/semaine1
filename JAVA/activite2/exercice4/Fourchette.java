/**
Activité 2
Exercice 4 - La fourchette
Écrire un algorithme qui, étant donné trois nombres, recherche et affiche si le premier des trois
 appartient à l’intervalle donné par le plus petit et le plus grand des 
deux autres (bornes exclues). Qu’est-ce qui change si on inclut les bornes ?

Date Mardi 08 Decembre
Auteur Iris Cournima

**/

import java.util.Scanner;
public class Fourchette{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // lecture de Systeme.in
		int min = 0;
		int max = 0;
		int varmilieu = 0;

		int var1;
		int var2;
		int var3;



		boolean egaliteTotale = false;
		boolean egalite = false;
		System.out.println("init");

		System.out.println("Bienvenue dans nôtre super mega genial programme : Fourchette !! *wink* *wink*");

		System.out.println("Pour bien commencer donnez moi un chiffre n'importe lequel");
		var1 = reader.nextInt();
		System.out.println("Ok et maintenant un autre!");
		var2 = reader.nextInt();
		System.out.println("Super un petit dernier (ou un grand)");
		var3 = reader.nextInt();

		egalite = testEgalite(var1,var2,var3,egalite);
		

		if (egalite==true) {
			
			egaliteTotale = testEgaliteTotale(var1,var2,var3,egaliteTotale);
			if (egaliteTotale==true) {
				System.out.println("Impossible de calculer un intervale tous vos chiffres sont egaux)");
			}else{

				System.out.println("Impossible de calculer un intervale deux de vos valeurs sur trois sont égales");
			}
		}else{
			System.out.println("min " + min);
			System.out.println("max "+ max);
			max = calculPlusGrand(var1,var2, var3, max);
			min = calculPlusPetit(var1,var2, var3, min);;
			if ((var1 == min)||(var1 ==max)) {
				System.out.println("Vôtre première valeur : "+ var1 + " est une des limites de l'intervalle");
			}else{
				System.out.println("Vôtre première valeur : "+ var1 + " appartient bien à l'intervalle");
				
			}
			
			
			
		}


		
	}
	public static int calculPlusGrand(int var1, int var2, int var3, int max){
	
		if ((var1>var2)&&(var1>var3)) {
			max = var1;
		}else if ((var2>var1)&&(var2>var3)) {
			max =  var2;
		}else if ((var3>var2)&&(var3>var1)) {
			max =  var3;
		}
		return max;

	}



public static int calculPlusPetit(int var1, int var2, int var3, int min){

	if ((var1<var2)&&(var1<var3)) {
		min = var1;
	}else if ((var2<var1)&&(var2<var3)) {
		min = var2;
	}else if ((var3<var2)&&(var3<var1)) {
		min = var3;
	}

	return min;

}

public static boolean testEgalite(int var1, int var2, int var3, boolean egalite){
	if (var1 == var2) {

		egalite = true;	

	}
	else if(var1 == var3){

		egalite = true;
	}else if(var2 == var3){

		egalite = true;
	}else{

		egalite=false;

	}
	
	return egalite;
}

public static boolean testEgaliteTotale(int var1, int var2, int var3,boolean egaliteTotale){
	if (var1 == var2) {

		if (var2 == var3) {

			egaliteTotale = true;
		}else{

			egaliteTotale = false;
		}
	}
	else if(var2 == var3){

		egaliteTotale = true;
		if (var3 == var1) {

			egaliteTotale = true;
		}else{

			egaliteTotale = false;
		}
	}else{

		egaliteTotale=false;
	}
	
	return egaliteTotale;
}
}