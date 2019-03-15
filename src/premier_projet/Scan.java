package premier_projet;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] identifiant = { "arnaud", "benoit" };
		String[] mdp = { "nono", "ben" };
		boolean test = false;
		int j = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir votre identifiant :");
		String str = sc.nextLine();

		for (int i = 0; i < identifiant.length; i++) {
			if (identifiant[i].equals(str) && test == false) {
				System.out.println("Bonjour : " + str);
				test = true;
				j = i;
			}
		}

		if (test) {

			System.out.println("Veuillez saisir votre mdp :");
			String mp = sc.nextLine();

			if (mdp[j].equals(mp)) {
				System.out.println("Bienvenue sur notre site : " + str);
			} else {
				System.out.println("Votre mot de passe est incorrect : " + str);
			}

		} else {
			System.out.println("Vous n'etes pas dans notre base :" + str + ".");
		}
	}
}
