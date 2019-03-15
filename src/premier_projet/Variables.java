package premier_projet;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Les entiers */
		short nombrePetit = 12; // -32000 a 32000
		System.out.println(nombrePetit);

		int nombreGrand = 1245878; //
		System.out.println(nombreGrand);

		long nombreTropGrand = 1256464235; // -9 223 372 036 854 775 808 a 9 223 372 036 854 775 807
		System.out.println(nombreTropGrand);
		long coordonneeSpace = 120_120_120_120_120l; // La varaible est directement affecté en type long
		System.out.println(coordonneeSpace);

		/* Less nombres à virgules */
		double tva = 20.0; // 4.9406656555665 E324 a ......
		System.out.println("tva=" + (tva * 20));
		float taxe = 33.5f; // 1.41234565 €-45 a ....
		System.out.println(tva + taxe + " = " + (tva + taxe));

		/* Les Char */
		char c = 'F'; // Un seul caractère

		/* boolean */
		boolean f = false;
		boolean v = true;
		int a = 5;
		boolean b = (a == 5);
		if (b) {
			System.out.println("b = " + b);
		}

		System.out.println("Fonction findMinMax");
		Test.findMinMax();
	}
}
