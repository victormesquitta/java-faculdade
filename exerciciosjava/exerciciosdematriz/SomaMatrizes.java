import java.util.Scanner;

public class SomaMatrizes {

    static int [][] somaMatrizes(int matrizA[][], int matrizB[][]){  // soma os elementos de ambas as matrizes e os anexa em uma terceira matriz

        int [][] matrizC = new int [matrizA.length][matrizB.length];
    
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC.length; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizC;
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Soma de Matrizes ");
        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();

        System.out.print("Digite a dimensão das matrizes: ");
        int dimensaomatriz = teclado.nextInt();

        int [][] matrizA = new int [dimensaomatriz][dimensaomatriz];
        int [][] matrizB = new int [dimensaomatriz][dimensaomatriz];

        for (int i = 0; i < dimensaomatriz; i++) {  // atribui valores para a primeira matriz
            for (int j = 0; j < dimensaomatriz; j++) {
                System.out.printf("Valor da %dª linha / %dª coluna: ", i+1, j+1);
                matrizA[i][j] = teclado.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < matrizB.length; i++) {  // imprimi a primeira matriz
            for (int j = 0; j < matrizB.length; j++) {
                System.out.printf("[ %d ]", matrizA[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < dimensaomatriz; i++) {  // atribui valores para a segunda matriz
            for (int j = 0; j < dimensaomatriz; j++) {
                System.out.printf("Valor da %dª linha / %dª coluna: ", i+1, j+1);
                matrizB[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < matrizB.length; i++) {  // imprimi a segunda matriz
            for (int j = 0; j < matrizB.length; j++) {
                System.out.printf("[ %d ]", matrizB[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("A soma das matrizes resultou nessa matriz:");

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.printf("[ %d ]", somaMatrizes(matrizA, matrizB)[i][j]);
            }
            System.out.println();
        }   

    }
    
}
