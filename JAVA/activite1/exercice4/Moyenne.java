/**
Activité 1 
	Exercice 4 - Note moyenne
Écrire un algorithme qui, étant donné les résultats (note entière sur 20) de trois examens passés 
par un étudiant (exprimés par six nombres, à savoir, la note et la pondération de chaque examen),
 calcule et affiche la moyenne globale exprimée en pourcentage. 
 Vérifie bien votre algorithme avec des valeurs concrètes ; 
 il est facile de se tromper dans la formule !

Date : lundi 07 decembre 
Auteur: Iris Cournima



**/

import java.util.Scanner;
public class Moyenne{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // lecture de Systeme.in
		
		double moyenne;

		System.out.println("Bienvenue dans le super programme de calcul de moyenne");

		System.out.println("Pour commencer donnez moi la première note");
		double note1 = reader.nextDouble();
		System.out.println("Merci son coef");
		double coeff1 = reader.nextDouble();

		System.out.println("Merci maintenant la seconde note");
		double note2 = reader.nextDouble();
		System.out.println("Merci son coef");
		double coeff2 = reader.nextDouble();

		System.out.println("Merci maintenant la dernière");
		double note3 = reader.nextDouble();
		System.out.println("Merci son coef");
		double coeff3 = reader.nextDouble();

		double totalNote = (note1*coeff1)+(note2*coeff2)+(note3*coeff3);
		double totalCoef = coeff1+coeff2+coeff3;

		moyenne = (double) Math.round((totalNote/totalCoef) * 100) / 100;

		
		System.out.println("Vôtre moyenne est " + moyenne);

		if (moyenne < 1) {
			System.out.println("Va ptet falloir se mettre à bosser =___=");	
		}
		else if ((moyenne >= 1)&&(moyenne < 5)){
			System.out.println("Même pas 5? faut rattraper ça!");	
		}else if ((moyenne >= 5)&&(moyenne < 5)){
			System.out.println("Allez on se bouge jusqu'à la moyenne");	
		}else if ((moyenne >= 10)&&(moyenne < 15)){
			System.out.println("Allez courage on se motive pour une petite mention?");	
		}else if ((moyenne >= 5)&&(moyenne < 20)){
			System.out.println("C'est bien tout ça !");	
		}else{
			System.out.println("Ah ouais? Ben saute une classe si t'es si doué =_____=");	
		}

	}
}