package exerciciosjava.exerciciosdejoptionpanelista2;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args)
	{
		float desconto;
		
		float preco = Float.parseFloat(JOptionPane.showInputDialog("Digite um número"));
		
		if (preco >= 300)
		{
			desconto = preco * 0.2f;
			preco =  preco * 0.8f;
		}
		else {
			desconto = preco * 0.15f;
			preco = preco * 0.85f;
		}
		
		System.out.println("O novo preco e de R$" + preco + " e o desconto foi de R$" + desconto);
	}
}
