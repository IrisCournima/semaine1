import java.util.Scanner;
public class Surfacetriangle{
	

		



	public static  void main(String[] args) {
		Scanner reader = new Scanner(System.in); // lecture de Systeme.in
		double surface;
		System.out.println("Bienvenue dans le super programme de calcul de la surface d'un triangle");
		
		System.out.println("Pour calculer par triangulation tapez 1 et pour calculer par la base tapez 2");
		int choix = reader.nextInt();
		switch(choix){
			case 1:
				calculBase();
			break;
			case 2:
			calculTriangulation();
			break;
			default:
				System.out.println("ce choix n'est pas disponible au revoir");
			break;
		}

		
	}

	public static void calculBase(){
		Scanner reader = new Scanner(System.in); // lecture de Systeme.in
		double surface;
		System.out.println("Pour commencer donnez moi la largeur du triangle");
		double largeur = reader.nextInt();
		System.out.println("Merci maintenant sa hauteur");
		double hauteur = reader.nextInt();
		surface = (largeur*hauteur)/2;
		System.out.println("Et voilà la surface du rectangle est de: " + surface);
	}

	public static void calculTriangulation(){
		Scanner reader = new Scanner(System.in); // lecture de Systeme.in
		double surface;
		System.out.println("Pour commencer donnez moi la longueur du premier côté");
		double a = reader.nextInt();
		System.out.println("Merci maintenant la longueur du second côté");
		double b = reader.nextInt();
		System.out.println("Merci maintenant la longueur du dernier côté");
		double c = reader.nextInt();
		double p = (a+b+c)/2;
		surface = (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
		if (surface == 0.0) {
			System.out.println("Vôtre triangle est trop petit pour calculer sa surface par la triangulation");
		}else{

			System.out.println("Et voilà la surface du rectangle est de: " + surface);
		}
	}

}