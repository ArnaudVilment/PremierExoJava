package premier_projet;

public class ConditionsExo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 18;
		if(age >= 18)
			System.out.println("Vous etes majeure");
		else
			System.out.println("Vous etes mineure");
		
		int note = 20;
		if(note >= 0 && note < 5) {
			System.out.println("null");
		}
		if(note >= 5  && note < 10) {
			System.out.println("Peu mieux");
		}
		if(note >= 10 && note < 15) {
			System.out.println("Bien");
		}
		if(note >= 15 && note <= 20) {
			System.out.println("Très Bien");
		}
	}

}
