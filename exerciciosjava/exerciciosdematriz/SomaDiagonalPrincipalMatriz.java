import java.util.Scanner;

public class SomaDiagonalPrincipalMatriz {

    static int somaDiagonal(int matriz[][]){  // função que retorna a soma da diagonal principal
        
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {  
            for (int j = 0; j < matriz.length; j++) {  
                if (i == j){                           // soma somente os elementos da diagonal principal
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Matriz - Soma da Diagonal ");
        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();

        System.out.print("Digite a dimensão da matriz: ");
        int dimensaomatriz = teclado.nextInt();

        int [][] matriz = new int [dimensaomatriz][dimensaomatriz];

        for (int i = 0; i < dimensaomatriz; i++) {
            for (int j = 0; j < dimensaomatriz; j++) {
                System.out.printf("Valor da %dª linha / %dª coluna: ", i+1, j+1);
                matriz[i][j] = teclado.nextInt();
            }
        }
        System.out.println();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("[ %d ]", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("A soma da diagonal é " + somaDiagonal(matriz));
    }
}
