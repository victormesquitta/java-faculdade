package exerciciosjava.exerciciosdeswitchcase;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int i = 0;

        String resposta;

        do {
            System.out.println("Qual método da classe Math serve para retornar a raiz quadrada de um número ?\na) Max\nb) Min\nc) Sqrt\nd) Abs\ne) Pow");
            resposta = teclado.next();

            switch (resposta){
                case "a":
                    System.out.println("Resposta incorreta!");
                    break;
                case "b":
                    System.out.println("Resposta incorreta!");
                    break;
                case "c":
                    System.out.println("Resposta correta!");
                    i=4;
                    break;
                case "d":
                    System.out.println("Resposta incorreta!");
                    break;
                case "e":
                    System.out.println("Resposta incorreta!");
                    break;
            }
            i++;
        }
        while (i < 3);













    }
}
