package exerciciosjava.lista3;

import java.util.Scanner;

public class ex11 {

    static String notaemletra(float media){

        if (media >= 0 && media <= 4.9){
            return "D";
        }
        else if (media >= 5 && media <= 6.9){
            return "C";
        }
        else if (media >= 7 && media <= 8.9){
            return "B";
        }
        else if (media >= 9 && media <= 10){
            return "A";
        }
        else{
            return "Nota inválida";
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Média final do aluno: ");
        float media = teclado.nextInt();

        System.out.println("A nota em conceito resultou em: " + notaemletra(media));
    }
}
