package exerciciosjava.exerciciosdejoptionpanelista1;

import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) 
	{
		int numero = Integer.parseInt(
		JOptionPane.showInputDialog("Digite um número"));
		
		int mult1 = numero;
		
		int mult2 = numero + numero;
		
		int mult3 = numero + numero + numero;
		
		System.out.println("Os múltiplos de " + numero + " são: " + mult1 + ", " + mult2 + ", " + mult3 + ".");

	}
}
