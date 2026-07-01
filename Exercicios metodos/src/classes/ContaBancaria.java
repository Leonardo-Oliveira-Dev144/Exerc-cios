package classes;

public class ContaBancaria {

    public String titular;
    public double saldo;

    public void depositar(double valor){

        saldo += valor;

        System.out.println("TITULAR DA CONTA: " + titular);
        System.out.println("FORAM DEPOSITADOS: " + valor + " REAIS");
        System.out.println("SALDO ATUAL: " + saldo);

    }

    public void sacar(double valor){


        saldo -= valor;
        System.out.println("-----------------------------------");
        System.out.println("TITULAR DA CONTA: " + titular);
        System.out.println("FORAM SACADOS: " + valor + " REAIS");
        System.out.println("SALDO ATUAL: " + saldo);
    }

}
