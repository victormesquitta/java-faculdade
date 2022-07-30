package exerciciosjava.exerciciosdejoptionpanelista1;

import javax.swing.JOptionPane;

public class ex3 {

		public static void main(String[] args) 
		{
			int numero = Integer.parseInt(
			JOptionPane.showInputDialog("Digite um número"));
		
		for (int i=1; i<11; i++)
		{
			System.out.println(numero + "X" + i + "=" + (numero*i));
			
		}
		
				
					
		}
}
