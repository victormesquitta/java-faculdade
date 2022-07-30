package exerciciosjava.exerciciosdejoptionpanelista2;

import javax.swing.JOptionPane;

public class ex2 {

    public static void main(String[] args)
    {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));


        if (n1 + n2 > n3 && n1 + n3 > n2 && n2 + n3 > n1)
        {
            System.out.print("Com os valores fornecidos, é POSSÍVEL formar um triângulo.");
        }
        else
        {
            System.out.print("Com os valores fornecidos, é IMPOSSÍVEL formar um triângulo.");
        }

    }
}