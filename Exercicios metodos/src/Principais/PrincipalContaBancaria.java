package Principais;

import classes.ContaBancaria;

public class PrincipalContaBancaria {


    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.titular = "GOKU";
        contaBancaria.saldo = 300;

        contaBancaria.depositar(300);
        contaBancaria.sacar(100);




    }


}
