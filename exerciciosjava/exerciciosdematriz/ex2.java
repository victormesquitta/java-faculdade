package exerciciosjava.exerciciosdematriz;

public class ex2 {

    public static void main(String[] args) {
        int [][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("A transposta dessa matriz é:");
        for (int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz.length; coluna++){
                System.out.print(matriz[coluna][linha]+ " ");
            }
            System.out.println("");
        }
    }
}
