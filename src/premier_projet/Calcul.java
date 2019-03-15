package premier_projet;

import java.util.Scanner;

public class Calcul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez un nombre :");
		int nb1 = sc.nextInt();
		System.out.println("Veuillez un nombre :");
		int nb2 = sc.nextInt();
		String op = "";
		int res = 0;
		int cnt = 0;

		do {
			if (cnt < 3) {
				System.out.println("Que voulez vous faire ?");
			} else if (cnt >= 3 && cnt < 4) {
				System.out.println("T idiot ou quoi ??? Uniquement (+,-,*,/)");
			}
			cnt++;
			if (cnt < 4)
				op = sc.next();

			switch (op) {
			case "+":
				res = nb1 + nb2;
				break;
			case "-":
				res = nb1 - nb2;
				break;
			case "*":
				res = nb1 * nb2;
				break;
			case "/":
				res = nb1 / nb2;
				break;
			}
			if (cnt == 4)
				op = "+";

			System.out.println(cnt);
		} while (op == "+" || op == "-" || op == "*" || op == "/");

		if (cnt != 4)
			System.out.println("Resultat :" + nb1 + op + nb2 + "=" + res);
		else
			System.out.println("Laisse tomber ta rien compris à la vie");

	}

}
