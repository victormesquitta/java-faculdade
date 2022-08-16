import java.util.Scanner;

public class MultiplicacaoMatrizes {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Multiplicação de Matrizes ");
        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();

        System.out.print("Insira quantas linhas haverá na 1ª matriz: ");
        int linhamatriz1 = teclado.nextInt();

        System.out.print("Insira quantas colunas haverá na 2ª matriz: ");
        int colunamatriz2 = teclado.nextInt();

        System.out.print("Insira quantas linhas haverá na 2ª matriz // colunas haverá na 1ª matriz: ");
        int linha2coluna1 = teclado.nextInt();

        int [][] matrizA = new int [linhamatriz1][linha2coluna1];
        int [][] matrizB = new int [linha2coluna1][colunamatriz2];
        int [][] matrizC = new int [linhamatriz1][colunamatriz2];

        System.out.println();

        int somadorlinha = 0;

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                System.out.printf("Elemento da %dª linha / %dª coluna: ", i+1, j+1);
                matrizA[i][j] = teclado.nextInt();
            }
        }
        
        System.out.println();

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                System.out.printf("Elemento da %dª linha / %dª coluna: ", i+1, j+1);
                matrizB[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                System.out.printf("[ %d ]", matrizA[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                System.out.printf("[ %d ]", matrizB[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[0].length; j++) {
                for (int k = 0; k < matrizA[0].length; k++) {
                    for (int l = 0; l < matrizB.length; l++) {
                        somadorlinha += matrizA[j][l] * matrizB[l][j];
                    }
                }
                matrizC[i][j] = somadorlinha;
            }
            
        }

        System.out.println();

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC.length; j++) {
                System.out.printf("[ %d ]", matrizC[i][j]);
            }
            System.out.println();
        }





    }
    
}
