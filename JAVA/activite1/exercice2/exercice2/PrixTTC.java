import java.util.Scanner;
public class PrixTTC{
	public static void main(String[] args) {
		double pourcentageTVA;
		Scanner reader = new Scanner(System.in);

		System.out.println("Bienvenue dans le super programme de calcul de prix avec la TVA");
		

		System.out.println("Le taux de TVA par défaut en 2015 est de 20%");
		System.out.println("Si vous souhaitez entrer un nouveau montant de TVA (en pourcent) tapez 1 sinon tapez 2");
		System.out.println();
		int choix = reader.nextInt();

		switch(choix){
			case 1:
				System.out.println("Entrez le montant de la TVA en pourcent");
				pourcentageTVA = reader.nextDouble()/100;
				calculTVA(pourcentageTVA);
			break;

			case 2:
			pourcentageTVA=0.2;
			calculTVA(pourcentageTVA);
			break;

			default:
			System.out.println("Ce choix n'est pas valable la TVA reste donc à 20%");
			pourcentageTVA=0.2;
			calculTVA(pourcentageTVA);
		}


	}
	public static void calculTVA(double pourcentageTVA){
		double prixHT;
		double prixTTC ;
		
		double tva;
		double quantite;
		Scanner reader = new Scanner(System.in);

		System.out.println("En premier lieu donnez moi le prix de vôtre produit ");
		
		prixHT = reader.nextDouble();
		
		System.out.println("Merci, maintenant la quantité commandée");
		quantite= reader.nextDouble();

		tva = (prixHT*quantite)*pourcentageTVA;
		tva = (double) Math.round(tva * 100) / 100;
		double total = (prixHT*quantite);
		prixTTC = (total+tva);
		System.out.println("Le prix avec TVA est de:" + prixTTC);
		System.out.println("Le prix de la  TVA seule est de:" + tva);
	}
}