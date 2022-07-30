package exerciciosjava.exerciciosdematriz;

public class ex1 {

    public static void main(String[] args) {

        int [][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][] matriz2 = {{3, 6, 4}, {7, 4, 2}, {4, 8, 1}};

        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1.length; coluna++){
                System.out.print(matriz1[linha][coluna] + matriz2[linha][coluna] + " ");
            }
            System.out.println("");
        }

    }
}
