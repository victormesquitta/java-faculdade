package exerciciosjava.exerciciosdejoptionpanelista1;

import javax.swing.JOptionPane;

public class ex1 {

		public static void main(String[] args) 
		{
			double n1 = Double.parseDouble(
			JOptionPane.showInputDialog("Digite um número"));
			
			double n2 = Double.parseDouble(
			JOptionPane.showInputDialog("Digite outro número"));
			
			double n3 = Double.parseDouble(
			JOptionPane.showInputDialog("Digite um último número"));
			
			double produto = n1 * n2 * n3;
				
			System.out.println("O produto dos números escolhidos é " + produto);
					
		}
}
