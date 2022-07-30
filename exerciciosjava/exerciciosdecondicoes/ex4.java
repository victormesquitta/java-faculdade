package exerciciosjava.exerciciosdecondicoes;

import java.util.Scanner;

public class ex4 {
    
    public static void main(String[] args) {
        
    float kwh;
    float conta = 0;
    
    Scanner leia = new Scanner(System.in);
    
    System.out.print("Quantidade de kWh gastos: ");
    kwh = leia.nextFloat();
    
    if (kwh < 150) {
        conta = (float) (11.90 + (0.2 * kwh));
    }
    else if (kwh >= 150 && kwh < 500){
        conta = (float) (11.90 + (0.25 * kwh));
    }
    else if (kwh >= 500){
        conta = (float) (11.90 + (0.30 * kwh));
    }
    
    System.out.print("o valor da conta foi de R$" + conta);
    }
}