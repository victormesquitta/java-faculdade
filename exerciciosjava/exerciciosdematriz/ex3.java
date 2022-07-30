package exerciciosjava.exerciciosdematriz;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int [][] mat = new int [2] [3] ;

        int somadordeelementos = 0;

        for(int linha = 0; linha < mat.length; linha++){
            for(int coluna = 0; coluna < mat[linha].length; coluna++){

                System.out.printf("Informe o elemento da %dª linha, %dª coluna: ", linha + 1, coluna + 1);
                mat[linha][coluna] = teclado.nextInt();
                somadordeelementos += mat[linha][coluna];
            }
        }

        System.out.println("A soma de todos elementos da matriz resultou em " + somadordeelementos);

    }
}
