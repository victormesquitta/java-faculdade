package exerciciosjava.exerciciosdeswitchcase;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("As estruturas de repetição são:\n[a] bibliotecas padrões do java;\n[b] condições aninhadas;" +
                "\n[c] feitas para imprimir textos na tela do usuário;\n[d] loops que rodam o código contínuas vezes;\n[e] feitas para concatenar textos.");
        String questao = teclado.next();

        switch (questao){
            case "a":
                System.out.print("Resposta Incorreta");
                break;
            case "b":
                System.out.print("Resposta Incorreta");
                break;
            case "c":
                System.out.print("Resposta Incorreta");
                break;
            case "d":
                System.out.print("Resposta Correta");
                break;
            case "e":
                System.out.print("Resposta Incorreta");
                break;
        }
    }
}
