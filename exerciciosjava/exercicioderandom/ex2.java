package exerciciosjava.exercicioderandom;

import java.util.Random;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Random randomizador = new Random();
        int numeroaleatorio = randomizador.nextInt(100) + 1;

        int resposta = 0;
        System.out.println(numeroaleatorio);
        for (int i = 0; i < 5; i++) {

            System.out.print("Digite um número para tentar acertar o número oculto: ");

            resposta = teclado.nextInt();

            if (resposta > numeroaleatorio){
                System.out.println("O valor é MENOR que o digitado!");
            }
            else if (resposta < numeroaleatorio){
                System.out.println("O valor é MAIOR que o digitado!");
            }
            if (-numeroaleatorio + resposta == 1 || -numeroaleatorio + resposta == -1) {
                System.out.println("TÁ QUENTE!");
            }
            else if (numeroaleatorio - resposta == 0) {
                System.out.println("Parabéns, você ganhou o jogo!");
                break;
            }
        }
        if (resposta != numeroaleatorio) {
            System.out.println("Game Over!");
        }
    }
}
