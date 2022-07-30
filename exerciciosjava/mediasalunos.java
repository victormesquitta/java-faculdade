package exerciciosjava;

import java.util.Scanner;

public class mediasalunos {
    
	public static void main(String[] args) {

        // Média de notas de um aluno

        float p1;
        float p2;
        float p3;
        float p4;
        float media;
        
        Scanner leia = new Scanner (System.in);
        
        // Esses são os dados de entrada do código
        System.out.print("Digite a nota da P1: ");
        p1 = leia.nextFloat();
        
        System.out.print("Digite a nota da P2: ");
        p2 = leia.nextFloat();
        
        System.out.print("Digite a nota da P3: ");
        p3 = leia.nextFloat();
        
        System.out.print("Digite a nota da P4: ");
        p4 = leia.nextFloat();
        
        // Esses é o processamento do código
        media = ((p1 + p2 + p3 + p4) / 4f);
    
        // Esses são os dados de saída do código
        System.out.println("A média das notas é " + media);
	}
}


