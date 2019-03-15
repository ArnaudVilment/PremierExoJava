package premier_projet;

public class TabExo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] prenoms = { "Miloud", "Agnès", "Lionel", "Fabrice", "Charles", "Yassine", "Arnaud", "Mohamed",
				"Radouane", "Patrice", "Laurence", "Adrien", "Nedjma", "Laurent" };
		boolean b = false;
		for (int i = 0; i < prenoms.length; i++) {

			if (prenoms[i].equals("Laurent")) {

				b = true;
				System.out.println(prenoms[i]);
				System.out.println(prenoms[i].substring(prenoms[i].length() - 3));

			}
		}
		if (b == false) {
			System.out.println("Laurent n'existe pas!");
		} else {
			System.out.println("Laurent existe!");
		}
	}

}
