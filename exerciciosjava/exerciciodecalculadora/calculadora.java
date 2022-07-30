package exerciciosjava.exerciciodecalculadora;

import java.util.Scanner;
import java.lang.Math;

public class calculadora {

    static double soma (double a, double b) {

        return (a + b);

    }

    static double multiplicacao (double a, double b) {

        return (a * b);

    }

    static double subtracao (double a, double b) {

        return (a - b);

    }

    static double divisao (double a, double b) {

        return (a / b);

    }

    static double raiz (double a) {

        return (Math.sqrt(a));

    }

    static double potencia (double a, double b) {

        return (Math.pow(a, b));

    }

    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);

        int resposta = 0;

        System.out.print("Digite um valor: ");
        double a = teclado.nextDouble();

        System.out.print("Digite mais um valor: ");
        double b = teclado.nextDouble();

        while (resposta != 7) {
            System.out.println("(1) Soma");
            System.out.println("(2) Multiplicação");
            System.out.println("(3) Subtração");
            System.out.println("(4) Divisão");
            System.out.println("(5) Raiz");
            System.out.println("(6) Potência");
            System.out.println("(7) Sair");
            System.out.print("Qual operação quer realizar ? ");
            resposta = teclado.nextInt();

            switch (resposta){
                case 1:
                    System.out.printf("A soma entre os números resulta em: %.2f\n", soma(a, b));
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=");
                    break;
                case 2:
                    System.out.printf("A multiplicação entre os números resulta em: %.2f\n", multiplicacao(a, b));
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=");
                    break;
                case 3:
                    System.out.printf("A subtração entre os números resulta em: %.2f\n", subtracao(a, b));
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=");
                    break;
                case 4:
                    System.out.printf("A divisão entre os números resulta em: %.2f\n", divisao(a, b));
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=");
                    break;
                case 5:
                    System.out.printf("A raiz quadrada do primeiro número resulta em: %.2f\n", raiz(a));
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=");
                    break;
                case 6:
                    System.out.printf("A potência com o primeiro número como base e o segundo como expoente resulta em: %.2f\n", potencia(a, b));
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=");
                    break;
                case 7:
                    System.out.println("Até mais!");
                    break;
            }

        }

    }
}