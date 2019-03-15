package premier_projet;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ScanJustPrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int prix = ThreadLocalRandom.current().nextInt(0, 100);

		int prixChoisi = 0;
		System.out.println("Essayer de trouver le just prix !!!!");
		do {
			System.out.println("Veuillez saisir un nombre");
			prixChoisi = sc.nextInt();

			if (prixChoisi > prix) {
				System.out.println("perdu, c'est moins");
			} else if (prixChoisi < prix) {
				System.out.println("perdu, c'est plus");
			} else {
				System.out.println("Gagné!!");
			}
		} while (prixChoisi != prix);

	}

}
