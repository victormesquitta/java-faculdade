package exerciciosjava.exerciciosdejoptionpanelista2;

import javax.swing.JOptionPane;

public class ex3 {
    public static void main(String[] args)
    {
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano"));

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0))
        {
            System.out.print(ano + " é um ano BISSEXTO.");
        }
        else
        {
            System.out.print(ano + " NÃO é um ano bissexto.");
        }
    }
}