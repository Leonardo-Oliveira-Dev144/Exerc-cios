package Principais;

import classes.Pessoa;

/*Crie uma classe Pessoa e um método que apresente
essa pessoa.
 */

public class PrincipalPessoa {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "GOKU";
        pessoa.idade = 40;

        pessoa.imprimir();


    }



}
