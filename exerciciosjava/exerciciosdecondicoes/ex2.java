package exerciciosjava.exerciciosdecondicoes;

import java.util.Scanner;

public class ex2 {
    
    public static void main(String[] args) {
        
    int n1;
    int n2;
    
    Scanner leia = new Scanner(System.in);

    System.out.print("Digite um número: ");
    n1 = leia.nextInt();
    
    System.out.print("Digite outro número: ");
    n2 = leia.nextInt();

    if (n1 % n2 == 0) {
        System.out.print("A divisão de " + n1 + " por " + n2 + " é exata!");
    }
    else
        System.out.print("A divisão de " + n1 + " por " + n2 + " não é exata!");
    }
}