package premier_projet;

import java.util.Scanner;

public class trouveMinTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] splitArray = null;
		int tempMin = Integer.MIN_VALUE;
		int tempMax = Integer.MAX_VALUE;

		String n = sc.nextLine();
		n.trim();

		if (!n.equals("0")) {

			int[] splitInt = new int[Integer.parseInt(n)];
			String c = sc.nextLine();
			c.trim();
			splitArray = c.split(" ");

			if (splitArray.length == Integer.parseInt(n)) {

				for (int i = 0; i < splitArray.length; i++) {
					splitInt[i] = Integer.parseInt(splitArray[i]);
				}
				tritabCroissant(splitInt);

				boolean bol = true;
				for (int i = 0; i < splitInt.length; i++) {

					if (splitInt[i] > 0 && splitInt[i] < tempMax) {
						tempMax = splitInt[i - 1];
					}
					if (splitInt[i] > tempMin && splitInt[i] > 0 && bol) {
						tempMin = splitInt[i];
						bol = false;
					}

				}
				if (Math.abs(tempMax) == tempMin) {
					System.out.println(tempMin);
				} else if (Math.abs(tempMax) > tempMin) {
					System.out.println(tempMin);
				} else {
					System.out.println(tempMax);
				}

			} else {
				System.out.println("0");
			}

		} else {
			System.out.println("0");
		}
		sc.close();
	}

	public static void tritabCroissant(int tab[]) {
		int tampon = 0;
		boolean b;

		do {
			b = false;
			for (int i = 0; i < tab.length - 1; i++) {

				if (tab[i] > tab[i + 1]) {

					tampon = tab[i];
					tab[i] = tab[i + 1];
					tab[i + 1] = tampon;
					b = true;
				}
			}
		} while (b);
	}
}
