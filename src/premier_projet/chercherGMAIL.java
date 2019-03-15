package premier_projet;

import java.util.Scanner;

public class chercherGMAIL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String email = "";
		do {
			System.out.println("VEuillez saisir une adresse GMAIL : ");
			email = sc.nextLine();

			// Pattern p = Pattern.compile("[a-z]{3}@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}");
			// Matcher m = p.matcher(email);

			// if (m.find())
			// System.out.println("Correct!");

		} while (!email.endsWith("@gmail.com"));
		System.out.println("Merci");
	}
}
