package premier_projet;

public class ConditionExo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double noteJava = 10, noteSql = 15, noteHtml = 11.2, noteJs = 5.5;
		int coefJava = 5, coefSql = 2, coefHtml = 1, coefJs = 3;

		double moyenneNote = ((noteHtml * coefHtml) + (noteJava * coefJava) + (noteJs * coefJs) + (noteSql * coefSql))
				/ 11;
		System.out.println("Moyenne = " + moyenneNote);
	}

}
