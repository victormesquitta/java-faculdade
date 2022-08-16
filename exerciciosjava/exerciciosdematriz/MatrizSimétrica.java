import java.util.Scanner;

public class MatrizSimétrica {

    static int [][] matrizTransposta(int matriz[][]){ // função que vai transpor a matriz

        int [][] matriztransposta = new int [matriz[0].length][matriz.length];  // inverte o tamanho da linha com o tamanho da coluna

        for (int i = 0; i < matriztransposta.length; i++) {  // atribuindo valores à matriz transposta
            for (int j = 0; j < matriztransposta[0].length; j++) {
                matriztransposta[i][j] = matriz[j][i];
            }
        }

        return matriztransposta;
    }

    static boolean matrizSimetrica(int matriz[][], int matriztransposta[][]){

        int contador = 0;  // conta quais as posições que estão iguais entre as matrizes (normal e transposta)
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] == matriztransposta[i][j]){  // se a posição for igual, incrementa em um no contador
                    contador ++;
                }
            }
        }
        if (contador == (matriz.length * matriz.length)){
            return true;  // caso as posições estiverem iguais, retorna True
        }
        else{
            return false;  // caso as posições não estiverem iguais, retorna False
        }
    }
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Matriz Simétrica ");
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

        if (matrizSimetrica(matriz, matrizTransposta(matriz)) == true){
            System.out.println("As matrizes SÃO simétricas.");
        }
        else {
            System.out.println("As matrizes NÂO SÃO simétricas.");
        }
    }
}
