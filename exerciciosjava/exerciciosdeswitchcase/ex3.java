package exerciciosjava.exerciciosdeswitchcase;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Bem-vindo ao jogo.\n");

        int opcao;

        do {
            System.out.print("Escolha uma opção:\n1- Instruções\n2- Jogar\n3- Créditos\n4- Sair\nOpção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Instruções\n Tenha um monitor, um teclado e um mouse. O resto é com você.\n");
                    break;
                case 2:
                    System.out.print("Jogar\n Agora é sua vez de jogar!\n");
                    break;
                case 3:
                    System.out.print("Créditos\n Dirigido por: Victor Mesquita Lima de Santana\n");
                    break;
                case 4:
                    System.out.print("Sair\n Até mais!");
                    break;
            }
        }
        while (opcao != 4);
    }
}