package oblig1;

import javax.swing.JOptionPane;

public class Oppgave3 {
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Skriv inn heltall mellom 0 og 26: ");
		int n = Integer.parseInt(input);
	if ((n>0) && (26>n)) {	
		int i = 1;
		int sum = 1;
			
		
    while (n>=i) {sum *= i; i++;}
    
   JOptionPane.showMessageDialog(null, n + "! = " + sum);
    	}
	
	else {JOptionPane.showMessageDialog(null, "Ugyldig Tall");}
	
    }
}