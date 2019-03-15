package premier_projet;

import java.util.Scanner;

public class creatCarre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre un nom pour le cote d'un carré");
		int cote = sc.nextInt();
		int total = cote * cote;
		for (int i = 1; i <= total; i++) {
			System.out.print("* ");
			if (i % cote == 0) {
				System.out.println();
			}
		}
	}

}
