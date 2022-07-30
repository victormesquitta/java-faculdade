package exerciciosjava;

public class BalancoTrimestral {
    
    public static void main(String[] args) {

    // Valor total trimestral e média mensal de uma empresa

    int gastosJaneiro = 15000;
    int gastosFevereiro = 23000;
    int gastosMarco = 17000;
    int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
    int mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco) / 3;
    
    System.out.println("Valor dos gastos trimestrais: " + gastosTrimestre);
    System.out.println("Valor da média mensal: " + mediaMensal);
    
    }    
}