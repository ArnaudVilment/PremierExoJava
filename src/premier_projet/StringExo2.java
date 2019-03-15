package premier_projet;

import java.util.Scanner;

public class StringExo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String chaine = sc.nextLine();

		if (chaine.equals("hello")) {
			System.out.println("Hello!");
		}

		if (chaine.startsWith("bon")) {
			System.out.println("Salut");
		}

		if (chaine.endsWith("lo")) {
			System.out.println("Peut-être hello");
		}

		// .equals
		// .startsWith
		// .endsWith
		// .contains
		// chaine.substring(3);
		// chaine.substring(3, 7);
		// chaine.concat("hello");

		if (chaine.contains(" le ")) {
			System.out.println("Yes, la chaine contient ' le ' ");
		}

		System.out.println(chaine.length());

		String sousChaineDe5JLaFin = chaine.substring(3);
		System.out.println(sousChaineDe5JLaFin);

		String sousChaineDe5J10 = chaine.substring(3, 7);
		System.out.println(sousChaineDe5J10);

		String s = chaine.concat("hello");

		String nom = "";
		if (nom.isEmpty()) {
			nom = "VIDE";
		}
		System.out.println(nom);

	}

}
