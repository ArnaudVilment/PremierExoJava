package premier_projet;

import java.awt.List;
import java.util.ArrayList;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// If
		int note = 11;
		if(note > 10) {
			System.out.println("Bravo vous avez plus que la moyenne! Votre note = " + note);
		} else if(note == 10) {
			System.out.println("Vous avez la moyenne! ");
		} else {
			System.out.println("Vous n'avez pas la moyenne! ");
		}
		
		// Alternative au If => conditions ternaires imbrriquées
		String s = (note != 10)? ((note > 10)? "Vous avez plus que la moyenne! ": "Vous n'avez pas la moyenne!"): "Vous avez eu 10" ;
		System.out.println(s);
		
		// Switch
		switch(note) {
		
			case 1: System.out.println("Vous avez 1");
					break;
			case 2: System.out.println("Vous avez 2");
					break;
			case 3: System.out.println("Vous avez 3");
					break;
			default: System.out.println("Vous avez plus que 3");
		}
		
		// While
		int poucentage = 0;
		while(poucentage <= 10) {
			System.out.println("Le systeme est à : " + poucentage + "%");
			poucentage++;
		}
		
		// Do While
		do {
			System.out.println("Le systeme est dechargé à : " + poucentage + "%");
			poucentage--;
		} while(poucentage >= 0);
		
		// For
		for(int i = 0; i < 11; i++){
			System.out.println("Le systeme est à chargé à : " + i + "%");
	    }
		
		// For Each
		int myArray[] = { 1, 2, 3, 4, 5 };
		for (int var : myArray) {
			System.out.println(var);
		}
		

	}

}
