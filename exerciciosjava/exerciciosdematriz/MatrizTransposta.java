import java.util.Scanner;

public class MatrizTransposta {
    
    static int [][] matrizTransposta(int matriz[][]){ // função que vai transpor a matriz

        int [][] matriztransposta = new int [matriz[0].length][matriz.length];  // inverte o tamanho da linha com o tamanho da coluna

        for (int i = 0; i < matriztransposta.length; i++) {  // atribuindo valores à matriz transposta
            for (int j = 0; j < matriztransposta[0].length; j++) {
                matriztransposta[i][j] = matriz[j][i];
            }
        }

        return matriztransposta;
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Matriz Transposta");
        for (int i = 0; i < 20; i++) {
            System.out.print("=");
        }
        System.out.println();

        System.out.print("Insira a quantidade de linhas: ");
        int linhas = teclado.nextInt();

        System.out.print("Insira a quantidade de colunas: ");
        int colunas = teclado.nextInt();

        System.out.println();

        int [][] matriz = new int [linhas][colunas]; // matriz referência para transpor

        for (int i = 0; i < linhas; i++) {  // atribui valores para a matriz
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Valor da %dª linha / %dª coluna: ", i, j);
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println();
        System.out.println("Matriz");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("[ %d ] ",  matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Matriz");

        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.printf("[ %d ]",  matrizTransposta(matriz)[i][j]);
            }
            System.out.println();
        }
    }
}
