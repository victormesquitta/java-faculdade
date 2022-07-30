package exerciciosjava.exerciciosdejoptionpanelista1;

import javax.swing.JOptionPane;

public class ex4 {

		public static void main(String[] args) {
			
			String nome = JOptionPane.showInputDialog("Digite um nome");
		
			int quant = nome.length();
		
		System.out.println("O numero de caracteres do nome " + nome + " e " + quant);
				
		
		}
}
