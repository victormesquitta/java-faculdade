import java.util.Scanner;

public class MatrizDevolveMaior {

    static int maiorElemento(int matriz[][]){  // função que retornará o maior elemento da matriz

        int maior = 0;

        for (int i = 0; i < matriz.length; i++) {  // analisa qual o maior elemento
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == 0 && j == 0){
                    maior = matriz[0][0];
                }
                else if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        return maior;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Maior Elemento da Matriz");
        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();

        System.out.print("Insira a quantidade de linhas dessa matriz: ");
        int linhas = teclado.nextInt();

        System.out.print("Insira a quantidade de colunas dessa matriz: ");
        int colunas = teclado.nextInt();

        int [][] matriz = new int [linhas][colunas];

        for (int i = 0; i < linhas; i++) {  // atribui valores a cada posição da matriz
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Valor da %dª linha / %dª coluna: ", i+1, j+1);
                matriz[i][j] = teclado.nextInt();
            }
        }
        System.out.println();
        System.out.printf("O maior elemento da matriz foi %d.", maiorElemento(matriz));
    }
}
