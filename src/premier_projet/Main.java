package premier_projet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Afficher les chaines de caractères
		System.out.println("Bonjour le monde!!!!!!!");
		System.out.println("Un autre message dans la console");
		System.out.println("Bonjour le monde ");

		// Afficher un entier
		System.out.println(12);

		// Afficher Un nombre à virgule
		System.out.println(12.2);
		// AFficher le résultat d'une addition
		System.out.println(10 + 15);

		// multiplication
		System.out.println(15 * 30);

		System.out.println(15 - 8);

		System.out.println(15 / 2);

		// Connection à la base de donnée
		ConMysql con = new ConMysql();
		con.main(null);
	}
}
