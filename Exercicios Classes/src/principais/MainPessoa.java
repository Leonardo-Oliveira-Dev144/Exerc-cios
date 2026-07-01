package principais;
import classes.Pessoa;

public class MainPessoa {

    /*Crie uma classe chamada Pessoa
    Ela deve possuir os atributos:
    nome
    idade
    No método main, crie um objeto dessa classe,
    preencha seus atributos e imprima
     */
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Goku";
        pessoa.idade = 40;

        System.out.println("NOME: " + pessoa.nome);
        System.out.println("IDADE: " + pessoa.idade);


    }




}
