package premier_projet;

public class testNombreTableau {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		int[] ints = { -1, 6, 9, 120, 59 };
		System.out.println(testNombreTableau.exits(ints, 20));
		System.out.println(testNombreTableau.exits(ints, 120));
		System.out.println(testNombreTableau.exits(ints, -1));
		System.out.println(testNombreTableau.exits(ints, 59));
		System.out.println(testNombreTableau.exits(ints, 60));
	}

	static private boolean exits(int[] ints, int k) {
		boolean b = false;
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] == k)
				b = true;
		}
		return b;
	}
}
