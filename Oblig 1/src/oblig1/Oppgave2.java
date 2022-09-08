package oblig1;

import javax.swing.JOptionPane;

public class Oppgave2 {

	public static void main(String[] args) {
		
		String poengInput = JOptionPane.showInputDialog("Skriv inn antall poeng: ");
		int poeng = Integer.parseInt(poengInput);
		char karakter = 'x';
		
if ((poeng>-1) && (poeng<101)) {	
	
	if ((poeng>=90) && (poeng<=100)) {karakter = 'A';}
	else if ((poeng>=80) && (poeng<=89)) {karakter = 'B';}
	else if ((poeng>=60) && (poeng<=79)) {karakter = 'C';}	
	else if ((poeng>=50) && (poeng<=59)) {karakter = 'D';}	
	else if ((poeng>=40) && (poeng<=49)) {karakter = 'E';}
	else if (poeng<=39) {karakter = 'F';}
	JOptionPane.showMessageDialog(null, "Karakter: "+ karakter);
	}
else {JOptionPane.showMessageDialog(null, "Ugyldig poengsum");}

	}

}
