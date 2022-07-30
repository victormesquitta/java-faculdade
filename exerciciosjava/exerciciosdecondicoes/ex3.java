package exerciciosjava.exerciciosdecondicoes;

import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args) {
        
    float altura;
    float peso;
    float massa;
    
    Scanner leia = new Scanner(System.in);
    
    System.out.print("Digite sua altura em metros: ");
    altura = leia.nextFloat();
    
    System.out.print("Digite seu peso em quilos: ");
    peso = leia.nextFloat();
    
    massa = peso / (altura * altura);
    
    if (massa < 26) {
        System.out.print("Grau de Obesidade: Normal");
    }
    
    else if (massa >= 26 && massa < 30) {
        System.out.print("Grau de Obesidade: Obesidade");
    }
    
    else if (massa >= 30){
        System.out.println("Grau de Obesidade: Obesidade Mórbida");
    }
    
    }
}