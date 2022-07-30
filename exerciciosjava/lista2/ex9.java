package exerciciosjava.lista2;

import java.util.Scanner;

public class ex9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos alunos há na turma? ");
        int quantalunos = teclado.nextInt();

        float nota;
        float soma = 0;
        float media;
        int i = 1;

        while (i <= quantalunos){
            System.out.print("Nota " + i + ": ");
            nota = teclado.nextFloat();
            soma += nota;
            i++;
        }
        media = soma / quantalunos;
        System.out.print("A média aritmética da turma foi " + media);
    }
}