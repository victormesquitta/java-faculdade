package exerciciosjava.exerciciosdeswitchcase;

import javax.swing.*;

public class ex1 {

    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Escolha um dia da Semana:\n[1] Domingo\n[2] Segunda-feira\n[3] Terça-feira" +
                "\n[4] Quarta-feira\n[5] Quinta-feira\n[6] Sexta-feira\n[7] Sábado"));

        switch (dia) {
            case(1):
                System.out.println("Domingo");
                break;
            case(2):
                System.out.println("Segunda-feira");
                break;
            case(3):
                System.out.println("Terça-feira");
                break;
            case(4):
                System.out.println("Quarta-feira");
                break;
            case(5):
                System.out.println("Quinta-feira");
                break;
            case(6):
                System.out.println("Sexta-feira");
                break;
            case(7):
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor inválido. Rode o programa novamente!");
                break;
        }
    }
}