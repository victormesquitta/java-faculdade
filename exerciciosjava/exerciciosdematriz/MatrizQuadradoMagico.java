import java.util.Scanner;

public class MatrizQuadradoMagico {

    static String verificaQuadradoMagico(int [][] matriz){
        
        // Como temos várias linhas e colunas, armazenamos essas somas em vetores
        int [] resultados_soma_linhas = new int [matriz.length];  
        int [] resultados_soma_colunas = new int [matriz.length];

        // Por só existir uma diagonal principal e uma secundária, utlizamos uma variável mesmo
        int somatoria_diagonal_principal = 0;
        int somatoria_diagonal_secundaria = 0;


        // Soma de cada Linha
        for (int i = 0; i < matriz.length; i++) {

            int somatoria_linha = 0;

            for (int j = 0; j < matriz.length; j++) {
                somatoria_linha += matriz[i][j];
            }
            resultados_soma_linhas[i] = somatoria_linha;
        }
        for (int i = 1; i < resultados_soma_linhas.length; i++) {
            if (resultados_soma_linhas[i] != resultados_soma_linhas[i-1]) {
                return "A matriz gerada NÃO é um quadrado mágico!";
            }
        }
        

        // Soma de cada Coluna
        for (int i = 0; i < matriz.length; i++) {

            int somatoria_coluna = 0;

            for (int j = 0; j < matriz.length; j++) {
                somatoria_coluna += matriz[j][i];
            }
            resultados_soma_colunas[i] = somatoria_coluna;
        }
        
        for (int i = 1; i < resultados_soma_colunas.length; i++) {
            if (resultados_soma_colunas[i] != resultados_soma_colunas[i-1]) {
                return "A matriz gerada NÃO é um quadrado mágico!";
            }
        }
    
        // Soma da Diagonal Principal
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {
                if (i == j){
                    somatoria_diagonal_principal += matriz[i][j];
                }
            }
        }

        // Soma da Diagonal Secundária
            for (int i = 0; i < matriz.length; i++) {
                for (int j = matriz.length-1; j >= 0; j--) {
                    if (i == 0){
                        somatoria_diagonal_secundaria += matriz[j][matriz.length - (i+1)];
                    }
                }
            }

        // Verificando a condição de igualdade - se todos os valores estão iguais

        if (resultados_soma_linhas[0] == resultados_soma_colunas[0] && resultados_soma_linhas[0] == somatoria_diagonal_principal && resultados_soma_linhas[0] == somatoria_diagonal_secundaria) {
            return "A matriz gerada É um quadrado mágico!";
        }
        else {
            return "A matriz gerada NÃO é um quadrado mágico!";
        }
    }


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Quadrado Mágico de Matrizes ");
        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();

        System.out.print("Dimensão da matriz: ");
        int dimensao = teclado.nextInt();

        int [][] matriz = new int [dimensao][dimensao];

        for (int i = 0; i < matriz.length; i++) {  // Atribui valores à matriz
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("Valor da %dª linha / %dª coluna: ", i+1, j+1);
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < matriz.length; i++) {  // Imprimi a matriz gerada
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("[ %d ]", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println(verificaQuadradoMagico(matriz));
    }
}
