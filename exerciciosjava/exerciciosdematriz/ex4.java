package exerciciosjava.exerciciosdematriz;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int [][] matriz = new int [4][4];

        int somadordadiagonal = 0;

        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.printf("Informe o elemento da %dª linha, %dª coluna: ", linha + 1, coluna + 1);
                matriz[linha][coluna] = teclado.nextInt();
                if(linha == coluna){
                    somadordadiagonal += matriz[linha][coluna];
                }
            }
        }
        System.out.println("A soma dos elementos presentes na diagonal principal resultou em " + somadordadiagonal);
    }
}
