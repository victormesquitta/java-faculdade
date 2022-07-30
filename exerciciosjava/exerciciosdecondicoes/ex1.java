package exerciciosjava.exerciciosdecondicoes;

import java.util.Scanner;

public class ex1 {
    
    public static void main(String[] args) {
    
    int numero;
    
    Scanner leia = new Scanner(System.in);
    
    System.out.print("Digite um número: ");
    numero = leia.nextInt();
    
    if (numero > 100) {
        numero += 150;
    }    
    
    System.out.println("O resultado foi " + numero);
    }
}