package exerciciosjava.lista1;

import java.util.Scanner;

public class ex18 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float a = teclado.nextInt();

        System.out.print("Digite um segundo número: ");
        float b = teclado.nextInt();

        System.out.print("Digite mais um número: ");
        float c = teclado.nextInt();



        float ladoa = 0;
        float ladob = 0;
        float ladoc = 0;

        if (a > b && a > c) {
            ladoa = a;
            if (b > c) {
                ladob = b;
                ladoc = c;
            }
            else{
                ladob = c;
                ladoc = b;
            }
        }
        else if (b > a && b > c) {
            ladoa = b;
            if (a > c) {
                ladob = a;
                ladoc = c;
            }
            else{
                ladob = c;
                ladoc = a;
            }
        }
        else if (c > a && c > b){
            ladoa = c;
            if (a > b){
                ladob = a;
                ladoc = b;
            }
            else {
                ladob = b;
                ladoc = a;
            }
        }
        else if ( a == b && b == c){
            ladoa = a;
            ladob = b;
            ladoc = c;
        }

        if (ladoa >= ladob + ladoc){
            System.out.print("NÃO FORMA TRIÂNGULO");
        }
        else {

            if (ladoa * ladoa == (ladob * ladob) + (ladoc * ladoc)) {
                System.out.print("TRIÂNGULO RETÂNGULO\n");
            }
            if ((ladoa * ladoa) > (ladob * ladob) + (ladoc * ladoc)) {
                System.out.print("TRIÂNGULO OBTUSÂNGULO\n");
            }
            if ((ladoa * ladoa < (ladob * ladob) + (ladoc * ladoc))) {
                System.out.print("TRIÂNGULO ACUTÂNGULO\n");
            }
            if (ladoa == ladob && ladob == ladoc) {
                System.out.print("TRIÂNGULO EQUILÁTERO\n");
            }
            if (ladoa == ladob || ladoa == ladoc || ladob == ladoc) {
                System.out.print("TRIÂNGULO ISÓSCELES\n");
            }
        }
    }
}

