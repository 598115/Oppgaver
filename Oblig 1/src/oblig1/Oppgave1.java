package oblig1;

import javax.swing.JOptionPane;

public class Oppgave1 {

	public static void main(String[] args) {
		
	String inputBrutto = JOptionPane.showInputDialog("Skriv inn bruttolønn");
	double brutto = Double.parseDouble(inputBrutto);
	double resultat;
	String trinn;
	
	if (brutto<190350) {resultat = brutto; trinn= "Ingen";}
	else if (brutto<267900) {resultat = brutto*0.983; trinn="1,7%";}
	else if (brutto<643800) {resultat = brutto*0.96; trinn="4,0%";}
	else if (brutto<969200) {resultat = brutto*0.866; trinn="13,4%";}
	else if (brutto<2000000) {resultat = brutto*0.836; trinn="16,4%";}
	else {resultat = brutto*0.826; trinn= "17,4%";}
	
	JOptionPane.showMessageDialog(null, trinn + " trinnskatt " + "\nBrutto etter trinnskat = " + resultat+"kr");
	
		

	}

}
